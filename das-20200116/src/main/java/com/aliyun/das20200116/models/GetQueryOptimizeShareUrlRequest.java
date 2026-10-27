// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeShareUrlRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order. Default value: <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The names of the databases to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: RDS MySQL</li>
     * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL</li>
     * <li><strong>PostgreSQL</strong>: RDS PostgreSQL</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance IDs. Separate multiple instance IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The keywords in the SQL text. Separate multiple keywords with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>select update</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The logical relationship between multiple keywords in the SQL text. Valid values:</p>
     * <ul>
     * <li><strong>or</strong>: The OR logical relationship.</li>
     * <li><strong>and</strong>: The AND logical relationship.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>Specifies whether to query only the SQL statements that need to be optimized. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyOptimizedSql")
    public Boolean onlyOptimizedSql;

    /**
     * <p>The field by which to sort the results. Default value: <strong>count</strong>. Valid values:</p>
     * <ul>
     * <li><strong>count</strong>: The number of executions.</li>
     * <li><strong>maxQueryTime</strong>: The maximum execution time.</li>
     * <li><strong>avgQueryTime</strong>: The average execution time.</li>
     * <li><strong>maxLockTime</strong>: The maximum lock wait time.</li>
     * <li><strong>avgLockTime</strong>: The average lock wait time.</li>
     * <li><strong>maxRowsExamined</strong>: The maximum number of scanned rows.</li>
     * <li><strong>avgRowsExamined</strong>: The average number of scanned rows.</li>
     * <li><strong>maxRowsSent</strong>: The maximum number of returned rows.</li>
     * <li><strong>avgRowsSent</strong>: The average number of returned rows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number of the paging query. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The maximum number of records per page in a paging query. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-china</strong>: The Chinese mainland.</li>
     * <li><strong>cn-hongkong</strong>: Hong Kong (China).</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * </ul>
     * <p>This parameter is valid only when the <strong>InstanceIds</strong> request parameter is empty. If the <strong>InstanceIds</strong> request parameter is empty, data is retrieved based on the region specified by the <strong>Region</strong> parameter, and the default region is <strong>cn-china</strong>. If the <strong>InstanceIds</strong> request parameter is not empty, data is retrieved based on the region of the first instance specified in <strong>InstanceIds</strong>, regardless of the value of the <strong>Region</strong> parameter.</p>
     * <blockquote>
     * <p>For instances created in regions in the Chinese mainland, set this parameter to <strong>cn-china</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-china</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The rules to be filtered. Separate multiple rules with commas. For more information, see <a href="https://help.aliyun.com/document_detail/290038.html">Query Governance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>DAS_NOT_IMPORTANT</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The SQL template IDs. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query the SQL template IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>6068ce044e3dc9b903979672fb0b69df,d12515c015fc9f41a0778a9e1de0****</p>
     */
    @NameInMap("SqlIds")
    public String sqlIds;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("TagNames")
    public String tagNames;

    /**
     * <p>The date when the data is queried. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1642953600000</p>
     */
    @NameInMap("Time")
    public Long time;

    /**
     * <p>The database account to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>testUser</p>
     */
    @NameInMap("User")
    public String user;

    public static GetQueryOptimizeShareUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeShareUrlRequest self = new GetQueryOptimizeShareUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeShareUrlRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetQueryOptimizeShareUrlRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetQueryOptimizeShareUrlRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeShareUrlRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeShareUrlRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetQueryOptimizeShareUrlRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public GetQueryOptimizeShareUrlRequest setOnlyOptimizedSql(Boolean onlyOptimizedSql) {
        this.onlyOptimizedSql = onlyOptimizedSql;
        return this;
    }
    public Boolean getOnlyOptimizedSql() {
        return this.onlyOptimizedSql;
    }

    public GetQueryOptimizeShareUrlRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetQueryOptimizeShareUrlRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetQueryOptimizeShareUrlRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetQueryOptimizeShareUrlRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeShareUrlRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public GetQueryOptimizeShareUrlRequest setSqlIds(String sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }
    public String getSqlIds() {
        return this.sqlIds;
    }

    public GetQueryOptimizeShareUrlRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public GetQueryOptimizeShareUrlRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public GetQueryOptimizeShareUrlRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
