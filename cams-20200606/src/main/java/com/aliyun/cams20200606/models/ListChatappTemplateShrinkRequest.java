// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateShrinkRequest extends TeaModel {
    // 审核状态
    @NameInMap("AuditStatus")
    public String auditStatus;

    // ISV客户WabaId
    @NameInMap("CustWabaId")
    public String custWabaId;

    // 语言
    @NameInMap("Language")
    public String language;

    // 模板名称
    @NameInMap("Name")
    public String name;

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

    public ListChatappTemplateShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
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
