// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Toolset extends TeaModel {
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

    @NameInMap("status")
    public ToolsetStatus status;

    /**
     * <strong>example:</strong>
     * <p>1455541096***548</p>
     */
    @NameInMap("uid")
    public String uid;

    public static Toolset build(java.util.Map<String, ?> map) throws Exception {
        Toolset self = new Toolset();
        return TeaModel.build(map, self);
    }

    public Toolset setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Toolset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Toolset setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Toolset setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public Toolset setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Toolset setStatus(ToolsetStatus status) {
        this.status = status;
        return this;
    }
    public ToolsetStatus getStatus() {
        return this.status;
    }

    public Toolset setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
