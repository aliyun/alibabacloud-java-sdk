// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetVersion extends TeaModel {
    @NameInMap("DataCount")
    public Long dataCount;

    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("Options")
    public String options;

    /**
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("Property")
    public String property;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>OSS://xxx</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
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

    public DatasetVersion setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
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
