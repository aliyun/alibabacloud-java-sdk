// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeShareUrlRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the returned entries in ascending order. Default value: <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The name of the database to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong>: ApsaraDB RDS for MySQL</p>
     * </li>
     * <li><p><strong>PolarDBMySQL</strong>: PolarDB for MySQL</p>
     * </li>
     * <li><p><strong>PostgreSQL</strong>: ApsaraDB RDS for PostgreSQL</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The keywords of the SQL template. Separate multiple keywords with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>select update</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The logical relationship between multiple keywords. Valid values:</p>
     * <ul>
     * <li><p><strong>or</strong></p>
     * </li>
     * <li><p><strong>and</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>Specifies whether to query only SQL templates that need to be optimized. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyOptimizedSql")
    public Boolean onlyOptimizedSql;

    /**
     * <p>The field by which to sort the returned entries. Default value: <strong>count</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>count</strong>: the number of executions.</p>
     * </li>
     * <li><p><strong>maxQueryTime</strong>: the longest execution duration.</p>
     * </li>
     * <li><p><strong>avgQueryTime</strong>: the average execution duration.</p>
     * </li>
     * <li><p><strong>maxLockTime</strong>: the longest lock wait duration.</p>
     * </li>
     * <li><p><strong>avgLockTime</strong>: the average lock wait duration.</p>
     * </li>
     * <li><p><strong>maxRowsExamined</strong>: the largest number of scanned rows.</p>
     * </li>
     * <li><p><strong>avgRowsExamined</strong>: the average number of scanned rows.</p>
     * </li>
     * <li><p><strong>maxRowsSent</strong>: the largest number of returned rows.</p>
     * </li>
     * <li><p><strong>avgRowsSent</strong>: the average number of returned rows.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>count</p>
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
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-china</strong>: Chinese mainland</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: China (Hong Kong)</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: Singapore</p>
     * </li>
     * </ul>
     * <p>This parameter takes effect only if <strong>InstanceIds</strong> is left empty. If you leave <strong>InstanceIds</strong> empty, the system obtains data from the region set by <strong>Region</strong>. By default, Region is set to <strong>cn-china</strong>. If you specify <strong>InstanceIds</strong>, <strong>Region</strong> does not take effect and the system obtains data from the region in which the first specified instance resides.\<em>\</em>\<em>\</em></p>
     * <blockquote>
     * <p>If your instances reside in the regions in the Chinese mainland, set this parameter to <strong>cn-china</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-china</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The tags that are used to filter SQL templates. Separate multiple tags with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/290038.html">Query governance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>DAS_NOT_IMPORTANT</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The SQL template IDs. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeExecErrorStats</a> operation to obtain the SQL template IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>6068ce044e3dc9b903979672fb0b69df,d12515c015fc9f41a0778a9e1de0****</p>
     */
    @NameInMap("SqlIds")
    public String sqlIds;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("TagNames")
    public String tagNames;

    /**
     * <p>The date to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1642953600000</p>
     */
    @NameInMap("Time")
    public Long time;

    /**
     * <p>The account of the database to be queried.</p>
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
