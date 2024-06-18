// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Contents")
    public java.util.List<SaveContentRequestContents> contents;

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
    public SaveContentRequestTenantContext tenantContext;

    public static SaveContentRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContentRequest self = new SaveContentRequest();
        return TeaModel.build(map, self);
    }

    public SaveContentRequest setContents(java.util.List<SaveContentRequestContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<SaveContentRequestContents> getContents() {
        return this.contents;
    }

    public SaveContentRequest setDdFrom(String ddFrom) {
        this.ddFrom = ddFrom;
        return this;
    }
    public String getDdFrom() {
        return this.ddFrom;
    }

    public SaveContentRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SaveContentRequest setTenantContext(SaveContentRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SaveContentRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SaveContentRequestContents extends TeaModel {
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
         * <p>1</p>
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

        public static SaveContentRequestContents build(java.util.Map<String, ?> map) throws Exception {
            SaveContentRequestContents self = new SaveContentRequestContents();
            return TeaModel.build(map, self);
        }

        public SaveContentRequestContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SaveContentRequestContents setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public SaveContentRequestContents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SaveContentRequestContents setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public SaveContentRequestContents setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class SaveContentRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static SaveContentRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SaveContentRequestTenantContext self = new SaveContentRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SaveContentRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
