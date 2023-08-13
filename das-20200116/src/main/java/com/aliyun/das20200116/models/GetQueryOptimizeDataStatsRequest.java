// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataStatsRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the returned entries in ascending order. Default value: **true**. Valid values:</p>
     * <br>
     * <p>*   **true**: sorts the returned entries in ascending order.</p>
     * <p>*   **false**: does not sort the returned entries in ascending order.</p>
     */
    @NameInMap("Asc")
    public String asc;

    /**
     * <p>The name of the database to be queried.</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PolarDBMySQL**</p>
     * <p>*   **PostgreSQL**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The keywords of the SQL template. Separate multiple keywords with spaces.</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The logical relationship between multiple keywords. Valid values:</p>
     * <br>
     * <p>*   **or**</p>
     * <p>*   **and**</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>Specifies whether to query only SQL templates that need to be optimized. Default value: **false**. Valid values:</p>
     * <br>
     * <p>*   **true**: queries only SQL templates that need to be optimized.</p>
     * <p>*   **false**: does not query only SQL statements that need to be optimized.</p>
     */
    @NameInMap("OnlyOptimizedSql")
    public String onlyOptimizedSql;

    /**
     * <p>The field by which to sort the returned entries. Default value: **count**. Valid values:</p>
     * <br>
     * <p>*   **count**: the number of executions.</p>
     * <p>*   **maxQueryTime**: the longest execution time.</p>
     * <p>*   **avgQueryTime**: the average execution time.</p>
     * <p>*   **maxLockTime**: the longest lock wait time.</p>
     * <p>*   **avgLockTime**: the longest lock wait time.</p>
     * <p>*   **maxRowsExamined**: the largest number of scanned rows.</p>
     * <p>*   **avgRowsExamined**: the average number of scanned rows.</p>
     * <p>*   **maxRowsSent**: the largest number of returned rows.</p>
     * <p>*   **avgRowsSent**: the average number of returned rows.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region in which the instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-china**: Chinese mainland</p>
     * <p>*   **cn-hongkong**: China (Hong Kong)</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     * <br>
     * <p>This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region set by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect and the system obtains data from the region in which the first specified instance resides.****</p>
     * <br>
     * <p>>  Set this parameter to **cn-china** for the instances that are created in the regions in the Chinese mainland.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The tags that are used to filter SQL templates. Separate multiple tags with commas (,). For more information, see [Query governance](~~290038~~).</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The SQL template ID. You can query the ID of a template by calling the [GetQueryOptimizeExecErrorStats](~~405235~~) operation.</p>
     */
    @NameInMap("SqlIds")
    public String sqlIds;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("TagNames")
    public String tagNames;

    /**
     * <p>The time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     */
    @NameInMap("Time")
    public String time;

    /**
     * <p>The account of the database to be queried.</p>
     */
    @NameInMap("User")
    public String user;

    public static GetQueryOptimizeDataStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataStatsRequest self = new GetQueryOptimizeDataStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataStatsRequest setAsc(String asc) {
        this.asc = asc;
        return this;
    }
    public String getAsc() {
        return this.asc;
    }

    public GetQueryOptimizeDataStatsRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetQueryOptimizeDataStatsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeDataStatsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeDataStatsRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetQueryOptimizeDataStatsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public GetQueryOptimizeDataStatsRequest setOnlyOptimizedSql(String onlyOptimizedSql) {
        this.onlyOptimizedSql = onlyOptimizedSql;
        return this;
    }
    public String getOnlyOptimizedSql() {
        return this.onlyOptimizedSql;
    }

    public GetQueryOptimizeDataStatsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetQueryOptimizeDataStatsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetQueryOptimizeDataStatsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetQueryOptimizeDataStatsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeDataStatsRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public GetQueryOptimizeDataStatsRequest setSqlIds(String sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }
    public String getSqlIds() {
        return this.sqlIds;
    }

    public GetQueryOptimizeDataStatsRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public GetQueryOptimizeDataStatsRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public GetQueryOptimizeDataStatsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
