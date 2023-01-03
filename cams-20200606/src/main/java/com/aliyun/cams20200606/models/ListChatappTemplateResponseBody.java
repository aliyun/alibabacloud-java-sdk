// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateResponseBody extends TeaModel {
    // The HTTP status code returned.
    // 
    // *   A code of OK indicates that the call is successful.
    // *   Other codes indicate that the call fails. For more information, see [Error codes](~~196974~~).
    @NameInMap("Code")
    public String code;

    // The message templates.
    @NameInMap("ListTemplate")
    public java.util.List<ListChatappTemplateResponseBodyListTemplate> listTemplate;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatappTemplateResponseBody self = new ListChatappTemplateResponseBody();
        return TeaModel.build(map, self);
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

    public static class ListChatappTemplateResponseBodyListTemplate extends TeaModel {
        // The review status of the message template. Valid values:
        // 
        // *   **pass**: The message template is approved.
        // *   **fail**: The message template is rejected.
        // *   **auditing**: The message template is being reviewed.
        // *   **unaudit**: The review is suspended.
        @NameInMap("AuditStatus")
        public String auditStatus;

        // The category of the message template. Valid values:
        // 
        // *   **ACCOUNT_UPDATE**: account update
        // *   **PAYMENT_UPDATE**: payment update
        // *   **PERSONAL_FINANCE\_UPDATE**: personal finance update
        // *   **SHIPPING_UPDATE**: traffic update
        // *   **RESERVATION_UPDATE**: reservation update
        // *   **ISSUE_RESOLUTION**: issue resolution
        // *   **APPOINTMENT_UPDATE**: appointment update
        // *   **TRANSPORTATION_UPDATE**: logistics information update
        // *   **TICKET_UPDATE**: ticket update
        // *   **ALERT_UPDATE**: alert update
        // *   **AUTO_REPLY**: auto reply
        @NameInMap("Category")
        public String category;

        // The language that is used in the message template.
        @NameInMap("Language")
        public String language;

        // The code of the message template.
        @NameInMap("TemplateCode")
        public String templateCode;

        // The name of the message template.
        @NameInMap("TemplateName")
        public String templateName;

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

    }

}
