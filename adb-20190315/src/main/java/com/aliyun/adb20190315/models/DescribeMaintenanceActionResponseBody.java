// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeMaintenanceActionResponseBody extends TeaModel {
    /**
     * <p>The queried O\&M events.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMaintenanceActionResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeMaintenanceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaintenanceActionResponseBody self = new DescribeMaintenanceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMaintenanceActionResponseBody setItems(java.util.List<DescribeMaintenanceActionResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeMaintenanceActionResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeMaintenanceActionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMaintenanceActionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMaintenanceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMaintenanceActionResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeMaintenanceActionResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the O\&M event was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the cluster that is involved in the O\&M event.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The database engine.</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The deadline before which the event can be executed. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The ID of the O\&M event.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The point in time at which the switchover time of the O\&M event was modified. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The preparation time that is required before the pending O\&M event can be switched. The time is in the `HH:mm:ss` format.</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The ID of the region where the O\&M event occurs.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The execution result of the O\&M event.</p>
         * <br>
         * <p>> This parameter is returned only when the value of `Status` is **FAILED** or **CANCEL**.</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the task was executed in the backend. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the event.</p>
         * <br>
         * <p>*   If you set `IsHistory` to **0**, the state of the pending O\&M event is returned. Valid values:</p>
         * <br>
         * <p>    *   **WAITING_MODIFY**: The start time of the O\&M event is waiting to be set.</p>
         * <p>    *   **WAITING**: The O\&M event is waiting to be processed.</p>
         * <p>    *   **PROCESSING**: The O\&M event is being processed. The switchover time of an event in this state cannot be changed.</p>
         * <br>
         * <p>*   If you set `IsHistory` to **1**, the state of the historical O\&M event is returned. Valid values:</p>
         * <br>
         * <p>    *   **SUCCESS**: The event ended and the execution succeeded.</p>
         * <p>    *   **FAILED**: The event ended but the execution failed.</p>
         * <p>    *   **CANCEL**: The event was canceled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the pending O\&M event is switched. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The type of the O\&M event.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeMaintenanceActionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaintenanceActionResponseBodyItems self = new DescribeMaintenanceActionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMaintenanceActionResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeMaintenanceActionResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeMaintenanceActionResponseBodyItems setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeMaintenanceActionResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeMaintenanceActionResponseBodyItems setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public DescribeMaintenanceActionResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeMaintenanceActionResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeMaintenanceActionResponseBodyItems setPrepareInterval(String prepareInterval) {
            this.prepareInterval = prepareInterval;
            return this;
        }
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        public DescribeMaintenanceActionResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeMaintenanceActionResponseBodyItems setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribeMaintenanceActionResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeMaintenanceActionResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMaintenanceActionResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeMaintenanceActionResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
