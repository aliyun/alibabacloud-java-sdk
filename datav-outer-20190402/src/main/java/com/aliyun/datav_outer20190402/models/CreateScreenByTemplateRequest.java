// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateScreenByTemplateRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("TemplateId")
    public Integer templateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public Integer projectId;

    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    @NameInMap("Association")
    public String association;

    @NameInMap("Thumbnail")
    public String thumbnail;

    @NameInMap("DataSourceJSON")
    public String dataSourceJSON;

    @NameInMap("DataSource")
    public java.util.List<CreateScreenByTemplateRequestDataSource> dataSource;

    public static CreateScreenByTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenByTemplateRequest self = new CreateScreenByTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateScreenByTemplateRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateScreenByTemplateRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateScreenByTemplateRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateScreenByTemplateRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public CreateScreenByTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScreenByTemplateRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public CreateScreenByTemplateRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateScreenByTemplateRequest setAssociation(String association) {
        this.association = association;
        return this;
    }
    public String getAssociation() {
        return this.association;
    }

    public CreateScreenByTemplateRequest setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public CreateScreenByTemplateRequest setDataSourceJSON(String dataSourceJSON) {
        this.dataSourceJSON = dataSourceJSON;
        return this;
    }
    public String getDataSourceJSON() {
        return this.dataSourceJSON;
    }

    public CreateScreenByTemplateRequest setDataSource(java.util.List<CreateScreenByTemplateRequestDataSource> dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public java.util.List<CreateScreenByTemplateRequestDataSource> getDataSource() {
        return this.dataSource;
    }

    public static class CreateScreenByTemplateRequestDataSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Config")
        public String config;

        public static CreateScreenByTemplateRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            CreateScreenByTemplateRequestDataSource self = new CreateScreenByTemplateRequestDataSource();
            return TeaModel.build(map, self);
        }

        public CreateScreenByTemplateRequestDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateScreenByTemplateRequestDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScreenByTemplateRequestDataSource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
