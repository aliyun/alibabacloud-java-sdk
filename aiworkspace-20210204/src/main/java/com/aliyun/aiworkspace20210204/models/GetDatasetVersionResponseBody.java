// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetVersionResponseBody extends TeaModel {
    /**
     * <p>数据集的数据量</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>数据集版本的数据大小。</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>数据源类型。支持以下取值：</p>
     * <ul>
     * <li>OSS：阿里云对象存储（OSS）。</li>
     * <li>NAS：阿里云文件存储（NAS）。</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>数据集版本的描述信息。</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>创建时间。</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("ImportInfo")
    public String importInfo;

    /**
     * <p>代表资源标签的资源属性字段</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>扩展字段，JsonString类型。
     * 当DLC使用数据集时，可通过配置mountPath字段指定数据集默认挂载路径。</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>数据集的属性。支持以下取值：</p>
     * <ul>
     * <li>FILE：文件。</li>
     * <li>DIRECTORY：文件夹。</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Property")
    public String property;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>数据来源ID。</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>数据来源类型，默认为USER。支持以下取值：</p>
     * <ul>
     * <li>PAI-PUBLIC-DATASET：PAI公共数据集。</li>
     * <li>ITAG：iTAG模块标注结果生成的数据集。</li>
     * <li>USER：用户注册的数据集。</li>
     * </ul>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Uri配置样例如下：</p>
     * <ul>
     * <li>数据源类型为OSS：<code>oss://bucket.endpoint/object</code></li>
     * <li>数据源类型为NAS：
     * 通用型NAS格式为：<code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>；
     * CPFS1.0：<code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>；
     * CPFS2.0：<code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>。
     * CPFS1.0和CPFS2.0根据fsid的格式来区分：CPFS1.0 格式为cpfs-&lt;8位ascii字符&gt;；CPFS2.0 格式为cpfs-&lt;16为ascii字符&gt;。</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>代表资源名称的资源属性字段</p>
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

    public GetDatasetVersionResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
