// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Contents")
    public java.util.List<CreateReportRequestContents> contents;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client</p>
     */
    @NameInMap("DdFrom")
    public String ddFrom;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdfafdsfsafdfsaf</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantContext")
    public CreateReportRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ToChat")
    public Boolean toChat;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ToCids")
    public java.util.List<String> toCids;

    /**
     * <strong>example:</strong>
     * <p>[123,456]</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <h3>序号1</h3>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>markdown</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>今日完成工作</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Sort")
        public Long sort;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
