// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestPatchSetsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListMergeRequestPatchSetsResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static ListMergeRequestPatchSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestPatchSetsResponseBody self = new ListMergeRequestPatchSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestPatchSetsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMergeRequestPatchSetsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMergeRequestPatchSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMergeRequestPatchSetsResponseBody setResult(java.util.List<ListMergeRequestPatchSetsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMergeRequestPatchSetsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListMergeRequestPatchSetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMergeRequestPatchSetsResponseBodyResult extends TeaModel {
        @NameInMap("commitId")
        public String commitId;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("patchSetBizId")
        public String patchSetBizId;

        @NameInMap("patchSetName")
        public String patchSetName;

        @NameInMap("patchSetNo")
        public Long patchSetNo;

        @NameInMap("relatedMergeItemType")
        public String relatedMergeItemType;

        @NameInMap("shortCommitId")
        public String shortCommitId;

        public static ListMergeRequestPatchSetsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestPatchSetsResponseBodyResult self = new ListMergeRequestPatchSetsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestPatchSetsResponseBodyResult setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListMergeRequestPatchSetsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestPatchSetsResponseBodyResult setPatchSetBizId(String patchSetBizId) {
            this.patchSetBizId = patchSetBizId;
            return this;
        }
        public String getPatchSetBizId() {
            return this.patchSetBizId;
        }

        public ListMergeRequestPatchSetsResponseBodyResult setPatchSetName(String patchSetName) {
            this.patchSetName = patchSetName;
            return this;
        }
        public String getPatchSetName() {
            return this.patchSetName;
        }

        public ListMergeRequestPatchSetsResponseBodyResult setPatchSetNo(Long patchSetNo) {
            this.patchSetNo = patchSetNo;
            return this;
        }
        public Long getPatchSetNo() {
            return this.patchSetNo;
        }

        public ListMergeRequestPatchSetsResponseBodyResult setRelatedMergeItemType(String relatedMergeItemType) {
            this.relatedMergeItemType = relatedMergeItemType;
            return this;
        }
        public String getRelatedMergeItemType() {
            return this.relatedMergeItemType;
        }

        public ListMergeRequestPatchSetsResponseBodyResult setShortCommitId(String shortCommitId) {
            this.shortCommitId = shortCommitId;
            return this;
        }
        public String getShortCommitId() {
            return this.shortCommitId;
        }

    }

}
