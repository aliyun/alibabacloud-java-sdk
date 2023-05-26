// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceIntegrationDataSource extends TeaModel {
    @NameInMap("clusterType")
    public String clusterType;

    @NameInMap("datasourceId")
    public String datasourceId;

    @NameInMap("datasourceName")
    public String datasourceName;

    @NameInMap("datasourceUrl")
    public String datasourceUrl;

    @NameInMap("description")
    public String description;

    @NameInMap("exploreUrl")
    public String exploreUrl;

    @NameInMap("folderUrl")
    public String folderUrl;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("status")
    public String status;

    @NameInMap("type")
    public String type;

    public static GrafanaWorkspaceIntegrationDataSource build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceIntegrationDataSource self = new GrafanaWorkspaceIntegrationDataSource();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceIntegrationDataSource setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public GrafanaWorkspaceIntegrationDataSource setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public GrafanaWorkspaceIntegrationDataSource setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public GrafanaWorkspaceIntegrationDataSource setDatasourceUrl(String datasourceUrl) {
        this.datasourceUrl = datasourceUrl;
        return this;
    }
    public String getDatasourceUrl() {
        return this.datasourceUrl;
    }

    public GrafanaWorkspaceIntegrationDataSource setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GrafanaWorkspaceIntegrationDataSource setExploreUrl(String exploreUrl) {
        this.exploreUrl = exploreUrl;
        return this;
    }
    public String getExploreUrl() {
        return this.exploreUrl;
    }

    public GrafanaWorkspaceIntegrationDataSource setFolderUrl(String folderUrl) {
        this.folderUrl = folderUrl;
        return this;
    }
    public String getFolderUrl() {
        return this.folderUrl;
    }

    public GrafanaWorkspaceIntegrationDataSource setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrafanaWorkspaceIntegrationDataSource setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GrafanaWorkspaceIntegrationDataSource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
