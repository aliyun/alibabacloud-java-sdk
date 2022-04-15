// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateRequest extends TeaModel {
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

    public ListChatappTemplateRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
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
        // 查询开始数
        @NameInMap("Index")
        public Integer index;

        // 每次查询返回的条数
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
