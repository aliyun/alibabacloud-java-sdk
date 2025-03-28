// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceDeployment extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-11-19T09:34:38Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>commit by xxx.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>my-environment-deployment</p>
     */
    @NameInMap("environmentDeploymentName")
    public String environmentDeploymentName;

    /**
     * <strong>example:</strong>
     * <p>Deployment</p>
     */
    @NameInMap("kind")
    public String kind;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-deployment</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("status")
    public ServiceDeploymentStatus status;

    /**
     * <strong>example:</strong>
     * <p>1455541096***548</p>
     */
    @NameInMap("uid")
    public String uid;

    public static ServiceDeployment build(java.util.Map<String, ?> map) throws Exception {
        ServiceDeployment self = new ServiceDeployment();
        return TeaModel.build(map, self);
    }

    public ServiceDeployment setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ServiceDeployment setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ServiceDeployment setEnvironmentDeploymentName(String environmentDeploymentName) {
        this.environmentDeploymentName = environmentDeploymentName;
        return this;
    }
    public String getEnvironmentDeploymentName() {
        return this.environmentDeploymentName;
    }

    public ServiceDeployment setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ServiceDeployment setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public ServiceDeployment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServiceDeployment setStatus(ServiceDeploymentStatus status) {
        this.status = status;
        return this;
    }
    public ServiceDeploymentStatus getStatus() {
        return this.status;
    }

    public ServiceDeployment setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
