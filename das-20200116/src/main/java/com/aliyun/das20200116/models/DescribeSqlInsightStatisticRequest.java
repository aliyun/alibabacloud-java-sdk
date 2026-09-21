// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlInsightStatisticRequest extends TeaModel {
    /**
     * <p>The sort direction. Default value: <strong>false</strong> (descending). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: ascending.</li>
     * <li><strong>false</strong>: descending.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The database name used for filtering.</p>
     * <blockquote>
     * <p>In certain aggregation storage pipelines, you can specify multiple database names separated by commas. In other pipelines, only a single database name is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Specifies whether to populate time series trend data for each statistical entry, which corresponds to the <strong>Trend</strong> field in the response. Default value: <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Populates trend data.</li>
     * <li><strong>false</strong>: Does not populate trend data.</li>
     * </ul>
     * <blockquote>
     * <p>Enabling this option triggers additional queries for each time slice per entry, which significantly increases query overhead. If the trend filling capability is not enabled for the instance, this parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DoFillTrend")
    public Boolean doFillTrend;

    /**
     * <p>The end time of the query. Specify a UNIX timestamp in milliseconds. The system rounds up to the nearest minute.</p>
     * <blockquote>
     * <p>The span between this value and <strong>StartTime</strong> must not exceed 7 days. If <strong>EndTime</strong> is earlier than the time when SQL Explorer was enabled for the instance, an error indicating that the query time is earlier than the available time is returned.</p>
     * </blockquote>
     * <blockquote>
     * <p>Because data aggregation involves latency, the actual effective value is trimmed to a few minutes before the current time. Data from the most recent minutes may not be available.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718600000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of structured filter conditions, specified as Key/Value pairs. The POP format is <strong>Filters.N.Key</strong> and <strong>Filters.N.Value</strong>, with a maximum of 100 pairs. <strong>Key</strong> is case-insensitive. Entries with an empty <strong>Value</strong> are ignored. Valid values of <strong>Key</strong> for this operation:</p>
     * <ul>
     * <li><strong>keyWord</strong>: the keyword. The value is split by whitespace into multiple words and takes effect together with the <strong>Keyword</strong> parameter.</li>
     * <li><strong>hostAddress</strong>: the access source address. Separate multiple values with commas. This takes effect together with <strong>TemplateId</strong> when <strong>Type</strong> is set to <strong>OriginHost</strong>.</li>
     * <li><strong>accountName</strong>: the database username. Separate multiple values with commas.</li>
     * <li><strong>dbName</strong>: the database name. Separate multiple values with commas. This takes effect together with the <strong>DbName</strong> parameter.</li>
     * <li><strong>sqlType</strong>: the SQL type. Separate multiple values with commas. This takes effect together with the <strong>SqlType</strong> parameter.</li>
     * <li><strong>sqlId</strong>: the SQL template ID. Separate multiple values with commas. This takes effect together with <strong>TemplateId</strong> when <strong>Type</strong> is set to <strong>SQL</strong>.</li>
     * <li><strong>insRole</strong>: the primary/secondary role. Valid values: <strong>master</strong> and <strong>slave</strong>. These values are case-sensitive.</li>
     * </ul>
     * <blockquote>
     * <p>Any <strong>Key</strong> value other than the preceding values is ignored.</p>
     * </blockquote>
     * <blockquote>
     * <p>This parameter takes effect only in certain aggregation storage pipelines. In other pipelines, this parameter is entirely ignored.</p>
     * </blockquote>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSqlInsightStatisticRequestFilters> filters;

    /**
     * <p>The database instance ID.</p>
     * <blockquote>
     * <p>This operation supports RDS for MySQL, PolarDB for MySQL, PolarDB-X, RDS for PostgreSQL, PolarDB for PostgreSQL, RDS for SQL Server, and Lindorm instances that have SQL Explorer enabled. MongoDB and Redis instances are not supported. Calling this operation for unsupported instances returns an error indicating that the operation is not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1q6f9z5xxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The idempotency ID for the SQL Explorer data query. This parameter is not required for regular queries.</p>
     * 
     * <strong>example:</strong>
     * <p>9a4f5c4494dbd6713185d87a97aa53e8</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The keyword for fuzzy retrieve on SQL template content. Separate multiple keywords with spaces. The system first performs keyword match to find the corresponding SQL templates (up to 1,000 templates), and then performs aggregation statistics based on these templates. If no templates match, an empty list is returned.</p>
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
     * <p>The node ID of the instance. This parameter narrows the statistical scope to the specified node. Only a single node ID is supported. You cannot specify multiple node IDs separated by commas.</p>
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
     * <p>The field used for sorting. If this parameter is not specified or an unsupported value is specified, the results are sorted by <strong>rt</strong> (total response time). Valid values:</p>
     * <ul>
     * <li>Response time: <strong>rt</strong>, <strong>avgRt</strong>, <strong>maxRt</strong>, <strong>minRt</strong>, <strong>rtRate</strong>.</li>
     * <li>Executions: <strong>count</strong>, <strong>countRate</strong>, <strong>timestamp</strong>.</li>
     * <li>Scan rows: <strong>rowsExamined</strong>, <strong>avgRowsExamined</strong>.</li>
     * <li>Returned rows: <strong>rowsReturned</strong>, <strong>totalRowsReturned</strong>, <strong>avgRowsReturned</strong>, <strong>maxRowsReturned</strong>, <strong>minRowsReturned</strong>, <strong>maxRowReturned</strong>, <strong>minRowReturned</strong>.</li>
     * <li>Logical reads: <strong>logicalRead</strong>, <strong>totalLogicalRead</strong>, <strong>avgLogicalRead</strong>, <strong>maxLogicalRead</strong>, <strong>minLogicalRead</strong>.</li>
     * <li>Physical reads: <strong>physicalRead</strong>, <strong>totalPhysicalRead</strong>, <strong>avgPhysicalRead</strong>, <strong>maxPhysicalRead</strong>, <strong>minPhysicalRead</strong>.</li>
     * <li>Logical writes (valid only for SQL Server instances): <strong>writes</strong>, <strong>totalWrites</strong>, <strong>avgWrites</strong>, <strong>maxWrites</strong>, <strong>minWrites</strong>.</li>
     * <li>CPU time (valid only for SQL Server instances): <strong>totalCpuTime</strong>, <strong>avgCpuTime</strong>, <strong>maxCpuTime</strong>, <strong>minCpuTime</strong>.</li>
     * <li>PolarDB-X compute node metrics (valid only when <strong>Role</strong> is set to <strong>polarx_cn</strong>): <strong>scnt</strong>, <strong>avgScnt</strong>, <strong>rows</strong>, <strong>avgRows</strong>, <strong>frows</strong>, <strong>avgFrows</strong>.</li>
     * <li>Affected rows (valid only for Lindorm instances): <strong>totalAffectRows</strong>, <strong>avgAffectRows</strong>.</li>
     * </ul>
     * <blockquote>
     * <p><strong>timestamp</strong> sorts by the data timestamp, which is a millisecond-level UNIX timestamp.</p>
     * </blockquote>
     * <blockquote>
     * <p>Only the first letter is case-insensitive. The remaining characters must exactly match the preceding values. For example, <strong>AvgRt</strong> is valid but <strong>avgrt</strong> is not.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rt</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of statistical entries per page. Default value: 10. Maximum value: 2000.</p>
     * <blockquote>
     * <p>A value greater than 2000 returns an InvalidParams error instead of being trimmed.</p>
     * </blockquote>
     * <blockquote>
     * <p>When aggregating by access source or database user (<strong>Type</strong> is set to <strong>FullRequestOrigin</strong> or <strong>FullRequestUser</strong>), a value greater than 100 may be reset to 10 in certain aggregation storage pipelines.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role of the instance node. The value is case-insensitive. If this parameter is not specified, the role is automatically resolved from <strong>InstanceId</strong>. Valid values:</p>
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
     * <p>The SQL type used for filtering. Valid values:</p>
     * <ul>
     * <li><strong>select</strong></li>
     * <li><strong>insert</strong></li>
     * <li><strong>update</strong></li>
     * <li><strong>delete</strong></li>
     * </ul>
     * <blockquote>
     * <p>Values are lowercase. In certain aggregation storage pipelines, you can specify multiple values separated by commas. In other pipelines, only a single value is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the query. Specify a UNIX timestamp in milliseconds. The system rounds down to the nearest minute.</p>
     * <blockquote>
     * <p>The value must be within the last 30 days. If the value is earlier than the time when SQL Explorer was enabled for the instance, it is automatically adjusted to the time when SQL Explorer was enabled.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718000000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The identifier of the statistical object. The meaning varies depending on the value of <strong>Type</strong>. Valid values:</p>
     * <ul>
     * <li>When <strong>Type</strong> is set to <strong>SQL</strong>: the SQL template ID, which corresponds to <strong>SqlId</strong> in the response.</li>
     * <li>When <strong>Type</strong> is set to <strong>OriginHost</strong>: the access source address.</li>
     * <li>When <strong>Type</strong> is set to <strong>User</strong>: the database username.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter does not take effect when <strong>Type</strong> is not specified, or is set to <strong>FullRequestOrigin</strong> or <strong>FullRequestUser</strong>.</p>
     * </blockquote>
     * <blockquote>
     * <p>When <strong>Type</strong> is set to <strong>SQL</strong>, you can specify multiple template IDs separated by commas. In this case, the <strong>Keyword</strong> parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9f8e7d6c5b4a3210</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The aggregation or filter dimension for statistics. The value is case-insensitive. If this parameter is not specified, statistics are aggregated by SQL template by default. Valid values:</p>
     * <ul>
     * <li><strong>FullRequestOrigin</strong>: Aggregates by access source address.</li>
     * <li><strong>FullRequestUser</strong>: Aggregates by database user.</li>
     * <li><strong>SQL</strong>: Filters by SQL template. You must also specify <strong>TemplateId</strong> as the SQL template ID.</li>
     * <li><strong>OriginHost</strong>: Filters by access source. You must also specify <strong>TemplateId</strong> as the source address.</li>
     * <li><strong>User</strong>: Filters by database user. You must also specify <strong>TemplateId</strong> as the username.</li>
     * </ul>
     * <blockquote>
     * <p>Specifying a value other than the preceding values returns an InvalidParams error.</p>
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
         * <p>The key of the filter condition. The value is case-insensitive. For valid values, see the description of the <strong>Filters</strong> parameter.</p>
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
