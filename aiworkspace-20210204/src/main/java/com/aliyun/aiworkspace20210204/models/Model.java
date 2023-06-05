// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Model extends TeaModel {
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

    @NameInMap("OrderNumber")
    public Long orderNumber;

    @NameInMap("Origin")
    public String origin;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("Task")
    public String task;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Model build(java.util.Map<String, ?> map) throws Exception {
        Model self = new Model();
        return TeaModel.build(map, self);
    }

    public Model setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Model setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public Model setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Model setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Model setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public Model setLatestVersion(ModelVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public ModelVersion getLatestVersion() {
        return this.latestVersion;
    }

    public Model setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public Model setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public Model setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Model setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public Model setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public Model setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public Model setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Model setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public Model setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public Model setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Model setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
