// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeMaintenanceActionResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeMaintenanceActionResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("Deadline")
        public String deadline;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PrepareInterval")
        public String prepareInterval;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResultInfo")
        public String resultInfo;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SwitchTime")
        public String switchTime;

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
