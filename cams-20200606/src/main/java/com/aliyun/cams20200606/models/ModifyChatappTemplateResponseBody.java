// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateResponseBody extends TeaModel {
    // The HTTP status code.
    // 
    // *   If OK is returned, the request is successful.
    // *   Other codes indicate that the call fails. For more information, see [Error codes](~~196974~~).
    @NameInMap("Code")
    public String code;

    // The returned data.
    @NameInMap("Data")
    public ModifyChatappTemplateResponseBodyData data;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplateResponseBody self = new ModifyChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyChatappTemplateResponseBody setData(ModifyChatappTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyChatappTemplateResponseBodyData getData() {
        return this.data;
    }

    public ModifyChatappTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyChatappTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyChatappTemplateResponseBodyData extends TeaModel {
        // The code of the message template.
        @NameInMap("TemplateCode")
        public String templateCode;

        // The name of the template.
        @NameInMap("TemplateName")
        public String templateName;

        public static ModifyChatappTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateResponseBodyData self = new ModifyChatappTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ModifyChatappTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
