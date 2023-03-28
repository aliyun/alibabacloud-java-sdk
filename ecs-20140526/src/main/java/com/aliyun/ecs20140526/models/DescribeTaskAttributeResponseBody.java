// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTaskAttributeResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("FinishedTime")
    public String finishedTime;

    @NameInMap("OperationProgressSet")
    public DescribeTaskAttributeResponseBodyOperationProgressSet operationProgressSet;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("SupportCancel")
    public String supportCancel;

    @NameInMap("TaskAction")
    public String taskAction;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskProcess")
    public String taskProcess;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTaskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskAttributeResponseBody self = new DescribeTaskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeTaskAttributeResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DescribeTaskAttributeResponseBody setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public DescribeTaskAttributeResponseBody setOperationProgressSet(DescribeTaskAttributeResponseBodyOperationProgressSet operationProgressSet) {
        this.operationProgressSet = operationProgressSet;
        return this;
    }
    public DescribeTaskAttributeResponseBodyOperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    public DescribeTaskAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTaskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskAttributeResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeTaskAttributeResponseBody setSupportCancel(String supportCancel) {
        this.supportCancel = supportCancel;
        return this;
    }
    public String getSupportCancel() {
        return this.supportCancel;
    }

    public DescribeTaskAttributeResponseBody setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public DescribeTaskAttributeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTaskAttributeResponseBody setTaskProcess(String taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }
    public String getTaskProcess() {
        return this.taskProcess;
    }

    public DescribeTaskAttributeResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeTaskAttributeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem self = new DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        public java.util.List<DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem;

        public static DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet self = new DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet setRelatedItem(java.util.List<DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem) {
            this.relatedItem = relatedItem;
            return this;
        }
        public java.util.List<DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

    }

    public static class DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("OperationStatus")
        public String operationStatus;

        @NameInMap("RelatedItemSet")
        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet relatedItemSet;

        public static DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress self = new DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress setRelatedItemSet(DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet relatedItemSet) {
            this.relatedItemSet = relatedItemSet;
            return this;
        }
        public DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgressRelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

    }

    public static class DescribeTaskAttributeResponseBodyOperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        public java.util.List<DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress> operationProgress;

        public static DescribeTaskAttributeResponseBodyOperationProgressSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseBodyOperationProgressSet self = new DescribeTaskAttributeResponseBodyOperationProgressSet();
            return TeaModel.build(map, self);
        }

        public DescribeTaskAttributeResponseBodyOperationProgressSet setOperationProgress(java.util.List<DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress> operationProgress) {
            this.operationProgress = operationProgress;
            return this;
        }
        public java.util.List<DescribeTaskAttributeResponseBodyOperationProgressSetOperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

    }

}
