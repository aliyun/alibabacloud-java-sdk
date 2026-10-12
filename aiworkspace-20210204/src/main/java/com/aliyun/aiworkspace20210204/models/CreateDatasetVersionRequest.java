// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionRequest extends TeaModel {
    /**
     * <p>The number of files in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The size of the space occupied by the dataset files. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>19000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The data source type. Separate multiple values with commas. Valid values:</p>
     * <ul>
     * <li><p>NAS: Alibaba Cloud File Storage NAS.</p>
     * </li>
     * <li><p>OSS: Alibaba Cloud Object Storage Service (OSS).</p>
     * </li>
     * <li><p>CPFS</p>
     * </li>
     * </ul>
     * <p>Note: The DataSourceType of the version must be the same as the DataSourceType of the dataset. The system validates this when you create the version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>UserMetricsEndpoints</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890123456:role/role-name</p>
     */
    @NameInMap("DatasetTaskRamRole")
    public String datasetTaskRamRole;

    /**
     * <p>The custom description of the dataset version. You can use this description to distinguish between different dataset versions.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset version.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run without actually creating the dataset version.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
     * <details>
     * <summary>OSS</summary>
     * {<BR>
     *   "region": "${region}",// The region ID.<BR>
     *   "bucket": "${bucket}",// The bucket name.<BR>
     *   "path": "${path}" // The file path.<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>NAS</summary>
     * {<BR>
     *   "region": "${region}",// The region ID.<BR>
     *   "fileSystemId": "${file_system_id}", // The file system ID.<BR>
     *   "path": "${path}", // The file system path.<BR>
     *   "mountTarget": "${mount_target}" // The mount target of the file system.<BR>
     * }<BR>
     * </details>
     * 
     * 
     * <details>
     * <summary>CPFS</summary>
     * {<BR>
     *   "region": "${region}",// The region ID.<BR>
     *   "fileSystemId": "${file_system_id}", // The file system ID.<BR>
     *   "protocolServiceId":"${protocol_service_id}", // The protocol service of the file system.<BR>
     *   "exportId": "${export_id}", // The export directory of the file system.<BR>
     *   "path": "${path}",  // The file system path.<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>CPFS for AI computing</summary>
     * {<BR>
     *   "region": "${region}",// The region ID.<BR>
     *   "fileSystemId": "${file_system_id}", // The file system ID.<BR>
     *   "path": "${path}",  // The file system path.<BR>
     *   "mountTarget": "${mount_target}" // The mount target of the file system. This parameter is specific to the AI computing edition.<BR>
     *   "isVpcMount": boolean, // Specifies whether the mount target is a VPC mount target. This parameter is specific to the AI computing edition.<BR>
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
     * <p>The list of labels for the dataset version.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The extended field. The value is a JSON string. When DLC uses the dataset, you can configure the mountPath field to specify the default mount path for the dataset.</p>
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
     * <li>FILE: file</li>
     * <li>DIRECTORY: directory</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li>If SourceType is set to USER, you can specify a custom SourceId.</li>
     * <li>If SourceType is set to ITAG, the dataset is generated from the labeling results of the iTAG module, and SourceId is the task ID in iTAG.</li>
     * <li>If SourceType is set to PAI_PUBLIC_DATASET, the dataset is created from a PAI public dataset, and SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-a0xbe5n03bhqof46ce</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type. Default value: USER. Valid values:</p>
     * <ul>
     * <li>PAI-PUBLIC-DATASET: PAI public dataset.</li>
     * <li>ITAG: dataset generated from the labeling results of the iTAG module.</li>
     * <li>USER: user-registered dataset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI. Configuration examples:</p>
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
     * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The list of user metric collection endpoints.</p>
     */
    @NameInMap("UserMetricsEndpoints")
    public java.util.List<UserMetricsEndpoint> userMetricsEndpoints;

    public static CreateDatasetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionRequest self = new CreateDatasetVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionRequest setDataCount(Long dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Long getDataCount() {
        return this.dataCount;
    }

    public CreateDatasetVersionRequest setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public CreateDatasetVersionRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDatasetVersionRequest setDatasetTaskRamRole(String datasetTaskRamRole) {
        this.datasetTaskRamRole = datasetTaskRamRole;
        return this;
    }
    public String getDatasetTaskRamRole() {
        return this.datasetTaskRamRole;
    }

    public CreateDatasetVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasetVersionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDatasetVersionRequest setImportInfo(String importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public String getImportInfo() {
        return this.importInfo;
    }

    public CreateDatasetVersionRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateDatasetVersionRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateDatasetVersionRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public CreateDatasetVersionRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateDatasetVersionRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateDatasetVersionRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public CreateDatasetVersionRequest setUserMetricsEndpoints(java.util.List<UserMetricsEndpoint> userMetricsEndpoints) {
        this.userMetricsEndpoints = userMetricsEndpoints;
        return this;
    }
    public java.util.List<UserMetricsEndpoint> getUserMetricsEndpoints() {
        return this.userMetricsEndpoints;
    }

}
