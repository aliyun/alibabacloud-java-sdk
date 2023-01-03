// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateRequest extends TeaModel {
    // The review status of the message template. Valid values:
    // 
    // *   **pass**: The message template is approved.
    // *   **fail**: The message template is rejected.
    // *   **auditing**: The message template is being reviewed.
    // *   **unaudit**: The review is suspended.
    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    // The unique identifier of the WhatsApp account that you register.
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    // Assigned by ISV for RAM user authentication and authorization.
    @NameInMap("IsvCode")
    public String isvCode;

    // The language that is used in the message template.
    @NameInMap("Language")
    public String language;

    // The name of the message template.
    @NameInMap("Name")
    public String name;

    // The paging settings.
    @NameInMap("Page")
    public ListChatappTemplateRequestPage page;

    public static ListChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatappTemplateRequest self = new ListChatappTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListChatappTemplateRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public ListChatappTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListChatappTemplateRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public ListChatappTemplateRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public ListChatappTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListChatappTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListChatappTemplateRequest setPage(ListChatappTemplateRequestPage page) {
        this.page = page;
        return this;
    }
    public ListChatappTemplateRequestPage getPage() {
        return this.page;
    }

    public static class ListChatappTemplateRequestPage extends TeaModel {
        // The number of the page to return. Default value: 1.
        @NameInMap("Index")
        public Integer index;

        // The number of message templates to return on each page. Default value: 10.
        @NameInMap("Size")
        public Integer size;

        public static ListChatappTemplateRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListChatappTemplateRequestPage self = new ListChatappTemplateRequestPage();
            return TeaModel.build(map, self);
        }

        public ListChatappTemplateRequestPage setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListChatappTemplateRequestPage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
