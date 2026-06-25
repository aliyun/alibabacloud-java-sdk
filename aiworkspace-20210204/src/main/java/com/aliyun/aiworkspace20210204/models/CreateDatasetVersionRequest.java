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
     * <p>The type of the data source. If you specify multiple types, separate them with commas (,). Valid values:</p>
     * <ul>
     * <li><p>NAS: The data is stored in Alibaba Cloud File Storage (NAS).</p>
     * </li>
     * <li><p>OSS: The data is stored in Alibaba Cloud Object Storage Service (OSS).</p>
     * </li>
     * <li><p>CPFS</p>
     * </li>
     * </ul>
     * <p>Note: The DataSourceType of the version must be the same as the DataSourceType of the dataset. The system verifies this consistency when you create the version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>A custom description for the dataset version. This helps distinguish different dataset versions.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of the dataset version.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The storage import configuration of the dataset. Supported storage types include OSS, NAS, and CPFS.</p>
     * <details>
     * 
     * <summary>
     * 
     * <p>OSS</p>
     * </summary>
     * 
     * <p>{<br>
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>
     * &quot;bucket&quot;: &quot;${bucket}&quot;,// The bucket name.<br>
     * &quot;path&quot;: &quot;${path}&quot; // The file path.<br>
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
     * <p>{<br>
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.<br>
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.<br>
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount target of the file system.<br>
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
     * <p>{<br>
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.<br>
     * &quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The protocol service of the file system.<br>
     * &quot;exportId&quot;: &quot;${export_id}&quot;, // The exported directory of the file system.<br>
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.<br>
     * }</p>
     * </details>
     * 
     * <details>
     * 
     * <summary>
     * 
     * <p>Intelligent Computing CPFS</p>
     * </summary>
     * 
     * <p>{<br>
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.<br>
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path.<br>
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot;, // The mount target of the file system. This parameter is specific to the Intelligent Computing edition.<br>
     * &quot;isVpcMount&quot;: boolean, // Specifies whether the mount target is in a VPC. This parameter is specific to the Intelligent Computing edition.<br>
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
     * <p>A list of tags for the dataset version.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The extended field, which is a JSON string.
     * When DLC uses the dataset, you can configure the mountPath field to specify the default mount path for the dataset.</p>
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
     * <li><p>DIRECTORY: A folder.</p>
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
     * <p>The ID of the data source.</p>
     * <ul>
     * <li><p>If SourceType is set to USER, you can customize the SourceId.</p>
     * </li>
     * <li><p>If SourceType is set to ITAG, which indicates a dataset generated from the annotation results of the iTAG module, SourceId is the task ID from iTAG.</p>
     * </li>
     * <li><p>If SourceType is set to PAI_PUBLIC_DATASET, which indicates a dataset created from a public PAI dataset, SourceId is empty by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-a0xbe5n03bhqof46ce</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of the data source. The default value is USER. Valid values:</p>
     * <ul>
     * <li><p>PAI-PUBLIC-DATASET: a public dataset from PAI.</p>
     * </li>
     * <li><p>ITAG: a dataset generated from the annotation results of the iTAG module.</p>
     * </li>
     * <li><p>USER: a dataset registered by a user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The following examples show how to configure the URI:</p>
     * <ul>
     * <li><p>If the data source type is OSS: <code>oss://bucket.endpoint/object</code></p>
     * </li>
     * <li><p>If the data source type is NAS:
     * The format for a general-purpose NAS file system is <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>.
     * CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>.
     * CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
     * CPFS 1.0 and CPFS 2.0 are distinguished by the format of the fsid. The format for CPFS 1.0 is cpfs-&lt;8 ASCII characters&gt;. The format for CPFS 2.0 is cpfs-&lt;16 ASCII characters&gt;.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
     */
    @NameInMap("Uri")
    public String uri;

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

}
