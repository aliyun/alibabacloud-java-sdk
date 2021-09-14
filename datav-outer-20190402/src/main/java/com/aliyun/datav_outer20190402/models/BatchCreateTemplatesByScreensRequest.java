// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchCreateTemplatesByScreensRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Templates")
    public java.util.List<BatchCreateTemplatesByScreensRequestTemplates> templates;

    public static BatchCreateTemplatesByScreensRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTemplatesByScreensRequest self = new BatchCreateTemplatesByScreensRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateTemplatesByScreensRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public BatchCreateTemplatesByScreensRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BatchCreateTemplatesByScreensRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BatchCreateTemplatesByScreensRequest setTemplates(java.util.List<BatchCreateTemplatesByScreensRequestTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<BatchCreateTemplatesByScreensRequestTemplates> getTemplates() {
        return this.templates;
    }

    public static class BatchCreateTemplatesByScreensRequestTemplates extends TeaModel {
        @NameInMap("WorkspaceId")
        public Integer workspaceId;

        @NameInMap("ScreenId")
        public Integer screenId;

        @NameInMap("Description")
        public String description;

        @NameInMap("KeepDataSource")
        public Boolean keepDataSource;

        @NameInMap("Name")
        public String name;

        @NameInMap("Thumbnail")
        public String thumbnail;

        public static BatchCreateTemplatesByScreensRequestTemplates build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateTemplatesByScreensRequestTemplates self = new BatchCreateTemplatesByScreensRequestTemplates();
            return TeaModel.build(map, self);
        }

        public BatchCreateTemplatesByScreensRequestTemplates setWorkspaceId(Integer workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Integer getWorkspaceId() {
            return this.workspaceId;
        }

        public BatchCreateTemplatesByScreensRequestTemplates setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

        public BatchCreateTemplatesByScreensRequestTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchCreateTemplatesByScreensRequestTemplates setKeepDataSource(Boolean keepDataSource) {
            this.keepDataSource = keepDataSource;
            return this;
        }
        public Boolean getKeepDataSource() {
            return this.keepDataSource;
        }

        public BatchCreateTemplatesByScreensRequestTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchCreateTemplatesByScreensRequestTemplates setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

    }

}
