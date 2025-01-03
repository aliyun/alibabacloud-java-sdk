// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestPatchSetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListMergeRequestPatchSetsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1a072f5367c21f9de3464b8c0ee8546e47764d2d</p>
         */
        @NameInMap("commitId")
        public String commitId;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>513fcfd81a9142d2bb0db4f72c0aa15b</p>
         */
        @NameInMap("patchSetBizId")
        public String patchSetBizId;

        @NameInMap("patchSetName")
        public String patchSetName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("patchSetNo")
        public Long patchSetNo;

        /**
         * <strong>example:</strong>
         * <p>MERGE_SOURCE</p>
         */
        @NameInMap("relatedMergeItemType")
        public String relatedMergeItemType;

        /**
         * <strong>example:</strong>
         * <p>1a072f53</p>
         */
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
