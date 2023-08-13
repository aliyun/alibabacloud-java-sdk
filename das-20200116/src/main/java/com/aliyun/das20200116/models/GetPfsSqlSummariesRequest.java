// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSummariesRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the returned entries in ascending order. Default value: **false**. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. You can view the data of up to seven days within the last month.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The keywords of the SQL template. Separate multiple keywords with spaces.</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  This parameter must be specified if the database instance is an ApsaraDB RDS for MySQL Cluster Edition instance or a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The field by which to sort the returned entries. Default value: **count**.</p>
     * <br>
     * <p>*   **count**: the number of executions.</p>
     * <p>*   **avgRt**: the average execution duration.</p>
     * <p>*   **rtRate**: the execution duration percentage.</p>
     * <p>*   **rowsExamined**: the total number of scanned rows.</p>
     * <p>*   **avgRowsExamined**: the average number of scanned rows.</p>
     * <p>*   **avgRowsReturned**: the average number of returned rows.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The SQL ID.</p>
     * <br>
     * <p>>  If this parameter is specified, the full request statistics of the specified SQL query are collected. If this parameter is left empty, the full request statistics of the entire database instance are collected.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetPfsSqlSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlSummariesRequest self = new GetPfsSqlSummariesRequest();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlSummariesRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetPfsSqlSummariesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPfsSqlSummariesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPfsSqlSummariesRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetPfsSqlSummariesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPfsSqlSummariesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetPfsSqlSummariesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetPfsSqlSummariesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPfsSqlSummariesRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetPfsSqlSummariesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
