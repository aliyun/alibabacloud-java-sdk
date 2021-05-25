// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateInstanceResponseBodyResult result;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setResult(CreateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public CreateInstanceResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public CreateInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateInstanceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public static class CreateInstanceResponseBodyResult extends TeaModel {
        // 插件实例ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 扩展信息
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        public static CreateInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyResult self = new CreateInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceResponseBodyResult setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

    }

}
