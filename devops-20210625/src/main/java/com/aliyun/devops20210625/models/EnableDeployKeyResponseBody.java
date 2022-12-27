// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class EnableDeployKeyResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public EnableDeployKeyResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static EnableDeployKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDeployKeyResponseBody self = new EnableDeployKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDeployKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public EnableDeployKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public EnableDeployKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableDeployKeyResponseBody setResult(EnableDeployKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EnableDeployKeyResponseBodyResult getResult() {
        return this.result;
    }

    public EnableDeployKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableDeployKeyResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static EnableDeployKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EnableDeployKeyResponseBodyResult self = new EnableDeployKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EnableDeployKeyResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
