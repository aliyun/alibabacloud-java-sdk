// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    /**
     * <p>The workspace accessibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): The dataset is accessible only to you and the administrator of the workspace.</li>
     * <li>PUBLIC: The dataset is accessible to all members in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("AccessibleRoleIdList")
    public java.util.List<String> accessibleRoleIdList;

    /**
     * <p>The data source type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>NAS</li>
     * <li>OSS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li>COMMON (default)</li>
     * <li>PIC</li>
     * <li>TEXT</li>
     * <li>Video</li>
     * <li>AUDIO</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-c0h44g3****j8o4348</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The dataset description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The time when the dataset was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the dataset was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The dataset import information, such as OSS, NAS, and CPFS.</p>
     * <p><strong>OSS</strong></p>
     * <p>{ &quot;region&quot;: &quot;${region}&quot;,//The region ID. &quot;bucket&quot;: &quot;${bucket}&quot;,//The bucket name. &quot;path&quot;: &quot;${path}&quot; //The file path. }</p>
     * <p><strong>NAS</strong></p>
     * <p><strong>CPFS</strong></p>
     * <p><strong>CPFS for Lingjun</strong></p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;region&quot;: &quot;cn-wulanchabu&quot;,
     *     &quot;fileSystemId&quot;: &quot;bmcpfs-xxxxxxxxxxx&quot;,
     *     &quot;path&quot;: &quot;/mnt&quot;,
     *     &quot;mountTarget&quot;: &quot;cpfs-xxxxxxxxxxxx-vpc-gacs9f.cn-wulanchabu.cpfs.aliyuncs.com&quot;,
     *     &quot;isVpcMount&quot;: true
     * }</p>
     */
    @NameInMap("ImportInfo")
    public String importInfo;

    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>The labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The latest dataset version.</p>
     */
    @NameInMap("LatestVersion")
    public DatasetVersion latestVersion;

    /**
     * <p>MountAccess</p>
     * 
     * <strong>example:</strong>
     * <p>RO RW</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>The IDs of the roles that have read and write permissions on the dataset in the workspace. The IDs starting with PAI is the IDs of the basic roles, and the IDs starting with role- is the IDs of the custom roles. If the list contains &quot;\*&quot;, all roles have read and write permissions.</p>
     */
    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <p>The dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended field that can be used as an option. The value is a JSON string. When you use the dataset in Deep Learning Containers (DLC), you can use the mountPath field to specify the default mount path of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
     * }</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1631044****3440</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The dataset property. Valid values:</p>
     * <ul>
     * <li>FILE</li>
     * <li>DIRECTORY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The provider type of the dataset. Valid values:</p>
     * <ul>
     * <li>Ecs (default)</li>
     * <li>Lingjun</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    @NameInMap("SharedFrom")
    public DatasetShareRelationship sharedFrom;

    @NameInMap("SharingConfig")
    public DatasetSharingConfig sharingConfig;

    /**
     * <p>The ID of the source dataset for the labeled dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bvfasdfxxxxj8o411</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The version of the source dataset for the labeled dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("SourceDatasetVersion")
    public String sourceDatasetVersion;

    /**
     * <p>The source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type.
     * Valid values:</p>
     * <ul>
     * <li>PAI_PUBLIC_DATASET</li>
     * <li>ITAG</li>
     * <li>USER</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The labeling template of the iTAG labeled dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>text-classification</p>
     */
    @NameInMap("TagTemplateType")
    public String tagTemplateType;

    /**
     * <p>URI examples:</p>
     * <ul>
     * <li>Object Storage Service (OSS) data source: <code>oss://bucket.endpoint/object</code></li>
     * <li>File Storage NAS (NAS) data source: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code></li>
     * <li>Cloud Parallel File Storage (CPFS) 1.0 data source: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code></li>
     * <li>CPFS 2.0 data source: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code></li>
     * </ul>
     * <blockquote>
     * <p> You can distinguish CPFS 1.0 and CPFS 2.0 file systems based on the format of the file system ID: The ID of the CPFS 1.0 file system is in the cpfs-&lt;8-bit ASCII characters&gt; format. The ID of the CPFS 2.0 file system is in the cpfs-&lt;16-bit ASCII characters&gt; format.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>nas://09f****f2.cn-hangzhou/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2485765****023475</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the workspace to which the dataset belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
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

    public Dataset setAccessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
        this.accessibleRoleIdList = accessibleRoleIdList;
        return this;
    }
    public java.util.List<String> getAccessibleRoleIdList() {
        return this.accessibleRoleIdList;
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

    public Dataset setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
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

    public Dataset setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
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

    public Dataset setSharedFrom(DatasetShareRelationship sharedFrom) {
        this.sharedFrom = sharedFrom;
        return this;
    }
    public DatasetShareRelationship getSharedFrom() {
        return this.sharedFrom;
    }

    public Dataset setSharingConfig(DatasetSharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
        return this;
    }
    public DatasetSharingConfig getSharingConfig() {
        return this.sharingConfig;
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

    public static class DatasetSharingConfig extends TeaModel {
        @NameInMap("SharedTo")
        public java.util.List<DatasetShareRelationship> sharedTo;

        public static DatasetSharingConfig build(java.util.Map<String, ?> map) throws Exception {
            DatasetSharingConfig self = new DatasetSharingConfig();
            return TeaModel.build(map, self);
        }

        public DatasetSharingConfig setSharedTo(java.util.List<DatasetShareRelationship> sharedTo) {
            this.sharedTo = sharedTo;
            return this;
        }
        public java.util.List<DatasetShareRelationship> getSharedTo() {
            return this.sharedTo;
        }

    }

}
