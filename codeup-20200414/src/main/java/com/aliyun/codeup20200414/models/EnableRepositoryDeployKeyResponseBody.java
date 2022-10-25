// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class EnableRepositoryDeployKeyResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public EnableRepositoryDeployKeyResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static EnableRepositoryDeployKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableRepositoryDeployKeyResponseBody self = new EnableRepositoryDeployKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableRepositoryDeployKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public EnableRepositoryDeployKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public EnableRepositoryDeployKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableRepositoryDeployKeyResponseBody setResult(EnableRepositoryDeployKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EnableRepositoryDeployKeyResponseBodyResult getResult() {
        return this.result;
    }

    public EnableRepositoryDeployKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableRepositoryDeployKeyResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static EnableRepositoryDeployKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EnableRepositoryDeployKeyResponseBodyResult self = new EnableRepositoryDeployKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EnableRepositoryDeployKeyResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
