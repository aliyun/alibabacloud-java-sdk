// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDisksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperationProgressSet")
    @Validation(required = true)
    public ResetDisksResponseOperationProgressSet operationProgressSet;

    public static ResetDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDisksResponse self = new ResetDisksResponse();
        return TeaModel.build(map, self);
    }

    public ResetDisksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetDisksResponse setOperationProgressSet(ResetDisksResponseOperationProgressSet operationProgressSet) {
        this.operationProgressSet = operationProgressSet;
        return this;
    }
    public ResetDisksResponseOperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    public static class ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem self = new ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        @Validation(required = true)
        public java.util.List<ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem;

        public static ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet self = new ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet setRelatedItem(java.util.List<ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem) {
            this.relatedItem = relatedItem;
            return this;
        }
        public java.util.List<ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

    }

    public static class ResetDisksResponseOperationProgressSetOperationProgress extends TeaModel {
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
        public ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet relatedItemSet;

        public static ResetDisksResponseOperationProgressSetOperationProgress build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseOperationProgressSetOperationProgress self = new ResetDisksResponseOperationProgressSetOperationProgress();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseOperationProgressSetOperationProgress setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public ResetDisksResponseOperationProgressSetOperationProgress setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ResetDisksResponseOperationProgressSetOperationProgress setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ResetDisksResponseOperationProgressSetOperationProgress setRelatedItemSet(ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet relatedItemSet) {
            this.relatedItemSet = relatedItemSet;
            return this;
        }
        public ResetDisksResponseOperationProgressSetOperationProgressRelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

    }

    public static class ResetDisksResponseOperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        @Validation(required = true)
        public java.util.List<ResetDisksResponseOperationProgressSetOperationProgress> operationProgress;

        public static ResetDisksResponseOperationProgressSet build(java.util.Map<String, ?> map) throws Exception {
            ResetDisksResponseOperationProgressSet self = new ResetDisksResponseOperationProgressSet();
            return TeaModel.build(map, self);
        }

        public ResetDisksResponseOperationProgressSet setOperationProgress(java.util.List<ResetDisksResponseOperationProgressSetOperationProgress> operationProgress) {
            this.operationProgress = operationProgress;
            return this;
        }
        public java.util.List<ResetDisksResponseOperationProgressSetOperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

    }

}
