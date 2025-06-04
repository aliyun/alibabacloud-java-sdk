// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>The workspace accessibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE: The workspace is accessible only to you and the administrator of the workspace. This is the default value.</li>
     * <li>PUBLIC: The workspace is accessible to all users.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The number of dataset files.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The size of the dataset file. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li>OSS: Object Storage Service (OSS).</li>
     * <li>NAS: File Storage NAS (NAS).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the dataset. Default value: COMMON. Valid values:</p>
     * <ul>
     * <li>COMMON: common</li>
     * <li>PIC: picture</li>
     * <li>TEXT: text</li>
     * <li>Video: video</li>
     * <li>AUDIO: audio</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The description of the dataset. Descriptions are used to differentiate datasets.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The dataset configurations to be imported to a storage, such as OSS, NAS, or Cloud Parallel File Storage (CPFS).</p>
     * <p><strong>OSS</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;bucket&quot;: &quot;${bucket}&quot;,//The bucket name.\
     * &quot;path&quot;: &quot;${path}&quot; // The file path.\
     * }\</p>
     * <p><strong>NAS</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.\
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system.\
     * }\</p>
     * <p><strong>CPFS</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.\
     * &quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The file system protocol service.\
     * &quot;exportId&quot;: &quot;${export_id}&quot;, // The file system export directory.\
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.\
     * }\</p>
     * <p><strong>CPFS for Lingjun</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.\
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system, CPFS for Lingjun only.\
     * &quot;isVpcMount&quot;: boolean, // Whether the mount point is a virtual private cloud (VPC) mount point, CPFS for Lingjun only.\
     * }\</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The list of role names in the workspace that have read and write permissions on the mounted database. The names start with PAI are basic role names and the names start with role- are custom role names. If the list contains asterisks (\*), all roles have read and write permissions.</p>
     * <ul>
     * <li>If you set the value to [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;], the account of the specified role is granted the read and write permissions.</li>
     * <li>If you set the value to [&quot;\*&quot;], all accounts are granted the read and write permissions.</li>
     * <li>If you set the value to [], only the creator of the dataset has the read and write permissions.</li>
     * </ul>
     */
    @NameInMap("MountAccessReadWriteRoleIdList")
    public java.util.List<String> mountAccessReadWriteRoleIdList;

    /**
     * <p>The dataset name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must start with a letter, digit, or Chinese character.</li>
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
     * <p>The extended field, which is a JSON string. When you use the dataset in Deep Learning Containers (DLC), you can configure the mountPath field to specify the default mount path of the dataset.</p>
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
     * <li>FILE</li>
     * <li>DIRECTORY</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The dataset provider. The value cannot be set to pai.</p>
     * 
     * <strong>example:</strong>
     * <p>Github</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The source type of the dataset. Valid values:</p>
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
     * <p>The data source ID.</p>
     * <ul>
     * <li>If SourceType is set to USER, the value of SourceId is a custom string.</li>
     * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
     * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of the data source. Default value: USER.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PAI_PUBLIC_DATASET: a public dataset of PAI.</li>
     * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
     * <li>USER: a dataset registered by a user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI of the data source.</p>
     * <ul>
     * <li>Value format if DataSourceType is set to OSS: <code>oss://bucket.endpoint/object</code>.</li>
     * <li>Value formats if DataSourceType is set to NAS: General-purpose NAS: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>. CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>. CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>. You can distinguish CPFS 1.0 and CPFS 2.0 file systems based on the format of the file system ID: The ID for CPFS 1.0 is in the cpfs-&lt;8-bit ASCII characters&gt; format. The ID for CPFS 2.0 is in the cpfs-&lt;16-bit ASCII characters&gt; format.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nas://09f****f2.cn-hangzhou/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The ID of the Alibaba Cloud account to which the dataset belongs. The workspace owner and administrator have permissions to create datasets for specified members in the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>2485765****023475</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The description of the dataset of the initial version.</p>
     * 
     * <strong>example:</strong>
     * <p>The initial version</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The list of tags to be added to the dataset of the initial version.</p>
     */
    @NameInMap("VersionLabels")
    public java.util.List<Label> versionLabels;

    /**
     * <p>The ID of the workspace to which the dataset belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID. If you do not specify this parameter, the default workspace is used. If the default workspace does not exist, an error is reported.</p>
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
