// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class MergeMergeRequestResponseBody extends TeaModel {
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
     * <p>9ED5E382-3A58-51E4-8A81-CE25D1756025</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public MergeMergeRequestResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static MergeMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeMergeRequestResponseBody self = new MergeMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MergeMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MergeMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeMergeRequestResponseBody setResult(MergeMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public MergeMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public MergeMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MergeMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("bizId")
        public String bizId;

        @NameInMap("localId")
        public Long localId;

        @NameInMap("mergedRevision")
        public String mergedRevision;

        @NameInMap("projectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("result")
        public Boolean result;

        public static MergeMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResult self = new MergeMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResult setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public MergeMergeRequestResponseBodyResult setLocalId(Long localId) {
            this.localId = localId;
            return this;
        }
        public Long getLocalId() {
            return this.localId;
        }

        public MergeMergeRequestResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        public MergeMergeRequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public MergeMergeRequestResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
