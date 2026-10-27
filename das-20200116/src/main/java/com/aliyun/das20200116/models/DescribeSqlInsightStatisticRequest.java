// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlInsightStatisticRequest extends TeaModel {
    /**
     * <p>The sort order. Default value: <strong>false</strong> (descending order). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: ascending order.</li>
     * <li><strong>false</strong>: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The name of the database used to filter the results.</p>
     * <blockquote>
     * <p>In the aggregation storage links of some instances, you can specify multiple database names separated by commas. In other links, you can specify only a single database name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Specifies whether to populate time series trend data for each statistical result, which corresponds to the <strong>Trend</strong> field in the response. Default value: <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: populates trend data.</li>
     * <li><strong>false</strong>: does not populate trend data.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to true, the system additionally queries data for each time slice for each result, which significantly increases the query overhead. If the trend filling capability is not enabled for the instance, this parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DoFillTrend")
    public Boolean doFillTrend;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in milliseconds. The system rounds up the value to the nearest minute.</p>
     * <blockquote>
     * <p>The time span between <strong>EndTime</strong> and <strong>StartTime</strong> cannot exceed 7 days. If <strong>EndTime</strong> is earlier than the time when the SQL Explorer feature was enabled for the instance, an error indicating that the query time is earlier than the available time is returned.</p>
     * </blockquote>
     * <blockquote>
     * <p>Due to delays in data aggregation, the actual effective value is truncated to a few minutes before the current time. Therefore, data from the most recent few minutes may not be queried.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718600000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of structured filter conditions. The conditions are passed as key-value pairs. The POP format is <strong>Filters.N.Key</strong> and <strong>Filters.N.Value</strong>. A maximum of 100 pairs can be specified. <strong>Key</strong> is not case-sensitive. Entries with an empty <strong>Value</strong> are ignored. Valid values of <strong>Key</strong> that take effect in this operation:</p>
     * <ul>
     * <li><strong>keyWord</strong>: the keywords. The keywords are split into multiple words by whitespace characters and take effect together with the <strong>Keyword</strong> parameter.</li>
     * <li><strong>hostAddress</strong>: the access source addresses. Separate multiple addresses with commas. This key takes effect together with <strong>TemplateId</strong> when <strong>Type</strong> is set to <strong>OriginHost</strong>.</li>
     * <li><strong>accountName</strong>: the database usernames. Separate multiple usernames with commas.</li>
     * <li><strong>dbName</strong>: the database names. Separate multiple names with commas. This key takes effect together with the <strong>DbName</strong> parameter.</li>
     * <li><strong>sqlType</strong>: the SQL statement types. Separate multiple types with commas. This key takes effect together with the <strong>SqlType</strong> parameter.</li>
     * <li><strong>sqlId</strong>: the SQL template IDs. Separate multiple IDs with commas. This key takes effect together with <strong>TemplateId</strong> when <strong>Type</strong> is set to <strong>SQL</strong>.</li>
     * <li><strong>insRole</strong>: the primary/secondary role. Valid values are <strong>master</strong> and <strong>slave</strong>. This value is case-sensitive.</li>
     * </ul>
     * <blockquote>
     * <p>If you specify a <strong>Key</strong> other than the preceding values, the key is ignored.</p>
     * </blockquote>
     * <blockquote>
     * <p>This parameter takes effect only in the aggregation storage links of some instances. In other links, this parameter is completely ignored.</p>
     * </blockquote>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSqlInsightStatisticRequestFilters> filters;

    /**
     * <p>The database instance ID.</p>
     * <blockquote>
     * <p>This operation supports ApsaraDB RDS for MySQL, PolarDB for MySQL, PolarDB-X, ApsaraDB RDS for PostgreSQL, PolarDB for PostgreSQL, ApsaraDB RDS for SQL Server, and Lindorm instances that have the SQL Explorer feature enabled. MongoDB and Redis instances are not supported. If you invoke this operation for unsupported instances, a fault indicating that the operation is not supported is returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1q6f9z5xxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The idempotent ID for querying SQL Explorer data. You do not need to specify this parameter for common queries.</p>
     * 
     * <strong>example:</strong>
     * <p>9a4f5c4494dbd6713185d87a97aa53e8</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The keywords used to retrieve SQL templates by fuzzy match based on the SQL template content. Separate multiple keywords with spaces. The system first performs keyword match to retrieve up to 1,000 corresponding SQL templates, and then performs aggregation statistics based on these templates. If no matching templates are found, an empty list is returned.</p>
     * <blockquote>
     * <p>This parameter does not take effect when <strong>Type</strong> is set to <strong>SQL</strong> and <strong>TemplateId</strong> is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>t_order</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The ID of the node in the instance. This parameter is used to narrow the statistics scope to the specified node. Only a single node ID is supported. Multiple node IDs separated by commas are not supported.</p>
     * <blockquote>
     * <p>This parameter is required only for instances that consist of multiple nodes, such as PolarDB-X and Lindorm instances. You can ignore this parameter for single-node instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp1xxxxxxxxxxxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The field by which to sort the results. If this parameter is not specified or an unsupported value is specified, the results are sorted by <strong>rt</strong> (total response time). Valid values:</p>
     * <ul>
     * <li>Response time: <strong>rt</strong>, <strong>avgRt</strong>, <strong>maxRt</strong>, <strong>minRt</strong>, and <strong>rtRate</strong>.</li>
     * <li>Executions: <strong>count</strong>, <strong>countRate</strong>, and <strong>timestamp</strong>.</li>
     * <li>Scanned rows: <strong>rowsExamined</strong> and <strong>avgRowsExamined</strong>.</li>
     * <li>Returned rows: <strong>rowsReturned</strong>, <strong>totalRowsReturned</strong>, <strong>avgRowsReturned</strong>, <strong>maxRowsReturned</strong>, <strong>minRowsReturned</strong>, <strong>maxRowReturned</strong>, and <strong>minRowReturned</strong>.</li>
     * <li>Logical reads: <strong>logicalRead</strong>, <strong>totalLogicalRead</strong>, <strong>avgLogicalRead</strong>, <strong>maxLogicalRead</strong>, and <strong>minLogicalRead</strong>.</li>
     * <li>Physical reads: <strong>physicalRead</strong>, <strong>totalPhysicalRead</strong>, <strong>avgPhysicalRead</strong>, <strong>maxPhysicalRead</strong>, and <strong>minPhysicalRead</strong>.</li>
     * <li>Logical writes (valid only for SQL Server instances): <strong>writes</strong>, <strong>totalWrites</strong>, <strong>avgWrites</strong>, <strong>maxWrites</strong>, and <strong>minWrites</strong>.</li>
     * <li>CPU time (valid only for SQL Server instances): <strong>totalCpuTime</strong>, <strong>avgCpuTime</strong>, <strong>maxCpuTime</strong>, and <strong>minCpuTime</strong>.</li>
     * <li>PolarDB-X compute nodes (valid only when <strong>Role</strong> is set to <strong>polarx_cn</strong>): <strong>scnt</strong>, <strong>avgScnt</strong>, <strong>rows</strong>, <strong>avgRows</strong>, <strong>frows</strong>, and <strong>avgFrows</strong>.</li>
     * <li>Affected rows (valid only for Lindorm instances): <strong>totalAffectRows</strong> and <strong>avgAffectRows</strong>.</li>
     * </ul>
     * <blockquote>
     * <p><strong>timestamp</strong> indicates that the results are sorted by data timestamp. The timestamp is a UNIX timestamp in milliseconds.</p>
     * </blockquote>
     * <blockquote>
     * <p>Only the first letter is case-insensitive. The remaining characters must exactly match the preceding values. For example, <strong>AvgRt</strong> is valid, but <strong>avgrt</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rt</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page 1. If this parameter is not specified, the default value 1 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of statistical entries to return on each page. If this parameter is not specified, the default value 10 is used. The maximum value is 2000.</p>
     * <blockquote>
     * <p>If the value exceeds 2000, an InvalidParams error is returned instead of being truncated.</p>
     * </blockquote>
     * <blockquote>
     * <p>When statistics are aggregated by access source or database user (when <strong>Type</strong> is set to <strong>FullRequestOrigin</strong> or <strong>FullRequestUser</strong>), a value greater than 100 is reset to 10 in some aggregation storage links.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role of the instance node. The value is not case-sensitive. If this parameter is not specified, the role is automatically parsed based on <strong>InstanceId</strong>. Valid values:</p>
     * <ul>
     * <li><strong>polarx_cn</strong>: PolarDB-X compute node.</li>
     * <li><strong>polarx_dn</strong>: PolarDB-X storage node.</li>
     * </ul>
     * <blockquote>
     * <p>This value affects the scope of returned fields. For example, <strong>Scnt</strong>, <strong>Rows</strong>, and <strong>Frows</strong> are returned only when the value is <strong>polarx_cn</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>polarx_cn</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The SQL statement type used to filter the results. Valid values:</p>
     * <ul>
     * <li><strong>select</strong></li>
     * <li><strong>insert</strong></li>
     * <li><strong>update</strong></li>
     * <li><strong>delete</strong></li>
     * </ul>
     * <blockquote>
     * <p>The values must be in lowercase. In the aggregation storage links of some instances, you can specify multiple values separated by commas. In other links, you can specify only a single value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in milliseconds. The system rounds down the value to the nearest minute.</p>
     * <blockquote>
     * <p>The start time cannot be more than 30 days before the current time. If the specified start time is earlier than the time when the SQL Explorer feature was enabled for the instance, the start time is automatically adjusted to the enabling time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718000000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The identifier of the statistics object. The meaning varies based on the value of <strong>Type</strong>. Valid values:</p>
     * <ul>
     * <li>When <strong>Type</strong> is set to <strong>SQL</strong>: specify the SQL template ID, which is the <strong>SqlId</strong> in the response.</li>
     * <li>When <strong>Type</strong> is set to <strong>OriginHost</strong>: specify the access source address.</li>
     * <li>When <strong>Type</strong> is set to <strong>User</strong>: specify the database username.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter does not take effect when <strong>Type</strong> is empty, <strong>FullRequestOrigin</strong>, or <strong>FullRequestUser</strong>.</p>
     * </blockquote>
     * <blockquote>
     * <p>When <strong>Type</strong> is set to <strong>SQL</strong>, you can specify multiple template IDs separated by commas. In this case, <strong>Keyword</strong> does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9f8e7d6c5b4a3210</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The aggregation or filter dimension for statistics. The value is not case-sensitive. If this parameter is not specified, the statistics are aggregated by SQL template by default. Valid values:</p>
     * <ul>
     * <li><strong>FullRequestOrigin</strong>: aggregates statistics by access source address.</li>
     * <li><strong>FullRequestUser</strong>: aggregates statistics by database user.</li>
     * <li><strong>SQL</strong>: filters statistics by SQL template. You must also specify <strong>TemplateId</strong> as the SQL template ID.</li>
     * <li><strong>OriginHost</strong>: filters statistics by access source. You must also specify <strong>TemplateId</strong> as the source address.</li>
     * <li><strong>User</strong>: filters statistics by database user. You must also specify <strong>TemplateId</strong> as the username.</li>
     * </ul>
     * <blockquote>
     * <p>If you specify a value other than the preceding values, an InvalidParams error is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSqlInsightStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlInsightStatisticRequest self = new DescribeSqlInsightStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlInsightStatisticRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public DescribeSqlInsightStatisticRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DescribeSqlInsightStatisticRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeSqlInsightStatisticRequest setDoFillTrend(Boolean doFillTrend) {
        this.doFillTrend = doFillTrend;
        return this;
    }
    public Boolean getDoFillTrend() {
        return this.doFillTrend;
    }

    public DescribeSqlInsightStatisticRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSqlInsightStatisticRequest setFilters(java.util.List<DescribeSqlInsightStatisticRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeSqlInsightStatisticRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeSqlInsightStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSqlInsightStatisticRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeSqlInsightStatisticRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeSqlInsightStatisticRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeSqlInsightStatisticRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeSqlInsightStatisticRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeSqlInsightStatisticRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlInsightStatisticRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeSqlInsightStatisticRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public DescribeSqlInsightStatisticRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSqlInsightStatisticRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DescribeSqlInsightStatisticRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeSqlInsightStatisticRequestFilters extends TeaModel {
        /**
         * <p>The key of the conditional filter. The key is not case-sensitive. For active values, see the metric description of the <strong>Filters</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>sqlType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition. If the value is null or an empty string, the filter condition is ignored. Separate multiple values with commas. The specific upper limit depends on the corresponding key.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSqlInsightStatisticRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlInsightStatisticRequestFilters self = new DescribeSqlInsightStatisticRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSqlInsightStatisticRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSqlInsightStatisticRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
