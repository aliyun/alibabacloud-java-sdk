// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>The visibility of the workspace. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): visible only to yourself and administrators within the workspace.</li>
     * <li>PUBLIC: visible to all users in the workspace.</li>
     * <li>ROLE_PUBLIC: visible to specified workspace roles. For the role list, refer to AccessibleRoleIdList. Under this condition, the dataset owner and administrators always have visibility.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Takes effect when Accessibility is set to ROLE_PUBLIC. The list of workspace role names that can view the dataset. IDs starting with PAI are basic role IDs, and IDs starting with role- are custom role IDs.</p>
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
     * <p>The size of space occupied by the dataset files. Unit: bytes.</p>
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
     * <li>NAS: Alibaba Cloud Apsara File Storage NAS General Purpose.</li>
     * <li>EXTREMENAS: Alibaba Cloud Apsara File Storage NAS Extreme.</li>
     * <li>CPFS: Alibaba Cloud Cloud Parallel File Storage (CPFS) General Purpose.</li>
     * <li>BMCPFS: Alibaba Cloud Cloud Parallel File Storage (CPFS) AI Edition. </li>
     * <li>MAXCOMPUTE: Alibaba Cloud MaxCompute.</li>
     * <li>URL: public HTTP/HTTPS URL.</li>
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
     * <li>COMMON: common.</li>
     * <li>PIC: image.</li>
     * <li>TEXT: text.</li>
     * <li>VIDEO: video.</li>
     * <li>AUDIO: audio.</li>
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
     * <p>The custom description of the dataset to distinguish it from other datasets.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The dataset type. Default value: BASIC. Valid values:</p>
     * <ul>
     * <li>BASIC: basic. Does not support dataset file metadata management.</li>
     * <li>ADVANCED: advanced. Only supported for OSS type. Each version supports up to 1 million file metadata entries.</li>
     * <li>LOGICAL: logical. Only supported for OSS type. Each version supports up to 3 million file metadata entries.</li>
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
     * "region": "${region}",//Region ID<BR>
     * "bucket": "${bucket}",//Bucket name<BR>
     * "path": "${path}" //File path<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>NAS</summary>
     * {<BR>
     * "region": "${region}",//Region ID<BR>
     * "fileSystemId": "${file_system_id}", //File system ID<BR>
     * "path": "${path}", //File system path<BR>
     * "mountTarget": "${mount_target}" //File system mount target<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>CPFS</summary>
     * {<BR>
     * "region": "${region}",//Region ID<BR>
     * "fileSystemId": "${file_system_id}", //File system ID<BR>
     * "protocolServiceId":"${protocol_service_id}", //File system protocol service<BR>
     * "exportId": "${export_id}", //File system export directory<BR>
     * "path": "${path}", //File system path<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>AI Edition CPFS</summary>
     * {<BR>
     * "region": "${region}",//Region ID<BR>
     * "fileSystemId": "${file_system_id}", //File system ID<BR>
     * "path": "${path}", //File system path<BR>
     * "mountTarget": "${mount_target}" //File system mount target, specific to AI Edition<BR>
     * "isVpcMount": boolean, //Whether it is a VPC mount target, specific to AI Edition<BR>
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
     * <p>The list of workspace role names that have read and write permissions when the dataset is mounted. IDs starting with PAI are basic role IDs, and IDs starting with role- are custom role IDs. If the list contains &quot;*&quot;, all roles have read and write permissions.</p>
     * <ul>
     * <li>Specified roles: [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;]</li>
     * <li>All accounts: [&quot;*&quot;]</li>
     * <li>Dataset creator only: []</li>
     * </ul>
     */
    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <p>The name of the dataset. Naming rules:</p>
     * <ul>
     * <li>Must start with a lowercase letter, uppercase letter, digit, or Chinese character.</li>
     * <li>Can contain underscores (_) or hyphens (-).</li>
     * <li>Must be 1 to 127 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended field in JsonString format.
     * When DLC uses the dataset, you can specify the default mount path of the dataset by configuring the mountPath field.</p>
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
     * <li>FILE: file.</li>
     * <li>DIRECTORY: folder.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The dataset provider. Cannot be set to pai.</p>
     * 
     * <strong>example:</strong>
     * <p>Github</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The data source provider type of the dataset. Valid values:</p>
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

    /**
     * <p>The source dataset ID of the annotation dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bvfasdfxxxxj8o411</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The source dataset version of the annotation dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("SourceDatasetVersion")
    public String sourceDatasetVersion;

    /**
     * <p>The data source ID.</p>
     * <ul>
     * <li>If SourceType is USER, SourceId can be customized.</li>
     * <li>If SourceType is ITAG, which indicates a dataset generated from iTAG annotation results, SourceId is the iTAG task ID.</li>
     * <li>If SourceType is PAI_PUBLIC_DATASET, which indicates a dataset created from a PAI public dataset, SourceId is empty by default.</li>
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
     * <p>Examples of Uri configurations:</p>
     * <ul>
     * <li>If the data source type is OSS: <code>oss://bucket.endpoint/object</code></li>
     * <li>If the data source type is NAS:
     * General Purpose NAS format: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>;
     * CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>;
     * CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
     * CPFS 1.0 and CPFS 2.0 are distinguished by the fsid format: CPFS 1.0 format is cpfs-&lt;8 ASCII characters&gt;; CPFS 2.0 format is cpfs-&lt;16 ASCII characters&gt;.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nas://09f****f2.cn-hangzhou/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The Alibaba Cloud account ID of the dataset owner. Workspace owners and administrators have permissions to create datasets for specified workspace members.</p>
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
     * <p>The ID of the workspace where the dataset resides. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.
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
