// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <ul>
     * <li>A value of OK indicates that the call is successful.</li>
     * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;templateCode&quot;: &quot;****4b5c79c9432497a075bdfca36bf5&quot;，&quot;templateName&quot;: &quot;hello_whatsapp&quot;}</p>
     */
    @NameInMap("Data")
    public CreateChatappTemplateResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateResponseBody self = new CreateChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * 
         * <strong>example:</strong>
         * <p>SMS_232907****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The name of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_whatsapp</p>
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
