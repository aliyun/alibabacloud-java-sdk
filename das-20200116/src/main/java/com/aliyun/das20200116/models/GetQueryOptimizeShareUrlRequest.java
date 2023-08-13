// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeShareUrlRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the returned entries in ascending order. Default value: **true**. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The name of the database to be queried.</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**: ApsaraDB RDS for MySQL</p>
     * <p>*   **PolarDBMySQL**: PolarDB for MySQL</p>
     * <p>*   **PostgreSQL**: ApsaraDB RDS for PostgreSQL</p>
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
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("OnlyOptimizedSql")
    public Boolean onlyOptimizedSql;

    /**
     * <p>The field by which to sort the returned entries. Default value: **count**. Valid values:</p>
     * <br>
     * <p>*   **count**: the number of executions.</p>
     * <p>*   **maxQueryTime**: the longest execution duration.</p>
     * <p>*   **avgQueryTime**: the average execution duration.</p>
     * <p>*   **maxLockTime**: the longest lock wait duration.</p>
     * <p>*   **avgLockTime**: the average lock wait duration.</p>
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
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-china**: Chinese mainland</p>
     * <p>*   **cn-hongkong**: China (Hong Kong)</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     * <br>
     * <p>This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region set by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect and the system obtains data from the region in which the first specified instance resides.****</p>
     * <br>
     * <p>>  If your instances reside in the regions in the Chinese mainland, set this parameter to **cn-china**.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The tags that are used to filter SQL templates. Separate multiple tags with commas (,). For more information, see [Query governance](~~290038~~).</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The SQL template IDs. You can call the [GetQueryOptimizeExecErrorStats](~~405261~~) operation to obtain the SQL template IDs.</p>
     */
    @NameInMap("SqlIds")
    public String sqlIds;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("TagNames")
    public String tagNames;

    /**
     * <p>The date to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("Time")
    public Long time;

    /**
     * <p>The account of the database to be queried.</p>
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
