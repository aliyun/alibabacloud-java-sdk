// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateReportRequest extends TeaModel {
    @NameInMap("Contents")
    public java.util.List<CreateReportRequestContents> contents;

    @NameInMap("DdFrom")
    public String ddFrom;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantContext")
    public CreateReportRequestTenantContext tenantContext;

    @NameInMap("ToChat")
    public Boolean toChat;

    @NameInMap("ToCids")
    public java.util.List<String> toCids;

    @NameInMap("ToUserids")
    public java.util.List<String> toUserids;

    public static CreateReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportRequest self = new CreateReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportRequest setContents(java.util.List<CreateReportRequestContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<CreateReportRequestContents> getContents() {
        return this.contents;
    }

    public CreateReportRequest setDdFrom(String ddFrom) {
        this.ddFrom = ddFrom;
        return this;
    }
    public String getDdFrom() {
        return this.ddFrom;
    }

    public CreateReportRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateReportRequest setTenantContext(CreateReportRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateReportRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateReportRequest setToChat(Boolean toChat) {
        this.toChat = toChat;
        return this;
    }
    public Boolean getToChat() {
        return this.toChat;
    }

    public CreateReportRequest setToCids(java.util.List<String> toCids) {
        this.toCids = toCids;
        return this;
    }
    public java.util.List<String> getToCids() {
        return this.toCids;
    }

    public CreateReportRequest setToUserids(java.util.List<String> toUserids) {
        this.toUserids = toUserids;
        return this;
    }
    public java.util.List<String> getToUserids() {
        return this.toUserids;
    }

    public static class CreateReportRequestContents extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Key")
        public String key;

        @NameInMap("Sort")
        public Long sort;

        @NameInMap("Type")
        public Long type;

        public static CreateReportRequestContents build(java.util.Map<String, ?> map) throws Exception {
            CreateReportRequestContents self = new CreateReportRequestContents();
            return TeaModel.build(map, self);
        }

        public CreateReportRequestContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateReportRequestContents setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateReportRequestContents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateReportRequestContents setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public CreateReportRequestContents setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class CreateReportRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateReportRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateReportRequestTenantContext self = new CreateReportRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateReportRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
