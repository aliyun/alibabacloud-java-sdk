// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateAppTemplateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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
