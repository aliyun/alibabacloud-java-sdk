// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreTaskListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public DescribeRestoreTaskListResponseBodyItems items;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalElements")
    public Integer totalElements;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeRestoreTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTaskListResponseBody self = new DescribeRestoreTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTaskListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeRestoreTaskListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeRestoreTaskListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeRestoreTaskListResponseBody setItems(DescribeRestoreTaskListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeRestoreTaskListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeRestoreTaskListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeRestoreTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRestoreTaskListResponseBody setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Integer getTotalElements() {
        return this.totalElements;
    }

    public DescribeRestoreTaskListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail extends TeaModel {
        @NameInMap("BackupGatewayId")
        public Long backupGatewayId;

        @NameInMap("BackupPlanId")
        public String backupPlanId;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("ContinuousRestoreProgress")
        public Integer continuousRestoreProgress;

        @NameInMap("CrossAliyunId")
        public String crossAliyunId;

        @NameInMap("CrossRoleName")
        public String crossRoleName;

        @NameInMap("DestinationEndpointDatabaseName")
        public String destinationEndpointDatabaseName;

        @NameInMap("DestinationEndpointInstanceID")
        public String destinationEndpointInstanceID;

        @NameInMap("DestinationEndpointInstanceType")
        public String destinationEndpointInstanceType;

        @NameInMap("DestinationEndpointIpPort")
        public String destinationEndpointIpPort;

        @NameInMap("DestinationEndpointOracleSID")
        public String destinationEndpointOracleSID;

        @NameInMap("DestinationEndpointRegion")
        public String destinationEndpointRegion;

        @NameInMap("DestinationEndpointUserName")
        public String destinationEndpointUserName;

        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("FullDataRestoreProgress")
        public Integer fullDataRestoreProgress;

        @NameInMap("FullStruAfterRestoreProgress")
        public Integer fullStruAfterRestoreProgress;

        @NameInMap("FullStruforeRestoreProgress")
        public Integer fullStruforeRestoreProgress;

        @NameInMap("RestoreDir")
        public String restoreDir;

        @NameInMap("RestoreObjects")
        public String restoreObjects;

        @NameInMap("RestoreStatus")
        public String restoreStatus;

        @NameInMap("RestoreTaskCreateTime")
        public Long restoreTaskCreateTime;

        @NameInMap("RestoreTaskFinishTime")
        public Long restoreTaskFinishTime;

        @NameInMap("RestoreTaskId")
        public String restoreTaskId;

        @NameInMap("RestoreTaskName")
        public String restoreTaskName;

        @NameInMap("RestoreTime")
        public Long restoreTime;

        public static DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail self = new DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setBackupGatewayId(Long backupGatewayId) {
            this.backupGatewayId = backupGatewayId;
            return this;
        }
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setContinuousRestoreProgress(Integer continuousRestoreProgress) {
            this.continuousRestoreProgress = continuousRestoreProgress;
            return this;
        }
        public Integer getContinuousRestoreProgress() {
            return this.continuousRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setCrossAliyunId(String crossAliyunId) {
            this.crossAliyunId = crossAliyunId;
            return this;
        }
        public String getCrossAliyunId() {
            return this.crossAliyunId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setCrossRoleName(String crossRoleName) {
            this.crossRoleName = crossRoleName;
            return this;
        }
        public String getCrossRoleName() {
            return this.crossRoleName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
            this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
            return this;
        }
        public String getDestinationEndpointDatabaseName() {
            return this.destinationEndpointDatabaseName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }
        public String getDestinationEndpointInstanceID() {
            return this.destinationEndpointInstanceID;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }
        public String getDestinationEndpointInstanceType() {
            return this.destinationEndpointInstanceType;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointIpPort(String destinationEndpointIpPort) {
            this.destinationEndpointIpPort = destinationEndpointIpPort;
            return this;
        }
        public String getDestinationEndpointIpPort() {
            return this.destinationEndpointIpPort;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
            this.destinationEndpointOracleSID = destinationEndpointOracleSID;
            return this;
        }
        public String getDestinationEndpointOracleSID() {
            return this.destinationEndpointOracleSID;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointRegion(String destinationEndpointRegion) {
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }
        public String getDestinationEndpointRegion() {
            return this.destinationEndpointRegion;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointUserName(String destinationEndpointUserName) {
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }
        public String getDestinationEndpointUserName() {
            return this.destinationEndpointUserName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setFullDataRestoreProgress(Integer fullDataRestoreProgress) {
            this.fullDataRestoreProgress = fullDataRestoreProgress;
            return this;
        }
        public Integer getFullDataRestoreProgress() {
            return this.fullDataRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setFullStruAfterRestoreProgress(Integer fullStruAfterRestoreProgress) {
            this.fullStruAfterRestoreProgress = fullStruAfterRestoreProgress;
            return this;
        }
        public Integer getFullStruAfterRestoreProgress() {
            return this.fullStruAfterRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setFullStruforeRestoreProgress(Integer fullStruforeRestoreProgress) {
            this.fullStruforeRestoreProgress = fullStruforeRestoreProgress;
            return this;
        }
        public Integer getFullStruforeRestoreProgress() {
            return this.fullStruforeRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreDir(String restoreDir) {
            this.restoreDir = restoreDir;
            return this;
        }
        public String getRestoreDir() {
            return this.restoreDir;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreObjects(String restoreObjects) {
            this.restoreObjects = restoreObjects;
            return this;
        }
        public String getRestoreObjects() {
            return this.restoreObjects;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskCreateTime(Long restoreTaskCreateTime) {
            this.restoreTaskCreateTime = restoreTaskCreateTime;
            return this;
        }
        public Long getRestoreTaskCreateTime() {
            return this.restoreTaskCreateTime;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskFinishTime(Long restoreTaskFinishTime) {
            this.restoreTaskFinishTime = restoreTaskFinishTime;
            return this;
        }
        public Long getRestoreTaskFinishTime() {
            return this.restoreTaskFinishTime;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskId(String restoreTaskId) {
            this.restoreTaskId = restoreTaskId;
            return this;
        }
        public String getRestoreTaskId() {
            return this.restoreTaskId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskName(String restoreTaskName) {
            this.restoreTaskName = restoreTaskName;
            return this;
        }
        public String getRestoreTaskName() {
            return this.restoreTaskName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTime(Long restoreTime) {
            this.restoreTime = restoreTime;
            return this;
        }
        public Long getRestoreTime() {
            return this.restoreTime;
        }

    }

    public static class DescribeRestoreTaskListResponseBodyItems extends TeaModel {
        @NameInMap("RestoreTaskDetail")
        public java.util.List<DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail> restoreTaskDetail;

        public static DescribeRestoreTaskListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTaskListResponseBodyItems self = new DescribeRestoreTaskListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTaskListResponseBodyItems setRestoreTaskDetail(java.util.List<DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail> restoreTaskDetail) {
            this.restoreTaskDetail = restoreTaskDetail;
            return this;
        }
        public java.util.List<DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail> getRestoreTaskDetail() {
            return this.restoreTaskDetail;
        }

    }

}
