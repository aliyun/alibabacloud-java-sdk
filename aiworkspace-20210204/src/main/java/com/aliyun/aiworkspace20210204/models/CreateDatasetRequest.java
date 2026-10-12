// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>The workspace visibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE: Visible only to the creator and administrators in the workspace. This is the default value.</li>
     * <li>PUBLIC: Visible to all users in the workspace.</li>
     * <li>ROLE_PUBLIC: Visible to specified workspace roles. For the role list, refer to AccessibleRoleIdList. The dataset owner and administrators always have visibility regardless of the specified roles.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Takes effect only when Accessibility is set to ROLE_PUBLIC. The list of workspace role names that have visibility to the dataset. Role IDs starting with PAI are basic role IDs, and those starting with role- are custom role IDs.</p>
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
     * <p>The storage space occupied by the dataset files. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li>OSS: Alibaba Cloud Object Storage Service (OSS).</li>
     * <li>NAS: Alibaba Cloud File Storage NAS (General-purpose).</li>
     * <li>EXTREMENAS: Alibaba Cloud File Storage NAS (Extreme).</li>
     * <li>CPFS: Alibaba Cloud Cloud Paralleled File System (CPFS) (General-purpose).</li>
     * <li>BMCPFS: Alibaba Cloud Cloud Paralleled File System (CPFS) (AI-optimized). </li>
     * <li>MAXCOMPUTE: Alibaba Cloud MaxCompute.</li>
     * <li>URL: A public HTTP or HTTPS URL.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The data type of the dataset. Default value: COMMON. Valid values:</p>
     * <ul>
     * <li>COMMON: Common data.</li>
     * <li>PIC: Image data.</li>
     * <li>TEXT: Text data.</li>
     * <li>VIDEO: Video data.</li>
     * <li>AUDIO: Audio data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>DatasetTaskRamRole</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890123456:role/role-name</p>
     */
    @NameInMap("DatasetTaskRamRole")
    public String datasetTaskRamRole;

    /**
     * <p>The custom description of the dataset, which is used to distinguish it from other datasets.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run without actually creating the dataset.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The dataset edition. Default value: BASIC. Valid values:</p>
     * <ul>
     * <li>BASIC: Basic edition. Does not support file metadata management for the dataset.</li>
     * <li>ADVANCED: Advanced edition. Only OSS datasets are supported. Each version supports metadata management for up to 1 million files.</li>
     * <li>LOGICAL: Logical edition. Only OSS datasets are supported. Each version supports metadata management for up to 3 million files.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADVANCED</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
     * <details>
     * <summary>OSS</summary>
     * {<BR>
     * "region": "${region}",// The region ID.<BR>
     * "bucket": "${bucket}",// The bucket name.<BR>
     * "path": "${path}" // The file path.<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>NAS</summary>
     * {<BR>
     * "region": "${region}",// The region ID.<BR>
     * "fileSystemId": "${file_system_id}", // The file system ID.<BR>
     * "path": "${path}", // The file system path.<BR>
     * "mountTarget": "${mount_target}" // The mount target of the file system.<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>CPFS</summary>
     * {<BR>
     * "region": "${region}",// The region ID.<BR>
     * "fileSystemId": "${file_system_id}", // The file system ID.<BR>
     * "protocolServiceId":"${protocol_service_id}", // The protocol service of the file system.<BR>
     * "exportId": "${export_id}", // The export directory of the file system.<BR>
     * "path": "${path}", // The file system path.<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>AI-optimized CPFS</summary>
     * {<BR>
     * "region": "${region}",// The region ID.<BR>
     * "fileSystemId": "${file_system_id}", // The file system ID.<BR>
     * "path": "${path}", // The file system path.<BR>
     * "mountTarget": "${mount_target}", // The mount target of the file system. Specific to the AI-optimized edition.<BR>
     * "isVpcMount": boolean, // Specifies whether the mount target is a VPC mount target. Specific to the AI-optimized edition.<BR>
     * }<BR>
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
     * <p>The list of labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The list of workspace role names that have read and write permissions when the dataset is mounted. Role IDs starting with PAI are basic role IDs, and those starting with role- are custom role IDs. If the list contains an asterisk (*), all roles have read and write permissions.</p>
     * <ul>
     * <li>Specified roles: [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;]</li>
     * <li>All roles: [&quot;*&quot;]</li>
     * <li>Dataset creator only: []</li>
     * </ul>
     */
    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <p>The name of the dataset. The naming rules are as follows:</p>
     * <ul>
     * <li>The name must start with a lowercase letter, an uppercase letter, a digit, or a Chinese character.</li>
     * <li>The name can contain underscores (_) and hyphens (-).</li>
     * <li>The name must be 1 to 127 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended fields in JSON string format. When DLC uses the dataset, you can configure the mountPath field to specify the default mount path of the dataset.</p>
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
     * <li>FILE: File.</li>
     * <li>DIRECTORY: Directory.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The provider of the dataset. You cannot set this parameter to pai.</p>
     * 
     * <strong>example:</strong>
     * <p>Github</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The data source type of the dataset. Valid values:</p>
     * <ul>
     * <li>Ecs: Elastic Compute Service (ECS). This is the default value.</li>
     * <li>Lingjun: Lingjun.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>The ID of the source dataset from which the labeled dataset is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bvfasdfxxxxj8o411</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The version of the source dataset from which the labeled dataset is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("SourceDatasetVersion")
    public String sourceDatasetVersion;

    /**
     * <p>The ID of the data source.</p>
     * <ul>
     * <li>When SourceType is set to USER, SourceId can be customized.</li>
     * <li>When SourceType is set to ITAG, which indicates that the dataset is generated from the labeling results of the iTAG module, SourceId is the iTAG task ID.</li>
     * <li>When SourceType is set to PAI_PUBLIC_DATASET, which indicates that the dataset is created from a PAI public dataset, SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The data source type. Default value: USER.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI configuration examples are as follows:</p>
     * <ul>
     * <li>If the data source type is OSS: <code>oss://bucket.endpoint/object</code></li>
     * <li>If the data source type is NAS:
     * For general-purpose NAS, the format is <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>.
     * For CPFS 1.0, the format is <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>.
     * For CPFS 2.0, the format is <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
     * CPFS 1.0 and CPFS 2.0 are distinguished by the format of the fsid: the format for CPFS 1.0 is cpfs-&lt;8 ASCII characters&gt;, and the format for CPFS 2.0 is cpfs-&lt;16 ASCII characters&gt;.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nas://09f****f2.cn-hangzhou/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The Alibaba Cloud account ID of the dataset owner. The workspace owner and administrators have the permissions to create datasets for specified workspace members.</p>
     * 
     * <strong>example:</strong>
     * <p>2485765****023475</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>UserMetricsEndpoints</p>
     */
    @NameInMap("UserMetricsEndpoints")
    public java.util.List<UserMetricsEndpoint> userMetricsEndpoints;

    /**
     * <p>The description of the initial version of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the first dataset version.</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The list of labels for the initial version.</p>
     */
    @NameInMap("VersionLabels")
    public java.util.List<Label> versionLabels;

    /**
     * <p>The ID of the workspace to which the dataset belongs. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.
     * If you do not configure this parameter, the default workspace is used. If the default workspace does not exist, an error is reported.</p>
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

    public CreateDatasetRequest setDatasetTaskRamRole(String datasetTaskRamRole) {
        this.datasetTaskRamRole = datasetTaskRamRole;
        return this;
    }
    public String getDatasetTaskRamRole() {
        return this.datasetTaskRamRole;
    }

    public CreateDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public CreateDatasetRequest setUserMetricsEndpoints(java.util.List<UserMetricsEndpoint> userMetricsEndpoints) {
        this.userMetricsEndpoints = userMetricsEndpoints;
        return this;
    }
    public java.util.List<UserMetricsEndpoint> getUserMetricsEndpoints() {
        return this.userMetricsEndpoints;
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
