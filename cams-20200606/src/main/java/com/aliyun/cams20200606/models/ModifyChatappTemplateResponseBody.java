// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
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
     */
    @NameInMap("Data")
    public ModifyChatappTemplateResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplateResponseBody self = new ModifyChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The code of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>8472929283883</p>
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
