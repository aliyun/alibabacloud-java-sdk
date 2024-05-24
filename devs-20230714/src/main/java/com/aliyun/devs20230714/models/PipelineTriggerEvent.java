// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineTriggerEvent extends TeaModel {
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
    public PipelineTriggerEventSpec spec;

    @NameInMap("status")
    public PipelineTriggerEventStatus status;

    @NameInMap("uid")
    public String uid;

    public static PipelineTriggerEvent build(java.util.Map<String, ?> map) throws Exception {
        PipelineTriggerEvent self = new PipelineTriggerEvent();
        return TeaModel.build(map, self);
    }

    public PipelineTriggerEvent setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PipelineTriggerEvent setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }
    public String getDeletionTime() {
        return this.deletionTime;
    }

    public PipelineTriggerEvent setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PipelineTriggerEvent setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public PipelineTriggerEvent setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public PipelineTriggerEvent setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public PipelineTriggerEvent setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PipelineTriggerEvent setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public PipelineTriggerEvent setSpec(PipelineTriggerEventSpec spec) {
        this.spec = spec;
        return this;
    }
    public PipelineTriggerEventSpec getSpec() {
        return this.spec;
    }

    public PipelineTriggerEvent setStatus(PipelineTriggerEventStatus status) {
        this.status = status;
        return this;
    }
    public PipelineTriggerEventStatus getStatus() {
        return this.status;
    }

    public PipelineTriggerEvent setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
