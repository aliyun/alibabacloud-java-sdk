// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    /**
     * <p>The visibility of the dataset in the workspace. Valid values:</p>
     * <ul>
     * <li><p><code>PRIVATE</code>: Visible only to the dataset\&quot;s owner and administrators.</p>
     * </li>
     * <li><p><code>PUBLIC</code>: The dataset is visible to all users in the workspace.</p>
     * </li>
     * <li><p><code>ROLE_PUBLIC</code>: Visible to specified workspace roles (see <code>AccessibleRoleIdList</code>). The owner and administrators also have visibility.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>If <code>Accessibility</code> is <code>ROLE_PUBLIC</code>, this parameter lists the IDs of workspace roles that can view the dataset. Role IDs that start with <code>PAI</code> are built-in roles, and those that start with <code>role-</code> are custom roles.</p>
     */
    @NameInMap("AccessibleRoleIdList")
    public java.util.List<String> accessibleRoleIdList;

    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The data type of the dataset. Valid values:</p>
     * <ul>
     * <li><p><code>COMMON</code>: (Default) Common data.</p>
     * </li>
     * <li><p><code>PIC</code>: Images.</p>
     * </li>
     * <li><p><code>TEXT</code>: Text.</p>
     * </li>
     * <li><p><code>VIDEO</code>: Videos.</p>
     * </li>
     * <li><p><code>AUDIO</code>: Audio.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The ID of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-c0h44g3****j8o4348</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The description of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of a dataset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The edition of the dataset. Valid values:</p>
     * <p><code>BASIC</code>: The basic edition. This edition does not support file metadata management.
     * <code>ADVANCED</code>: The advanced edition. This edition is supported only for OSS datasets and allows metadata management for up to 1 million files per version.</p>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The configuration for importing data from a storage source. Supported sources include OSS, NAS, and CPFS.</p>
     * <details>
     * 
     * <summary>
     * 
     * <p>OSS</p>
     * </summary>
     * 
     * <p>{
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.
     * &quot;bucket&quot;: &quot;${bucket}&quot;,// The bucket name.
     * &quot;path&quot;: &quot;${path}&quot; // The file path.
     * }</p>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>NAS</p>
     * </summary>
     * 
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>CPFS</p>
     * </summary>
     * 
     * <p>Content</p>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>Intelligent Computing CPFS</p>
     * </summary>
     * 
     * <p>Content</p>
     * </details>
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

    /**
     * <p>Indicates whether the dataset is shared.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>A list of labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>Details of the latest dataset version.</p>
     */
    @NameInMap("LatestVersion")
    public DatasetVersion latestVersion;

    /**
     * <p>The mount access permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>RO RW</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>A list of IDs for workspace roles with read and write permissions on the dataset. Role IDs that start with <code>PAI</code> are built-in roles, and role IDs that start with <code>role-</code> are custom roles. An asterisk (<code>*</code>) indicates that all roles have read and write permissions.</p>
     */
    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A JSON string of extended options. When you use the dataset in a Data Lake Compute job, you can configure the <code>mountPath</code> field to specify the default mount path for the dataset.</p>
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
     * <p>Indicates whether the dataset corresponds to a single file or a directory. Valid values:</p>
     * <ul>
     * <li><p><code>FILE</code>: The dataset is a file.</p>
     * </li>
     * <li><p><code>DIRECTORY</code>: The dataset is a directory.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The type of the data source provider. Valid values:</p>
     * <ul>
     * <li><p><code>ECS</code> (Default)</p>
     * </li>
     * <li><p><code>Lingjun</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>The source of the shared dataset. This parameter is valid only when <code>IsShared</code> is <code>true</code>.</p>
     */
    @NameInMap("SharedFrom")
    public DatasetShareRelationship sharedFrom;

    /**
     * <p>The sharing configuration for the dataset.</p>
     */
    @NameInMap("SharingConfig")
    public DatasetSharingConfig sharingConfig;

    /**
     * <p>The ID of the source dataset for the annotated dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bvfasdfxxxxj8o411</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The version of the source dataset for the annotated dataset.</p>
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
     * <p>The source type.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The annotation template for the iTAG annotated dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>text-classification</p>
     */
    @NameInMap("TagTemplateType")
    public String tagTemplateType;

    /**
     * <p>URI examples:</p>
     * <ul>
     * <li><p>OSS data source:
     * <code>oss://bucket.endpoint/object</code></p>
     * </li>
     * <li><p>General-purpose NAS data source:
     * <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code></p>
     * </li>
     * <li><p>CPFS 1.0 data source:
     * <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code></p>
     * </li>
     * <li><p>CPFS 2.0 data source:
     * <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The format of the <code>fsid</code> distinguishes CPFS 1.0 from CPFS 2.0. A CPFS 1.0 <code>fsid</code> has the format <code>cpfs-&lt;8-character ASCII string&gt;</code>, and a CPFS 2.0 <code>fsid</code> has the format <code>cpfs-&lt;16-character ASCII string&gt;</code>.</p>
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
     * <p>The ID of the workspace where the dataset is located.</p>
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
        /**
         * <p>A list of sharing relationships.</p>
         */
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
