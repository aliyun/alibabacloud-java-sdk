// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelProvider extends TeaModel {
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
     * <p>Toolset</p>
     */
    @NameInMap("kind")
    public String kind;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-toolset</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1455541096***548</p>
     */
    @NameInMap("uid")
    public String uid;

    public static ModelProvider build(java.util.Map<String, ?> map) throws Exception {
        ModelProvider self = new ModelProvider();
        return TeaModel.build(map, self);
    }

    public ModelProvider setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ModelProvider setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelProvider setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ModelProvider setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public ModelProvider setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelProvider setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
