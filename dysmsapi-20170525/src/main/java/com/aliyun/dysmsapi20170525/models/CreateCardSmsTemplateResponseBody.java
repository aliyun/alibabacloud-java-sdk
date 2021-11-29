// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateCardSmsTemplateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCardSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateResponseBody self = new CreateCardSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCardSmsTemplateResponseBody setData(CreateCardSmsTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCardSmsTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateCardSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCardSmsTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCardSmsTemplateResponseBodyData extends TeaModel {
        @NameInMap("TemplateCode")
        public String templateCode;

        public static CreateCardSmsTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCardSmsTemplateResponseBodyData self = new CreateCardSmsTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCardSmsTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
