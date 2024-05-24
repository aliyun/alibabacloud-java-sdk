// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Pipeline extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("deletionTime")
    public String deletionTime;

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

    @NameInMap("resourceVersion")
    public Integer resourceVersion;

    @NameInMap("spec")
    public PipelineSpec spec;

    @NameInMap("status")
    public PipelineStatus status;

    @NameInMap("uid")
    public String uid;

    public static Pipeline build(java.util.Map<String, ?> map) throws Exception {
        Pipeline self = new Pipeline();
        return TeaModel.build(map, self);
    }

    public Pipeline setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Pipeline setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }
    public String getDeletionTime() {
        return this.deletionTime;
    }

    public Pipeline setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Pipeline setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public Pipeline setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Pipeline setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public Pipeline setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Pipeline setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public Pipeline setSpec(PipelineSpec spec) {
        this.spec = spec;
        return this;
    }
    public PipelineSpec getSpec() {
        return this.spec;
    }

    public Pipeline setStatus(PipelineStatus status) {
        this.status = status;
        return this;
    }
    public PipelineStatus getStatus() {
        return this.status;
    }

    public Pipeline setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
