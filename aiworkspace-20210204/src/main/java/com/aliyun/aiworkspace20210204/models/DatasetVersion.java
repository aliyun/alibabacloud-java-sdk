// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetVersion extends TeaModel {
    /**
     * <p>The total number of data items in the version.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The total size of the data in the version, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>The data source type. For example, the value <code>OSS</code> indicates Object Storage Service.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>A custom description for the dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>base model v1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The creation time of the dataset version, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time the dataset version was last modified, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Information about the import source, in JSON format.</p>
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
     * <p>A list of labels applied to the dataset version.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The access permission for the mounted dataset. For example, <code>RO</code> means read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>RO</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>Additional configurations for the dataset version, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
     * }</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The data format of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("Property")
    public String property;

    /**
     * <p>The ID of the source from which the version was created.</p>
     * 
     * <strong>example:</strong>
     * <p>d-65mrsr5fub4u74lej3</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The method used to create the dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS://xxx</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The name of the dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static DatasetVersion build(java.util.Map<String, ?> map) throws Exception {
        DatasetVersion self = new DatasetVersion();
        return TeaModel.build(map, self);
    }

    public DatasetVersion setDataCount(Long dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Long getDataCount() {
        return this.dataCount;
    }

    public DatasetVersion setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DatasetVersion setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DatasetVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DatasetVersion setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DatasetVersion setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public DatasetVersion setImportInfo(String importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public String getImportInfo() {
        return this.importInfo;
    }

    public DatasetVersion setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public DatasetVersion setMountAccess(String mountAccess) {
        this.mountAccess = mountAccess;
        return this;
    }
    public String getMountAccess() {
        return this.mountAccess;
    }

    public DatasetVersion setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public DatasetVersion setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public DatasetVersion setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public DatasetVersion setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DatasetVersion setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public DatasetVersion setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
