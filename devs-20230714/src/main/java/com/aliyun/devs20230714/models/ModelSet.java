// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelSet extends TeaModel {
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

    @NameInMap("generation")
    public Long generation;

    /**
     * <strong>example:</strong>
     * <p>ModelProvider</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <strong>example:</strong>
     * <p>key=value</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-modelset</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("status")
    public ModelSetStatus status;

    /**
     * <strong>example:</strong>
     * <p>1455541096***548</p>
     */
    @NameInMap("uid")
    public String uid;

    public static ModelSet build(java.util.Map<String, ?> map) throws Exception {
        ModelSet self = new ModelSet();
        return TeaModel.build(map, self);
    }

    public ModelSet setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ModelSet setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelSet setGeneration(Long generation) {
        this.generation = generation;
        return this;
    }
    public Long getGeneration() {
        return this.generation;
    }

    public ModelSet setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ModelSet setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public ModelSet setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelSet setStatus(ModelSetStatus status) {
        this.status = status;
        return this;
    }
    public ModelSetStatus getStatus() {
        return this.status;
    }

    public ModelSet setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
