// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateShrinkRequest extends TeaModel {
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
    public String pageShrink;

    public static ListChatappTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatappTemplateShrinkRequest self = new ListChatappTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListChatappTemplateShrinkRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public ListChatappTemplateShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListChatappTemplateShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public ListChatappTemplateShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public ListChatappTemplateShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListChatappTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListChatappTemplateShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

}
