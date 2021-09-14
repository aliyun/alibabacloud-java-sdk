// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchCreateScreensByTemplatesRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Screens")
    public java.util.List<BatchCreateScreensByTemplatesRequestScreens> screens;

    public static BatchCreateScreensByTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateScreensByTemplatesRequest self = new BatchCreateScreensByTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateScreensByTemplatesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public BatchCreateScreensByTemplatesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BatchCreateScreensByTemplatesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BatchCreateScreensByTemplatesRequest setScreens(java.util.List<BatchCreateScreensByTemplatesRequestScreens> screens) {
        this.screens = screens;
        return this;
    }
    public java.util.List<BatchCreateScreensByTemplatesRequestScreens> getScreens() {
        return this.screens;
    }

    public static class BatchCreateScreensByTemplatesRequestScreensDataSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Config")
        public String config;

        public static BatchCreateScreensByTemplatesRequestScreensDataSource build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateScreensByTemplatesRequestScreensDataSource self = new BatchCreateScreensByTemplatesRequestScreensDataSource();
            return TeaModel.build(map, self);
        }

        public BatchCreateScreensByTemplatesRequestScreensDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchCreateScreensByTemplatesRequestScreensDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchCreateScreensByTemplatesRequestScreensDataSource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

    public static class BatchCreateScreensByTemplatesRequestScreens extends TeaModel {
        @NameInMap("DataSource")
        public java.util.List<BatchCreateScreensByTemplatesRequestScreensDataSource> dataSource;

        @NameInMap("WorkspaceId")
        public Integer workspaceId;

        @NameInMap("ProjectId")
        public Integer projectId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Association")
        public String association;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("DataSourceJSON")
        public String dataSourceJSON;

        public static BatchCreateScreensByTemplatesRequestScreens build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateScreensByTemplatesRequestScreens self = new BatchCreateScreensByTemplatesRequestScreens();
            return TeaModel.build(map, self);
        }

        public BatchCreateScreensByTemplatesRequestScreens setDataSource(java.util.List<BatchCreateScreensByTemplatesRequestScreensDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<BatchCreateScreensByTemplatesRequestScreensDataSource> getDataSource() {
            return this.dataSource;
        }

        public BatchCreateScreensByTemplatesRequestScreens setWorkspaceId(Integer workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Integer getWorkspaceId() {
            return this.workspaceId;
        }

        public BatchCreateScreensByTemplatesRequestScreens setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public BatchCreateScreensByTemplatesRequestScreens setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchCreateScreensByTemplatesRequestScreens setAssociation(String association) {
            this.association = association;
            return this;
        }
        public String getAssociation() {
            return this.association;
        }

        public BatchCreateScreensByTemplatesRequestScreens setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public BatchCreateScreensByTemplatesRequestScreens setDataSourceJSON(String dataSourceJSON) {
            this.dataSourceJSON = dataSourceJSON;
            return this;
        }
        public String getDataSourceJSON() {
            return this.dataSourceJSON;
        }

    }

}
