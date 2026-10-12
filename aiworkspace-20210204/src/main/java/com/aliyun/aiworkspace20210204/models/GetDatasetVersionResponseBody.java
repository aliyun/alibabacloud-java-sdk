// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetVersionResponseBody extends TeaModel {
    /**
     * <p>The data count.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The dataset size.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li>NAS: File Storage NAS.</li>
     * <li>CPFS: Cloud Parallel File Storage.</li>
     * <li>OSS: Object Storage Service (OSS).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The primary ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>d-dkdbnnap0g7b6su4yg</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>DatasetTaskRamRole</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890123456:role/role-name</p>
     */
    @NameInMap("DatasetTaskRamRole")
    public String datasetTaskRamRole;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset version.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The creation time. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ss.sssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-13T10:22:05.694Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modification time. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ss.sssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-13T10:22:05.694Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
     * <details>
     * <summary>OSS</summary>
     * {
     * "region": "${region}",// The region ID
     * "bucket": "${bucket}",// The bucket name
     * "path": "${path}" // The file path
     * }
     * </details>
     * 
     * <details>
     * <summary>NAS</summary>
     * 
     * </details>
     * 
     * <details>
     * <summary>CPFS</summary>
     * Block content
     * </details>
     * 
     * 
     * <details>
     * <summary>AI CPFS</summary>
     * Block content
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
     * <p>The resource tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The permissions when the dataset is mounted. Valid values:</p>
     * <ul>
     * <li>RO: Read-only mount.</li>
     * <li>RW: Read/write mount.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RO</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>The extended fields.</p>
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
     * <li>DIRECTORY: Directory.</li>
     * <li>FILE: File.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C55DF3DA-F120-5E37-A374-F49365531701</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source ID of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type. Valid values:</p>
     * <ul>
     * <li>ENHANCE: Data augmentation.</li>
     * <li>ADDVERSION: Added version.</li>
     * <li>CLEANING: Data cleaning.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI configuration example.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ai4d-br7hx9ngzelo2o6uip.oss-cn-shanghai.aliyuncs.com/365349/data-1157703270994901/datasets/aka108o/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The list of user metric collection endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Port&quot;:0,&quot;Path&quot;:&quot;&quot;}]</p>
     */
    @NameInMap("UserMetricsEndpoints")
    public java.util.List<UserMetricsEndpoint> userMetricsEndpoints;

    /**
     * <p>The dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static GetDatasetVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetVersionResponseBody self = new GetDatasetVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetVersionResponseBody setDataCount(Long dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Long getDataCount() {
        return this.dataCount;
    }

    public GetDatasetVersionResponseBody setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public GetDatasetVersionResponseBody setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetDatasetVersionResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetDatasetVersionResponseBody setDatasetTaskRamRole(String datasetTaskRamRole) {
        this.datasetTaskRamRole = datasetTaskRamRole;
        return this;
    }
    public String getDatasetTaskRamRole() {
        return this.datasetTaskRamRole;
    }

    public GetDatasetVersionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDatasetVersionResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetDatasetVersionResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetDatasetVersionResponseBody setImportInfo(String importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public String getImportInfo() {
        return this.importInfo;
    }

    public GetDatasetVersionResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetDatasetVersionResponseBody setMountAccess(String mountAccess) {
        this.mountAccess = mountAccess;
        return this;
    }
    public String getMountAccess() {
        return this.mountAccess;
    }

    public GetDatasetVersionResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public GetDatasetVersionResponseBody setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public GetDatasetVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetVersionResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetDatasetVersionResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetDatasetVersionResponseBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public GetDatasetVersionResponseBody setUserMetricsEndpoints(java.util.List<UserMetricsEndpoint> userMetricsEndpoints) {
        this.userMetricsEndpoints = userMetricsEndpoints;
        return this;
    }
    public java.util.List<UserMetricsEndpoint> getUserMetricsEndpoints() {
        return this.userMetricsEndpoints;
    }

    public GetDatasetVersionResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
