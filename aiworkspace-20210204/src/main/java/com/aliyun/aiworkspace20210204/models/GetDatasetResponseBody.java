// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Options")
    public String options;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Property")
    public String property;

    @NameInMap("ProviderType")
    public String providerType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Uri")
    public String uri;

    @NameInMap("UserId")
    public String userId;

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

    public GetDatasetResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
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

}
