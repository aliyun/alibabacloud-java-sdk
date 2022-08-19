// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ListTemplate")
    public java.util.List<ListChatappTemplateResponseBodyListTemplate> listTemplate;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("Category")
        public String category;

        @NameInMap("Language")
        public String language;

        @NameInMap("TemplateCode")
        public String templateCode;

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
