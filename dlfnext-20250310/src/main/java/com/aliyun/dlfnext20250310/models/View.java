// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class View extends TeaModel {
    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("owner")
    public String owner;

    @NameInMap("schema")
    public ViewSchema schema;

    @NameInMap("updatedAt")
    public Long updatedAt;

    @NameInMap("updatedBy")
    public String updatedBy;

    public static View build(java.util.Map<String, ?> map) throws Exception {
        View self = new View();
        return TeaModel.build(map, self);
    }

    public View setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public View setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public View setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public View setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public View setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public View setSchema(ViewSchema schema) {
        this.schema = schema;
        return this;
    }
    public ViewSchema getSchema() {
        return this.schema;
    }

    public View setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public View setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
