// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetModelResponseBody extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("LatestVersion")
    public ModelVersion latestVersion;

    @NameInMap("ModelDescription")
    public String modelDescription;

    @NameInMap("ModelDoc")
    public String modelDoc;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Origin")
    public String origin;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Task")
    public String task;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelResponseBody self = new GetModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetModelResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetModelResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetModelResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetModelResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetModelResponseBody setLatestVersion(ModelVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public ModelVersion getLatestVersion() {
        return this.latestVersion;
    }

    public GetModelResponseBody setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public GetModelResponseBody setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public GetModelResponseBody setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public GetModelResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public GetModelResponseBody setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetModelResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetModelResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelResponseBody setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public GetModelResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetModelResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
