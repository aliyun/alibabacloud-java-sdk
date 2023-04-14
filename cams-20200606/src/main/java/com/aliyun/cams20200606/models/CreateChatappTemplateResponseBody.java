// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](https://www.alibabacloud.com/help/zh/cams/latest/api-error-codes).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateChatappTemplateResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The code of the message template.</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The name of the message template.</p>
         */
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
