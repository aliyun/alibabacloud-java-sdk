// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Environment extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    @NameInMap("generation")
    public Integer generation;

    @NameInMap("kind")
    public String kind;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("resourceVersion")
    public Integer resourceVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spec")
    public EnvironmentSpec spec;

    @NameInMap("status")
    public EnvironmentStatus status;

    @NameInMap("uid")
    public String uid;

    public static Environment build(java.util.Map<String, ?> map) throws Exception {
        Environment self = new Environment();
        return TeaModel.build(map, self);
    }

    public Environment setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Environment setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Environment setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public Environment setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Environment setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public Environment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Environment setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Environment setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public Environment setSpec(EnvironmentSpec spec) {
        this.spec = spec;
        return this;
    }
    public EnvironmentSpec getSpec() {
        return this.spec;
    }

    public Environment setStatus(EnvironmentStatus status) {
        this.status = status;
        return this;
    }
    public EnvironmentStatus getStatus() {
        return this.status;
    }

    public Environment setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
