// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ModifyChatappTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("TemplateCode")
        public String templateCode;

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
