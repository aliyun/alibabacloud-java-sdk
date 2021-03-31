// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTaskAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TaskAction")
    @Validation(required = true)
    public String taskAction;

    @NameInMap("TaskStatus")
    @Validation(required = true)
    public String taskStatus;

    @NameInMap("TaskProcess")
    @Validation(required = true)
    public String taskProcess;

    @NameInMap("SupportCancel")
    @Validation(required = true)
    public String supportCancel;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("FinishedTime")
    @Validation(required = true)
    public String finishedTime;

    @NameInMap("OperationProgressSet")
    @Validation(required = true)
    public DescribeTaskAttributeResponseOperationProgressSet operationProgressSet;

    public static DescribeTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskAttributeResponse self = new DescribeTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskAttributeResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTaskAttributeResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTaskAttributeResponse setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public DescribeTaskAttributeResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeTaskAttributeResponse setTaskProcess(String taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }
    public String getTaskProcess() {
        return this.taskProcess;
    }

    public DescribeTaskAttributeResponse setSupportCancel(String supportCancel) {
        this.supportCancel = supportCancel;
        return this;
    }
    public String getSupportCancel() {
        return this.supportCancel;
    }

    public DescribeTaskAttributeResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTaskAttributeResponse setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeTaskAttributeResponse setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DescribeTaskAttributeResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeTaskAttributeResponse setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public DescribeTaskAttributeResponse setOperationProgressSet(DescribeTaskAttributeResponseOperationProgressSet operationProgressSet) {
        this.operationProgressSet = operationProgressSet;
        return this;
    }
    public DescribeTaskAttributeResponseOperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    public static class DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem self = new DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        @Validation(required = true)
        public java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem;

        public static DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet self = new DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet setRelatedItem(java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem) {
            this.relatedItem = relatedItem;
            return this;
        }
        public java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

    }

    public static class DescribeTaskAttributeResponseOperationProgressSetOperationProgress extends TeaModel {
        @NameInMap("OperationStatus")
        @Validation(required = true)
        public String operationStatus;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMsg")
        @Validation(required = true)
        public String errorMsg;

        @NameInMap("RelatedItemSet")
        @Validation(required = true)
        public DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet relatedItemSet;

        public static DescribeTaskAttributeResponseOperationProgressSetOperationProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSetOperationProgress self = new DescribeTaskAttributeResponseOperationProgressSetOperationProgress();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseOperationProgressSetOperationProgress setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public DescribeTaskAttributeResponseOperationProgressSetOperationProgress setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeTaskAttributeResponseOperationProgressSetOperationProgress setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeTaskAttributeResponseOperationProgressSetOperationProgress setRelatedItemSet(DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet relatedItemSet) {
            this.relatedItemSet = relatedItemSet;
            return this;
        }
        public DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

    }

    public static class DescribeTaskAttributeResponseOperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        @Validation(required = true)
        public java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgress> operationProgress;

        public static DescribeTaskAttributeResponseOperationProgressSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSet self = new DescribeTaskAttributeResponseOperationProgressSet();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseOperationProgressSet setOperationProgress(java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgress> operationProgress) {
            this.operationProgress = operationProgress;
            return this;
        }
        public java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

    }

}
