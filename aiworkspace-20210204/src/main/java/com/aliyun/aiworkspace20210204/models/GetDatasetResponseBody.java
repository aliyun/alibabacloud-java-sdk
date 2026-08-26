// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    /**
     * <p>The workspace visibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE: Only the dataset owner and administrators in the workspace can access the dataset.</li>
     * <li>PUBLIC: All members in the workspace can access the dataset.</li>
     * <li>ROLE_PUBLIC: Only specified workspace roles can access the dataset. For the role list, see AccessibleRoleIdList. The dataset owner and administrators always have access under this condition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The list of workspace role names that can access the dataset. This field takes effect when Accessibility is ROLE_PUBLIC. IDs starting with PAI are basic role IDs, and IDs starting with role- are custom role IDs.</p>
     */
    @NameInMap("AccessibleRoleIdList")
    public java.util.List<String> accessibleRoleIdList;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li>OSS: Alibaba Cloud Object Storage Service (OSS).</li>
     * <li>NAS: Alibaba Cloud Apsara File Storage NAS (NAS).</li>
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
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rbvg5wz****c9ks92</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Data for labeling</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The dataset type. Valid values:</p>
     * <ul>
     * <li><p>BASIC: Basic. Does not support dataset file metadata management.</p>
     * </li>
     * <li><p>ADVANCED: Advanced. Only supported for OSS type. Each version supports metadata management for up to 1 million files.</p>
     * </li>
     * </ul>
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
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

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
     * <summary>Lingjun CPFS</summary>
     * {<BR>
     * "region": "${region}",//Region ID<BR>
     * "fileSystemId": "${file_system_id}", //File system ID<BR>
     * "path": "${path}", //File system path<BR>
     * "mountTarget": "${mount_target}" //File system mount target, specific to Lingjun edition<BR>
     * "isVpcMount": boolean, //Whether it is a VPC mount target, specific to Lingjun edition<BR>
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
     * <p>Indicates whether the dataset is a shared dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>The list of labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The latest version of the dataset.</p>
     */
    @NameInMap("LatestVersion")
    public DatasetVersion latestVersion;

    /**
     * <p>The permission when the dataset is mounted. Valid values:</p>
     * <ul>
     * <li>RO: read-only mount.</li>
     * <li>RW: read-write mount.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RW</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>The list of workspace role names that have read and write permission on the dataset. IDs starting with PAI are basic role IDs, and IDs starting with role- are custom role IDs. If the list contains &quot;*&quot;, all roles have read and write permission.</p>
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
     * <p>The extension field of the initial version v1, in JsonString format.
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
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1631044****3440</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The property of the initial dataset version v1. Valid values:</p>
     * <ul>
     * <li>FILE: file.</li>
     * <li>DIRECTORY: folder.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The dataset provider. If the value is &quot;pai&quot;, the dataset is a PAI platform public dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source relationship of the shared dataset. This field is valid only when IsShared is true.</p>
     */
    @NameInMap("SharedFrom")
    public DatasetShareRelationship sharedFrom;

    /**
     * <p>The sharing configuration of the current dataset.</p>
     */
    @NameInMap("SharingConfig")
    public GetDatasetResponseBodySharingConfig sharingConfig;

    /**
     * <p>The source dataset ID of the iTag labeling dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rcdg3wxxxxxhc5jk87</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The source dataset version of the labeling dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("SourceDatasetVersion")
    public String sourceDatasetVersion;

    /**
     * <p>The source ID of the initial version v1. Valid values:</p>
     * <ul>
     * <li>If SourceType is USER, SourceId can be customized.</li>
     * <li>If SourceType is ITAG, which indicates a dataset generated from iTAG labeling results, SourceId is the iTAG task ID.</li>
     * <li>If SourceType is PAI_PUBLIC_DATASET, which indicates a dataset created from a PAI public dataset, SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type of the initial version v1.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The labeling template of the iTag labeling dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>TextClassification</p>
     */
    @NameInMap("TagTemplateType")
    public String tagTemplateType;

    /**
     * <p>The URI of the initial version v1. Example formats:</p>
     * <ul>
     * <li>If the data source type is OSS: <code>oss://bucket.endpoint/object</code>.</li>
     * <li>If the data source type is NAS:
     * General-purpose NAS format: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>.
     * CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>.
     * CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
     * CPFS 1.0 and CPFS 2.0 are distinguished by the format of the fsid:
     * CPFS 1.0 format: cpfs-&lt;8 ASCII characters&gt;.
     * CPFS 2.0 format: cpfs-&lt;16 ASCII characters&gt;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nas://09f****f2.cn-hangzhou/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The ID of the user to whom the dataset belongs.</p>
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
         * <p>The list of sharing configuration relationships.</p>
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
