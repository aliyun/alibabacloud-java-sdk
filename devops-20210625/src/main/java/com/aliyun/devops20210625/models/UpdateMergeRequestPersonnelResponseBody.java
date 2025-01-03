// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestPersonnelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
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
     * <p>4D6AF7CC-B43B-5454-86AB-023D25E44868</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateMergeRequestPersonnelResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateMergeRequestPersonnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestPersonnelResponseBody self = new UpdateMergeRequestPersonnelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestPersonnelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateMergeRequestPersonnelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateMergeRequestPersonnelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMergeRequestPersonnelResponseBody setResult(UpdateMergeRequestPersonnelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMergeRequestPersonnelResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateMergeRequestPersonnelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMergeRequestPersonnelResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("result")
        public Boolean result;

        public static UpdateMergeRequestPersonnelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestPersonnelResponseBodyResult self = new UpdateMergeRequestPersonnelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestPersonnelResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
