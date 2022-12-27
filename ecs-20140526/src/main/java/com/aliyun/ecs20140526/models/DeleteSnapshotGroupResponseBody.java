// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteSnapshotGroupResponseBody extends TeaModel {
    // Details about the delete operation.
    @NameInMap("OperationProgressSet")
    public DeleteSnapshotGroupResponseBodyOperationProgressSet operationProgressSet;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSnapshotGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotGroupResponseBody self = new DeleteSnapshotGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotGroupResponseBody setOperationProgressSet(DeleteSnapshotGroupResponseBodyOperationProgressSet operationProgressSet) {
        this.operationProgressSet = operationProgressSet;
        return this;
    }
    public DeleteSnapshotGroupResponseBodyOperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    public DeleteSnapshotGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem extends TeaModel {
        // The name of the resource.
        @NameInMap("Name")
        public String name;

        // The ID of the resource.
        @NameInMap("Value")
        public String value;

        public static DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem self = new DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        public java.util.List<DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem;

        public static DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet self = new DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet setRelatedItem(java.util.List<DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem) {
            this.relatedItem = relatedItem;
            return this;
        }
        public java.util.List<DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

    }

    public static class DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress extends TeaModel {
        // The error code. This parameter is empty when the operation was successful.
        // 
        // For information about error codes and error messages, visit the [API error center](https://error-center.alibabacloud.com/status/product/Ecs).
        @NameInMap("ErrorCode")
        public String errorCode;

        // The error message. This parameter is empty when the operation was successful.
        // 
        // For information about error codes and error messages, visit the [API error center](https://error-center.alibabacloud.com/status/product/Ecs).
        @NameInMap("ErrorMsg")
        public String errorMsg;

        // Indicates whether the operation was successful. If the operation was successful, a value of Success is returned. If the operation failed, an error code and an error message are returned.
        @NameInMap("OperationStatus")
        public String operationStatus;

        // Details about the resources.
        @NameInMap("RelatedItemSet")
        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet relatedItemSet;

        public static DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress self = new DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress setRelatedItemSet(DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet relatedItemSet) {
            this.relatedItemSet = relatedItemSet;
            return this;
        }
        public DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgressRelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

    }

    public static class DeleteSnapshotGroupResponseBodyOperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        public java.util.List<DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress> operationProgress;

        public static DeleteSnapshotGroupResponseBodyOperationProgressSet build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseBodyOperationProgressSet self = new DeleteSnapshotGroupResponseBodyOperationProgressSet();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseBodyOperationProgressSet setOperationProgress(java.util.List<DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress> operationProgress) {
            this.operationProgress = operationProgress;
            return this;
        }
        public java.util.List<DeleteSnapshotGroupResponseBodyOperationProgressSetOperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

    }

}
