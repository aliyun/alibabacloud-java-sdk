// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
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
    public TaskSpec spec;

    @NameInMap("status")
    public TaskStatus status;

    @NameInMap("uid")
    public String uid;

    public static Task build(java.util.Map<String, ?> map) throws Exception {
        Task self = new Task();
        return TeaModel.build(map, self);
    }

    public Task setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Task setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }
    public String getDeletionTime() {
        return this.deletionTime;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Task setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public Task setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Task setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Task setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public Task setSpec(TaskSpec spec) {
        this.spec = spec;
        return this;
    }
    public TaskSpec getSpec() {
        return this.spec;
    }

    public Task setStatus(TaskStatus status) {
        this.status = status;
        return this;
    }
    public TaskStatus getStatus() {
        return this.status;
    }

    public Task setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
