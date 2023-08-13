// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorStatsRequest extends TeaModel {
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
     * <p>The field by which to sort the returned entries. Only error_count is supported, which specifies that the entries are sorted based on the number of failed executions.</p>
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
     * <p>The time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     */
    @NameInMap("Time")
    public String time;

    public static GetQueryOptimizeExecErrorStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeExecErrorStatsRequest self = new GetQueryOptimizeExecErrorStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeExecErrorStatsRequest setAsc(String asc) {
        this.asc = asc;
        return this;
    }
    public String getAsc() {
        return this.asc;
    }

    public GetQueryOptimizeExecErrorStatsRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetQueryOptimizeExecErrorStatsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeExecErrorStatsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeExecErrorStatsRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetQueryOptimizeExecErrorStatsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public GetQueryOptimizeExecErrorStatsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetQueryOptimizeExecErrorStatsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetQueryOptimizeExecErrorStatsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetQueryOptimizeExecErrorStatsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeExecErrorStatsRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
