// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message templates.</p>
     */
    @NameInMap("ListTemplate")
    public java.util.List<ListChatappTemplateResponseBodyListTemplate> listTemplate;

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

    /**
     * <p>总记录条数。</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatappTemplateResponseBody self = new ListChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatappTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListChatappTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatappTemplateResponseBody setListTemplate(java.util.List<ListChatappTemplateResponseBodyListTemplate> listTemplate) {
        this.listTemplate = listTemplate;
        return this;
    }
    public java.util.List<ListChatappTemplateResponseBodyListTemplate> getListTemplate() {
        return this.listTemplate;
    }

    public ListChatappTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatappTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatappTemplateResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListChatappTemplateResponseBodyListTemplate extends TeaModel {
        /**
         * <p>The review status of the message template. Valid values:</p>
         * <br>
         * <p>*   **pass**: The message template is approved.</p>
         * <p>*   **fail**: The message template is rejected.</p>
         * <p>*   **auditing**: The message template is being reviewed.</p>
         * <p>*   **unaudit**: The review is suspended.</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The category of the message template. Valid values:</p>
         * <br>
         * <p>*   **TRANSACTIONAL**: a transactional template</p>
         * <p>*   **MARKETING**: a marketing template</p>
         * <p>*   **OTP**: a one-time password template</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The language that is used in the message template. For more information, see [Language codes](~~463420~~).</p>
         */
        @NameInMap("Language")
        public String language;

        @NameInMap("Reason")
        public String reason;

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

        /**
         * <p>The type of the template. Valid values: WHATSAPP and VIBER.</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static ListChatappTemplateResponseBodyListTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListChatappTemplateResponseBodyListTemplate self = new ListChatappTemplateResponseBodyListTemplate();
            return TeaModel.build(map, self);
        }

        public ListChatappTemplateResponseBodyListTemplate setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public ListChatappTemplateResponseBodyListTemplate setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListChatappTemplateResponseBodyListTemplate setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListChatappTemplateResponseBodyListTemplate setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListChatappTemplateResponseBodyListTemplate setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListChatappTemplateResponseBodyListTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListChatappTemplateResponseBodyListTemplate setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
