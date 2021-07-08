// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateAppTemplateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 返回结果
    @NameInMap("Result")
    public CreateAppTemplateResponseBodyResult result;

    public static CreateAppTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTemplateResponseBody self = new CreateAppTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAppTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateAppTemplateResponseBody setResult(CreateAppTemplateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppTemplateResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppTemplateResponseBodyResult extends TeaModel {
        // 应用模板唯一标示
        @NameInMap("AppTemplateId")
        public String appTemplateId;

        public static CreateAppTemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppTemplateResponseBodyResult self = new CreateAppTemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppTemplateResponseBodyResult setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

    }

}
