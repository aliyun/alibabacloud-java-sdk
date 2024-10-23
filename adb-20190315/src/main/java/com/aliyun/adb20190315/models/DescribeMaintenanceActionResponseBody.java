// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeMaintenanceActionResponseBody extends TeaModel {
    /**
     * <p>The queried O\&amp;M events.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeMaintenanceActionResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E774C8A9-8819-4A09-9E91-07C078******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The time when the O\&amp;M event was created. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-30T02:44:27Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the cluster that is involved in the O\&amp;M event.</p>
         * 
         * <strong>example:</strong>
         * <p>am-****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>analyticdb</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The deadline before which the event can be executed. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-04T15:59:59Z</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The ID of the O\&amp;M event.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The point in time at which the switchover time of the O\&amp;M event was modified. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-03T06:33:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The preparation time that is required before the pending O\&amp;M event can be switched. The time is in the <code>HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The ID of the region where the O\&amp;M event occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The execution result of the O\&amp;M event.</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of <code>Status</code> is <strong>FAILED</strong> or <strong>CANCEL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>autoCancel</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the task was executed in the backend. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-03T04:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the event.</p>
         * <ul>
         * <li><p>If you set <code>IsHistory</code> to <strong>0</strong>, the state of the pending O\&amp;M event is returned. Valid values:</p>
         * <ul>
         * <li><strong>WAITING_MODIFY</strong>: The start time of the O\&amp;M event is waiting to be set.</li>
         * <li><strong>WAITING</strong>: The O\&amp;M event is waiting to be processed.</li>
         * <li><strong>PROCESSING</strong>: The O\&amp;M event is being processed. The switchover time of an event in this state cannot be changed.</li>
         * </ul>
         * </li>
         * <li><p>If you set <code>IsHistory</code> to <strong>1</strong>, the state of the historical O\&amp;M event is returned. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: The event ended and the execution succeeded.</li>
         * <li><strong>FAILED</strong>: The event ended but the execution failed.</li>
         * <li><strong>CANCEL</strong>: The event was canceled.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the pending O\&amp;M event is switched. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-03T06:00:00Z</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The type of the O\&amp;M event.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_apsaradb_upgrade</p>
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
