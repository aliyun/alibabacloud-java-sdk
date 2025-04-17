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
     * <p>The size of the dataset file. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>19000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The type of the data source. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li>NAS: File Storage NAS (NAS).</li>
     * <li>OSS: Object Storage Service (OSS).</li>
     * <li>CPFS</li>
     * </ul>
     * <p>Note: The DataSourceType value of a dataset version must be the same as that of the dataset. When you create a dataset version, the system checks whether the values are the same.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The description of the dataset. Descriptions are used to differentiate datasets.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The dataset storage import configurations, such as OSS, NAS, and CPFS.</p>
     * <p><strong>OSS</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID\
     * &quot;bucket&quot;: &quot;${bucket}&quot;,//The bucket name\
     * &quot;path&quot;: &quot;${path}&quot; // The file path\
     * }\</p>
     * <p><strong>NAS</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID\
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system\
     * }\</p>
     * <p><strong>CPFS</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID\
     * &quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The file system protocol service\
     * &quot;exportId&quot;: &quot;${export_id}&quot;, // The file system export directory\
     * &quot;path&quot;: &quot;${path}&quot;, // The file system path\
     * }\</p>
     * <p><strong>CPFS for Lingjun</strong></p>
     * <p>{\
     * &quot;region&quot;: &quot;${region}&quot;,// The region ID\
     * &quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID\
     * &quot;path&quot;: &quot;${path}&quot;, // The ile system path\
     * &quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system, CPFS for Lingjun only\
     * &quot;isVpcMount&quot;: boolean, // Whether the mount point is a VPC mount point, CPFS for Lingjun only\
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
     * <p>The tags of the dataset version.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The extended field, which is of the JsonString type. When you use the dataset in Deep Learning Containers (DLC), you can use the mountPath field to specify the default mount path of the dataset.</p>
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
     * <p>The ID of the data source.</p>
     * <ul>
     * <li>If SourceType is set to USER, the value of SourceId can be a custom string.</li>
     * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
     * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-a0xbe5n03bhqof46ce</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of the data source. Default value: USER. Valid values:</p>
     * <ul>
     * <li>PAI-PUBLIC-DATASET: a public dataset of Platform for AI (PAI).</li>
     * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
     * <li>USER: a dataset registered by a user.</li>
     * </ul>
     * <p>For each job type:</p>
     * <ul>
     * <li>PAI_PUBLIC_DATASET: PAI_PUBLIC_DATASET.</li>
     * <li>ITAG: ITAG.</li>
     * <li>USER: USER.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Example format:</p>
     * <ul>
     * <li>Value format when DataSourceType is set to OSS: <code>oss://bucket.endpoint/object</code>.</li>
     * <li>Value formats when DataSourceType is set to NAS: General-purpose NAS: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>. CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>. CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>. You can distinguish CPFS 1.0 and CPFS 2.0 file systems based on the format of the file system ID: The ID for CPFS 1.0 is in the cpfs-&lt;8-bit ASCII characters&gt; format. The ID for CPFS 2.0 is in the cpfs-&lt;16-bit ASCII characters&gt; format.</li>
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
