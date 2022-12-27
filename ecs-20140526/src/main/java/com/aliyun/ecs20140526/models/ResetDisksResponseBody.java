// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDisksResponseBody extends TeaModel {
    // Details about the rollback operation.
    @NameInMap("OperationProgressSet")
    public ResetDisksResponseBodyOperationProgressSet operationProgressSet;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ResetDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetDisksResponseBody self = new ResetDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetDisksResponseBody setOperationProgressSet(ResetDisksResponseBodyOperationProgressSet operationProgressSet) {
        this.operationProgressSet = operationProgressSet;
        return this;
    }
    public ResetDisksResponseBodyOperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    public ResetDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem extends TeaModel {
        // The name of the resource.
        @NameInMap("Name")
        public String name;

        // The ID of the resource.
        @NameInMap("Value")
        public String value;

        public static ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem self = new ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        public java.util.List<ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem;

        public static ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet self = new ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet setRelatedItem(java.util.List<ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem) {
            this.relatedItem = relatedItem;
            return this;
        }
        public java.util.List<ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSetRelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

    }

    public static class ResetDisksResponseBodyOperationProgressSetOperationProgress extends TeaModel {
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

        // Indicates whether the operation was successful.
        // 
        // If the operation was successful, a value of Success is returned. If the operation failed, an error code and an error message are returned.
        @NameInMap("OperationStatus")
        public String operationStatus;

        // Detail about the resources.
        @NameInMap("RelatedItemSet")
        public ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet relatedItemSet;

        public static ResetDisksResponseBodyOperationProgressSetOperationProgress build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseBodyOperationProgressSetOperationProgress self = new ResetDisksResponseBodyOperationProgressSetOperationProgress();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseBodyOperationProgressSetOperationProgress setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ResetDisksResponseBodyOperationProgressSetOperationProgress setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ResetDisksResponseBodyOperationProgressSetOperationProgress setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public ResetDisksResponseBodyOperationProgressSetOperationProgress setRelatedItemSet(ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet relatedItemSet) {
            this.relatedItemSet = relatedItemSet;
            return this;
        }
        public ResetDisksResponseBodyOperationProgressSetOperationProgressRelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

    }

    public static class ResetDisksResponseBodyOperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        public java.util.List<ResetDisksResponseBodyOperationProgressSetOperationProgress> operationProgress;

        public static ResetDisksResponseBodyOperationProgressSet build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseBodyOperationProgressSet self = new ResetDisksResponseBodyOperationProgressSet();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseBodyOperationProgressSet setOperationProgress(java.util.List<ResetDisksResponseBodyOperationProgressSetOperationProgress> operationProgress) {
            this.operationProgress = operationProgress;
            return this;
        }
        public java.util.List<ResetDisksResponseBodyOperationProgressSetOperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

    }

}
