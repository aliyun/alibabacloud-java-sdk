// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-11-19T09:34:38Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>test-description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("generation")
    public Integer generation;

    /**
     * <strong>example:</strong>
     * <p>Artifact</p>
     */
    @NameInMap("kind")
    public String kind;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-artifact</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resourceVersion")
    public Integer resourceVersion;

    @NameInMap("spec")
    public ArtifactSpec spec;

    @NameInMap("status")
    public ArtifactStatus status;

    /**
     * <strong>example:</strong>
     * <p>1455541096***548</p>
     */
    @NameInMap("uid")
    public String uid;

    /**
     * <strong>example:</strong>
     * <p>2021-11-19T09:34:38Z</p>
     */
    @NameInMap("updatedTime")
    public String updatedTime;

    public static Artifact build(java.util.Map<String, ?> map) throws Exception {
        Artifact self = new Artifact();
        return TeaModel.build(map, self);
    }

    public Artifact setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Artifact setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Artifact setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public Artifact setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Artifact setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public Artifact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Artifact setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public Artifact setSpec(ArtifactSpec spec) {
        this.spec = spec;
        return this;
    }
    public ArtifactSpec getSpec() {
        return this.spec;
    }

    public Artifact setStatus(ArtifactStatus status) {
        this.status = status;
        return this;
    }
    public ArtifactStatus getStatus() {
        return this.status;
    }

    public Artifact setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public Artifact setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public String getUpdatedTime() {
        return this.updatedTime;
    }

}
