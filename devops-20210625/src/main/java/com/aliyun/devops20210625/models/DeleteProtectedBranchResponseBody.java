// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProtectedBranchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>1F4F342D-493A-5B2C-B133-BA78B30FF834</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteProtectedBranchResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteProtectedBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectedBranchResponseBody self = new DeleteProtectedBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProtectedBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteProtectedBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteProtectedBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProtectedBranchResponseBody setResult(DeleteProtectedBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteProtectedBranchResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteProtectedBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteProtectedBranchResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("result")
        public Boolean result;

        public static DeleteProtectedBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteProtectedBranchResponseBodyResult self = new DeleteProtectedBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteProtectedBranchResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
