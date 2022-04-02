// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateResponseBody extends TeaModel {
    // 返回结果 OK 为正常
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateChatappTemplateResponseBodyData data;

    // 提示信息，当返回异常时有值
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateResponseBody self = new CreateChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatappTemplateResponseBody setData(CreateChatappTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatappTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateChatappTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatappTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateChatappTemplateResponseBodyData extends TeaModel {
        // 模板Code
        @NameInMap("TemplateCode")
        public String templateCode;

        // 模板名称
        @NameInMap("TemplateName")
        public String templateName;

        public static CreateChatappTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateResponseBodyData self = new CreateChatappTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateChatappTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
