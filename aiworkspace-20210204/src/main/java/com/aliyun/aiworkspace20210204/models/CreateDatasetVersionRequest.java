// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionRequest extends TeaModel {
    /**
     * <p>The number of dataset files.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The size of space occupied by dataset files. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>19000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The data source type. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><p>NAS: Alibaba Cloud Network Attached Storage (NAS).</p>
     * </li>
     * <li><p>OSS: Alibaba Cloud Object Storage Service (OSS).</p>
     * </li>
     * <li><p>CPFS</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The DataSourceType of the version must be consistent with the DataSourceType of the dataset. Validation is performed against the dataset when a version is created.</p>
     * </blockquote>
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
     * <p>The custom description of the dataset version, used to distinguish different dataset versions.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset version.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
     * <details>
     * <summary>OSS</summary>
     * {<BR>
     *   "region": "${region}",//Region ID<BR>
     *   "bucket": "${bucket}",//Bucket name<BR>
     *   "path": "${path}" //File path<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>NAS</summary>
     * {<BR>
     *   "region": "${region}",//Region ID<BR>
     *   "fileSystemId": "${file_system_id}", //File system ID<BR>
     *   "path": "${path}", //File system path<BR>
     *   "mountTarget": "${mount_target}" //File system mount target<BR>
     * }<BR>
     * </details>
     * 
     * 
     * <details>
     * <summary>CPFS</summary>
     * {<BR>
     *   "region": "${region}",//Region ID<BR>
     *   "fileSystemId": "${file_system_id}", //File system ID<BR>
     *   "protocolServiceId":"${protocol_service_id}", //File system protocol service<BR>
     *   "exportId": "${export_id}", //File system export directory<BR>
     *   "path": "${path}",  //File system path<BR>
     * }<BR>
     * </details>
     * 
     * <details>
     * <summary>Lingjun CPFS</summary>
     * {<BR>
     *   "region": "${region}",//Region ID<BR>
     *   "fileSystemId": "${file_system_id}", //File system ID<BR>
     *   "path": "${path}",  //File system path<BR>
     *   "mountTarget": "${mount_target}" //File system mount target, specific to Lingjun edition<BR>
     *   "isVpcMount": boolean, //Whether it is a VPC mount target, specific to Lingjun edition<BR>
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
     * <p>The list of dataset version labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The extended field in JsonString format.
     * When DLC uses a dataset, you can specify the default mount path of the dataset by configuring the mountPath field.</p>
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
     * <p>The data source ID.</p>
     * <ul>
     * <li>If SourceType is USER, SourceId can be customized.</li>
     * <li>If SourceType is ITAG, which indicates a dataset generated from iTAG annotation results, SourceId is the iTAG task ID.</li>
     * <li>If SourceType is PAI_PUBLIC_DATASET, which indicates a dataset created from a PAI public dataset, SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-a0xbe5n03bhqof46ce</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The data source type. Default value: USER. Valid values:</p>
     * <ul>
     * <li>PAI-PUBLIC-DATASET: PAI public dataset.</li>
     * <li>ITAG: dataset generated from iTAG annotation results.</li>
     * <li>USER: user-registered dataset.</li>
     * </ul>
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
     * General-purpose NAS format: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>;
     * CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>;
     * CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
     * CPFS 1.0 and CPFS 2.0 are distinguished by the format of the fsid: CPFS 1.0 format is cpfs-&lt;8 ASCII characters&gt;; CPFS 2.0 format is cpfs-&lt;16 ASCII characters&gt;.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
     */
    @NameInMap("Uri")
    public String uri;

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
