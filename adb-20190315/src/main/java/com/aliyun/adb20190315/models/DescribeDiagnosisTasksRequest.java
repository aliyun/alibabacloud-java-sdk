// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisTasksRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The IP address from which the query was initiated.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The order in which to sort the tasks by field. Specify the value in the JSON format. Example: `[{"Field":"CreateTime", "Type":"desc"}]`.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   `Field` indicates the field that is used to sort the tasks. Valid values of Field: `State`, `CreateTime`, `DBName`, `ProcessID`, `UpdateTime`, `JobName`, and `ProcessRows`.</p>
     * <br>
     * <p>*   `Type` indicates the sort type. Valid values of Type: `Desc` and `Asc`. The values are case-insensitive.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <br>
     * <p>*   30 (default)</p>
     * <p>*   50</p>
     * <p>*   100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query ID.</p>
     * <br>
     * <p>> You can call the [DescribeProcessList](~~190092~~) operation to query the IDs of queries that are being executed.</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of a stage in the query that is specified by the `ProcessId` parameter.</p>
     */
    @NameInMap("StageId")
    public String stageId;

    /**
     * <p>The state of the asynchronous import or export task to be queried. Valid values:</p>
     * <br>
     * <p>*   **RUNNING**</p>
     * <p>*   **FINISHED**</p>
     * <p>*   **FAILED**</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeDiagnosisTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisTasksRequest self = new DescribeDiagnosisTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisTasksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDiagnosisTasksRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeDiagnosisTasksRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeDiagnosisTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnosisTasksRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DescribeDiagnosisTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisTasksRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public DescribeDiagnosisTasksRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
