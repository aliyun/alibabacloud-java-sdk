// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineTrigger extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("projectName")
    public String projectName;

    @NameInMap("resourceVersion")
    public Integer resourceVersion;

    @NameInMap("spec")
    public PipelineTriggerSpec spec;

    @NameInMap("uid")
    public String uid;

    public static PipelineTrigger build(java.util.Map<String, ?> map) throws Exception {
        PipelineTrigger self = new PipelineTrigger();
        return TeaModel.build(map, self);
    }

    public PipelineTrigger setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PipelineTrigger setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }
    public String getDeletionTime() {
        return this.deletionTime;
    }

    public PipelineTrigger setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PipelineTrigger setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public PipelineTrigger setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public PipelineTrigger setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public PipelineTrigger setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PipelineTrigger setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public PipelineTrigger setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public PipelineTrigger setSpec(PipelineTriggerSpec spec) {
        this.spec = spec;
        return this;
    }
    public PipelineTriggerSpec getSpec() {
        return this.spec;
    }

    public PipelineTrigger setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
