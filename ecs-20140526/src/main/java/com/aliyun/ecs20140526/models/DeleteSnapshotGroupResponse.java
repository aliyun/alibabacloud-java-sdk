// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteSnapshotGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperationProgressSet")
    @Validation(required = true)
    public DeleteSnapshotGroupResponseOperationProgressSet operationProgressSet;

    public static DeleteSnapshotGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotGroupResponse self = new DeleteSnapshotGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSnapshotGroupResponse setOperationProgressSet(DeleteSnapshotGroupResponseOperationProgressSet operationProgressSet) {
        this.operationProgressSet = operationProgressSet;
        return this;
    }
    public DeleteSnapshotGroupResponseOperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    public static class DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem self = new DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        @Validation(required = true)
        public java.util.List<DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem;

        public static DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet self = new DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet setRelatedItem(java.util.List<DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem) {
            this.relatedItem = relatedItem;
            return this;
        }
        public java.util.List<DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

    }

    public static class DeleteSnapshotGroupResponseOperationProgressSetOperationProgress extends TeaModel {
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
        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet relatedItemSet;

        public static DeleteSnapshotGroupResponseOperationProgressSetOperationProgress build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseOperationProgressSetOperationProgress self = new DeleteSnapshotGroupResponseOperationProgressSetOperationProgress();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgress setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgress setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgress setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgress setRelatedItemSet(DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet relatedItemSet) {
            this.relatedItemSet = relatedItemSet;
            return this;
        }
        public DeleteSnapshotGroupResponseOperationProgressSetOperationProgressRelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

    }

    public static class DeleteSnapshotGroupResponseOperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        @Validation(required = true)
        public java.util.List<DeleteSnapshotGroupResponseOperationProgressSetOperationProgress> operationProgress;

        public static DeleteSnapshotGroupResponseOperationProgressSet build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotGroupResponseOperationProgressSet self = new DeleteSnapshotGroupResponseOperationProgressSet();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotGroupResponseOperationProgressSet setOperationProgress(java.util.List<DeleteSnapshotGroupResponseOperationProgressSetOperationProgress> operationProgress) {
            this.operationProgress = operationProgress;
            return this;
        }
        public java.util.List<DeleteSnapshotGroupResponseOperationProgressSetOperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

    }

}
