// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    /**
     * <p>The visibility of the dataset in the workspace. Valid values:</p>
     * <ul>
     * <li><p><code>PRIVATE</code>: The dataset is visible only to its owner and workspace administrators.</p>
     * </li>
     * <li><p><code>PUBLIC</code>: The dataset is visible to all members in the workspace.</p>
     * </li>
     * <li><p><code>ROLE_PUBLIC</code>: The dataset is visible to specific workspace roles. For the list of roles, see the <code>AccessibleRoleIdList</code> parameter. The dataset owner and workspace administrators can always view the dataset.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>A list of workspace role IDs that can view the dataset. This parameter takes effect only when <code>Accessibility</code> is set to <code>ROLE_PUBLIC</code>. A role ID that starts with <code>PAI</code> is a basic role ID. A role ID that starts with <code>role-</code> is a custom role ID.</p>
     */
    @NameInMap("AccessibleRoleIdList")
    public java.util.List<String> accessibleRoleIdList;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li><p><code>OSS</code>: Object Storage Service (OSS).</p>
     * </li>
     * <li><p><code>NAS</code>: Apsara File Storage NAS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The data type of the dataset. Valid values:</p>
     * <ul>
     * <li><p><code>COMMON</code>: General data</p>
     * </li>
     * <li><p><code>PIC</code>: images</p>
     * </li>
     * <li><p><code>TEXT</code>: text</p>
     * </li>
     * <li><p><code>VIDEO</code>: videos</p>
     * </li>
     * <li><p><code>AUDIO</code>: audio</p>
     * </li>
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
     * <p>d-rbvg5wz****c9ks92</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The description of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>用于标注的数据。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The edition of the dataset. Valid values:</p>
     * <ul>
     * <li><p><code>BASIC</code>: The basic edition, which does not support file metadata management.</p>
     * </li>
     * <li><p><code>ADVANCED</code>: The advanced edition, which is supported only for OSS datasets and allows you to manage metadata for up to 1 million files per version.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The time when the dataset was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the dataset was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The storage import configuration of the dataset. Storage services such as OSS, NAS, and CPFS are supported.</p>
     * <details>
     * 
     * <summary>
     * 
     * <p>OSS</p>
     * </summary>
     * 
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;bucket&quot;: &quot;${bucket}&quot;,// The bucket name.\
     * &quot;path&quot;: &quot;${path}&quot; // The path to the file or folder.\
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
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.\
     * &quot;path&quot;: &quot;${path}&quot;, // The path in the file system.\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The file system mount target.\
     * }</p>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>CPFS</p>
     * </summary>
     * 
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.\
     * &quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The protocol service ID.\
     * &quot;exportId&quot;: &quot;${export_id}&quot;, // The export directory ID.\
     * &quot;path&quot;: &quot;${path}&quot;, // The path in the file system.\
     * }</p>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>CPFS for Intelligent Computing</p>
     * </summary>
     * 
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.\
     * &quot;path&quot;: &quot;${path}&quot;, // The path in the file system.\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The file system mount target. This parameter is specific to CPFS for Intelligent Computing.\
     * &quot;isVpcMount&quot;: boolean, // Specifies whether the mount target is a VPC mount target. Specific to CPFS for Intelligent Computing.\
     * }</p>
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
     * <p>Indicates whether the dataset is a shared dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>The labels attached to the dataset.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The latest version of the dataset.</p>
     */
    @NameInMap("LatestVersion")
    public DatasetVersion latestVersion;

    /**
     * <p>The mount permissions for the dataset. Valid values:</p>
     * <ul>
     * <li><p><code>RO</code>: read-only mount</p>
     * </li>
     * <li><p><code>RW</code>: read and write mount</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RW</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>A list of workspace role IDs granted read/write permissions for the dataset. A role ID that starts with <code>PAI</code> is a basic role ID. A role ID that starts with <code>role-</code> is a custom role ID. If the list contains <code>*</code>, all roles have read and write permissions.</p>
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
     * <p>Extended properties for the initial dataset version (v1), in JSON string format. For example, when using the dataset in a DLC job, you can set the <code>mountPath</code> field to specify the default mount path.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
     * }</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The owner ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1631044****3440</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The property of the initial dataset version (v1). Valid values:</p>
     * <ul>
     * <li><p><code>FILE</code>: The dataset is a file.</p>
     * </li>
     * <li><p><code>DIRECTORY</code>: The dataset is a folder.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The provider of the dataset. If the value is <code>pai</code>, the dataset is a PAI public dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The type of the data source provider. Valid values:</p>
     * <ul>
     * <li><p><code>ECS</code> (default)</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source from which the dataset was shared. This parameter is returned only if <code>IsShared</code> is <code>true</code>.</p>
     */
    @NameInMap("SharedFrom")
    public DatasetShareRelationship sharedFrom;

    /**
     * <p>The sharing configuration for the dataset.</p>
     */
    @NameInMap("SharingConfig")
    public GetDatasetResponseBodySharingConfig sharingConfig;

    /**
     * <p>The ID of the source dataset for the iTAG annotation set.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rcdg3wxxxxxhc5jk87</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The version of the source dataset for the annotation set.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("SourceDatasetVersion")
    public String sourceDatasetVersion;

    /**
     * <p>The ID of the data source for the initial version (v1). The meaning of this parameter varies based on the <code>SourceType</code> value.</p>
     * <ul>
     * <li><p>If <code>SourceType</code> is <code>USER</code>, you can specify a custom value for <code>SourceId</code>.</p>
     * </li>
     * <li><p>If <code>SourceType</code> is <code>ITAG</code>, the dataset is generated from an iTAG annotation task, and <code>SourceId</code> is the task ID.</p>
     * </li>
     * <li><p>If <code>SourceType</code> is <code>PAI_PUBLIC_DATASET</code>, the dataset is created from a PAI public dataset. In this case, <code>SourceId</code> is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type of the initial dataset version (v1).</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The annotation template of the iTAG annotation set.</p>
     * 
     * <strong>example:</strong>
     * <p>TextClassification</p>
     */
    @NameInMap("TagTemplateType")
    public String tagTemplateType;

    /**
     * <p>The URI of the initial dataset version (v1). The supported formats are as follows:</p>
     * <ul>
     * <li><p>For an OSS data source: <code>oss://bucket.endpoint/object</code>.</p>
     * </li>
     * <li><p>For a NAS data source, the format varies by NAS type:</p>
     * <p>CPFS 1.0 and CPFS 2.0 are distinguished by the format of the file system ID ():</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nas://09f****f2.cn-hangzhou/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The user ID of the dataset owner.</p>
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

    public static GetDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponseBody self = new GetDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetDatasetResponseBody setAccessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
        this.accessibleRoleIdList = accessibleRoleIdList;
        return this;
    }
    public java.util.List<String> getAccessibleRoleIdList() {
        return this.accessibleRoleIdList;
    }

    public GetDatasetResponseBody setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetDatasetResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDatasetResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetDatasetResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDatasetResponseBody setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public GetDatasetResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetDatasetResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetDatasetResponseBody setImportInfo(String importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public String getImportInfo() {
        return this.importInfo;
    }

    public GetDatasetResponseBody setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public GetDatasetResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetDatasetResponseBody setLatestVersion(DatasetVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public DatasetVersion getLatestVersion() {
        return this.latestVersion;
    }

    public GetDatasetResponseBody setMountAccess(String mountAccess) {
        this.mountAccess = mountAccess;
        return this;
    }
    public String getMountAccess() {
        return this.mountAccess;
    }

    public GetDatasetResponseBody setMountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
        this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
        return this;
    }
    public java.util.List<String> getMountAccessReadWriteRoleIdList() {
        return this.mountAccessReadWriteRoleIdList;
    }

    public GetDatasetResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDatasetResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public GetDatasetResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetDatasetResponseBody setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public GetDatasetResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetDatasetResponseBody setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public GetDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetResponseBody setSharedFrom(DatasetShareRelationship sharedFrom) {
        this.sharedFrom = sharedFrom;
        return this;
    }
    public DatasetShareRelationship getSharedFrom() {
        return this.sharedFrom;
    }

    public GetDatasetResponseBody setSharingConfig(GetDatasetResponseBodySharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
        return this;
    }
    public GetDatasetResponseBodySharingConfig getSharingConfig() {
        return this.sharingConfig;
    }

    public GetDatasetResponseBody setSourceDatasetId(String sourceDatasetId) {
        this.sourceDatasetId = sourceDatasetId;
        return this;
    }
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    public GetDatasetResponseBody setSourceDatasetVersion(String sourceDatasetVersion) {
        this.sourceDatasetVersion = sourceDatasetVersion;
        return this;
    }
    public String getSourceDatasetVersion() {
        return this.sourceDatasetVersion;
    }

    public GetDatasetResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetDatasetResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetDatasetResponseBody setTagTemplateType(String tagTemplateType) {
        this.tagTemplateType = tagTemplateType;
        return this;
    }
    public String getTagTemplateType() {
        return this.tagTemplateType;
    }

    public GetDatasetResponseBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public GetDatasetResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetDatasetResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetDatasetResponseBodySharingConfig extends TeaModel {
        /**
         * <p>A list of relationships indicating to whom the dataset is shared.</p>
         */
        @NameInMap("SharedTo")
        public java.util.List<DatasetShareRelationship> sharedTo;

        public static GetDatasetResponseBodySharingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodySharingConfig self = new GetDatasetResponseBodySharingConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodySharingConfig setSharedTo(java.util.List<DatasetShareRelationship> sharedTo) {
            this.sharedTo = sharedTo;
            return this;
        }
        public java.util.List<DatasetShareRelationship> getSharedTo() {
            return this.sharedTo;
        }

    }

}
