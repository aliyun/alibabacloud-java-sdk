// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>OSS URL</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <strong>example:</strong>
     * <p>COMMON PIC TEXT VIDEO AUDIO</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>d-c0h44g3wlwkj8o4348</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <strong>example:</strong>
     * <p>Animal images.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("ImportInfo")
    public String importInfo;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("LatestVersion")
    public DatasetVersion latestVersion;

    /**
     * <strong>example:</strong>
     * <p>RO RW</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <strong>example:</strong>
     * <p>AnimalDataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>jsonstring</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <strong>example:</strong>
     * <p>1004110000006048</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>FILE DIRECTORY TABULAR</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <strong>example:</strong>
     * <p>d-bvfasdf4wxxj8o411</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("SourceDatasetVersion")
    public String sourceDatasetVersion;

    /**
     * <strong>example:</strong>
     * <p>Source Id</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <strong>example:</strong>
     * <p>USER ITAG  PAI_PUBLIC_DATASET</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>text-classification</p>
     */
    @NameInMap("TagTemplateType")
    public String tagTemplateType;

    /**
     * <strong>example:</strong>
     * <p>oss://xxx</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <strong>example:</strong>
     * <p>2004110000006048</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>Workspace Id</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Dataset build(java.util.Map<String, ?> map) throws Exception {
        Dataset self = new Dataset();
        return TeaModel.build(map, self);
    }

    public Dataset setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Dataset setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public Dataset setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public Dataset setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public Dataset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Dataset setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Dataset setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Dataset setImportInfo(String importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public String getImportInfo() {
        return this.importInfo;
    }

    public Dataset setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public Dataset setLatestVersion(DatasetVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public DatasetVersion getLatestVersion() {
        return this.latestVersion;
    }

    public Dataset setMountAccess(String mountAccess) {
        this.mountAccess = mountAccess;
        return this;
    }
    public String getMountAccess() {
        return this.mountAccess;
    }

    public Dataset setMountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
        this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
        return this;
    }
    public java.util.List<String> getMountAccessReadWriteRoleIdList() {
        return this.mountAccessReadWriteRoleIdList;
    }

    public Dataset setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Dataset setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public Dataset setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Dataset setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public Dataset setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public Dataset setSourceDatasetId(String sourceDatasetId) {
        this.sourceDatasetId = sourceDatasetId;
        return this;
    }
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    public Dataset setSourceDatasetVersion(String sourceDatasetVersion) {
        this.sourceDatasetVersion = sourceDatasetVersion;
        return this;
    }
    public String getSourceDatasetVersion() {
        return this.sourceDatasetVersion;
    }

    public Dataset setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public Dataset setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public Dataset setTagTemplateType(String tagTemplateType) {
        this.tagTemplateType = tagTemplateType;
        return this;
    }
    public String getTagTemplateType() {
        return this.tagTemplateType;
    }

    public Dataset setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public Dataset setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Dataset setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
