// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>The visibility of the dataset in the workspace. Valid values:</p>
     * <ul>
     * <li><p>PRIVATE (default): The dataset is visible only to its owner and administrators in the workspace.</p>
     * </li>
     * <li><p>PUBLIC: The dataset is visible to all users in the workspace.</p>
     * </li>
     * <li><p>ROLE_PUBLIC: The dataset is visible to users with specific workspace roles. The list of roles is specified in the <code>AccessibleRoleIdList</code> parameter. The dataset owner and administrators always retain visibility.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>This parameter takes effect only when <code>Accessibility</code> is set to <code>ROLE_PUBLIC</code>. This parameter specifies a list of workspace role IDs that can view this dataset. Role IDs that start with <code>PAI.</code> are built-in roles, and role IDs that start with <code>role-</code> are custom roles.</p>
     */
    @NameInMap("AccessibleRoleIdList")
    public java.util.List<String> accessibleRoleIdList;

    /**
     * <p>The number of files in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The size of the dataset files, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p>OSS: Object Storage Service (OSS).</p>
     * </li>
     * <li><p>NAS: general-purpose Apsara File Storage NAS.</p>
     * </li>
     * <li><p>EXTREMENAS: Extreme NAS.</p>
     * </li>
     * <li><p>CPFS: general-purpose Cloud Parallel File Storage (CPFS).</p>
     * </li>
     * <li><p>BMCPFS: AI Computing Edition of CPFS.</p>
     * </li>
     * <li><p>MAXCOMPUTE: MaxCompute.</p>
     * </li>
     * <li><p>URL: a public HTTP or HTTPS URL.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The data type of the dataset. The default value is <code>COMMON</code>. Valid values:</p>
     * <ul>
     * <li><p>COMMON: common</p>
     * </li>
     * <li><p>PIC: image</p>
     * </li>
     * <li><p>TEXT: text</p>
     * </li>
     * <li><p>VIDEO: video</p>
     * </li>
     * <li><p>AUDIO: audio</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>A custom description to distinguish the dataset from other datasets.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The edition of the dataset. The default value is BASIC. Valid values:</p>
     * <ul>
     * <li><p>BASIC: Basic. Does not support dataset file metadata management.</p>
     * </li>
     * <li><p>ADVANCED: Advanced. Supported only for OSS datasets. Each version supports metadata management for up to 1 million files.</p>
     * </li>
     * <li><p>LOGICAL: Logical. Supported only for OSS datasets. Each version supports metadata management for up to 3 million files.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADVANCED</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The storage import configuration of the dataset. <code>OSS</code>, <code>NAS</code>, and <code>CPFS</code> are supported.</p>
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
     * &quot;path&quot;: &quot;${path}&quot; // The file path.\
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
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount target of the file system.\
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
     * &quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The protocol service of the file system.\
     * &quot;exportId&quot;: &quot;${export_id}&quot;, // The exported directory of the file system.\
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.\
     * }</p>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>CPFS (AI Computing Edition)</p>
     * </summary>
     * 
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.\
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot;, // The mount target of the file system. This parameter is specific to the AI Computing Edition.\
     * &quot;isVpcMount&quot;: boolean, // Specifies whether the mount target is in a VPC. This parameter is specific to the AI Computing Edition.\
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
     * <p>A list of labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>A list of workspace role IDs that are granted read and write permissions when the dataset is mounted. Role IDs that start with <code>PAI.</code> are built-in roles, and role IDs that start with <code>role-</code> are custom roles. If the list contains an asterisk (\*), all roles are granted read and write permissions.</p>
     * <ul>
     * <li><p>Accounts with specified roles: <code>[&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;]</code></p>
     * </li>
     * <li><p>All accounts: <code>[&quot;*&quot;]</code></p>
     * </li>
     * <li><p>Dataset creator only: <code>[]</code></p>
     * </li>
     * </ul>
     */
    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <p>The name of the dataset. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>Starts with a lowercase letter, an uppercase letter, a number, or a Chinese character.</p>
     * </li>
     * <li><p>Can contain underscores (_) and hyphens (-).</p>
     * </li>
     * <li><p>Must be 1 to 127 characters long.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended fields, which are a JSON string.
     * When a Data Lake Compute (DLC) job uses the dataset, you can configure the <code>mountPath</code> field to specify the default mount path of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
     * }</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The property of the dataset. Valid values:</p>
     * <ul>
     * <li><p>FILE: A file.</p>
     * </li>
     * <li><p>DIRECTORY: A directory.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The provider of the dataset. You cannot set this parameter to <code>pai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Github</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The type of the data source provider. Valid values:</p>
     * <ul>
     * <li><p>Ecs (default)</p>
     * </li>
     * <li><p>Lingjun</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>The ID of the source dataset for a labeled dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bvfasdfxxxxj8o411</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The version of the source dataset for a labeled dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("SourceDatasetVersion")
    public String sourceDatasetVersion;

    /**
     * <p>The ID of the data source.</p>
     * <ul>
     * <li><p>If <code>SourceType</code> is <code>USER</code>, you can specify a custom value for <code>SourceId</code>.</p>
     * </li>
     * <li><p>If <code>SourceType</code> is <code>ITAG</code>, this parameter specifies the iTAG task ID from which the dataset was generated.</p>
     * </li>
     * <li><p>If <code>SourceType</code> is <code>PAI_PUBLIC_DATASET</code>, the dataset is from a public PAI dataset, and this parameter is empty by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source of the data. The default value is USER.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI of the data. The URI format varies based on the <code>DataSourceType</code> value.</p>
     * <ul>
     * <li><p>For an <code>OSS</code> data source: <code>oss://bucket.endpoint/object</code></p>
     * </li>
     * <li><p>For a <code>NAS</code> data source:
     * For general-purpose <code>NAS</code>: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>.
     * For <code>CPFS</code> 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>.
     * For <code>CPFS</code> 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
     * <code>CPFS</code> 1.0 and <code>CPFS</code> 2.0 are distinguished by the format of the file system ID (fsid). The fsid for <code>CPFS</code> 1.0 is in the <code>cpfs-&lt;8-character ASCII string&gt;</code> format. The fsid for <code>CPFS</code> 2.0 is in the <code>cpfs-&lt;16-character ASCII string&gt;</code> format.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nas://09f****f2.cn-hangzhou/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The Alibaba Cloud account ID of the dataset owner. Workspace owners and administrators can create datasets for specified members of a workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>2485765****023475</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The description of the initial version of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the first dataset version.</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>A list of labels for the initial version.</p>
     */
    @NameInMap("VersionLabels")
    public java.util.List<Label> versionLabels;

    /**
     * <p>The ID of the workspace to which the dataset belongs. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.
     * If this parameter is not specified, the default workspace is used. If the default workspace does not exist, an error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateDatasetRequest setAccessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
        this.accessibleRoleIdList = accessibleRoleIdList;
        return this;
    }
    public java.util.List<String> getAccessibleRoleIdList() {
        return this.accessibleRoleIdList;
    }

    public CreateDatasetRequest setDataCount(Long dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Long getDataCount() {
        return this.dataCount;
    }

    public CreateDatasetRequest setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public CreateDatasetRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDatasetRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasetRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public CreateDatasetRequest setImportInfo(String importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public String getImportInfo() {
        return this.importInfo;
    }

    public CreateDatasetRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateDatasetRequest setMountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
        this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
        return this;
    }
    public java.util.List<String> getMountAccessReadWriteRoleIdList() {
        return this.mountAccessReadWriteRoleIdList;
    }

    public CreateDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasetRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateDatasetRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public CreateDatasetRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateDatasetRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public CreateDatasetRequest setSourceDatasetId(String sourceDatasetId) {
        this.sourceDatasetId = sourceDatasetId;
        return this;
    }
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    public CreateDatasetRequest setSourceDatasetVersion(String sourceDatasetVersion) {
        this.sourceDatasetVersion = sourceDatasetVersion;
        return this;
    }
    public String getSourceDatasetVersion() {
        return this.sourceDatasetVersion;
    }

    public CreateDatasetRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateDatasetRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateDatasetRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public CreateDatasetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateDatasetRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreateDatasetRequest setVersionLabels(java.util.List<Label> versionLabels) {
        this.versionLabels = versionLabels;
        return this;
    }
    public java.util.List<Label> getVersionLabels() {
        return this.versionLabels;
    }

    public CreateDatasetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
