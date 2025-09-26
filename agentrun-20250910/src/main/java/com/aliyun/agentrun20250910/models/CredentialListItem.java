// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CredentialListItem extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("relatedWorloads")
    public java.util.List<RelatedWorkload> relatedWorloads;

    @NameInMap("type")
    public String type;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static CredentialListItem build(java.util.Map<String, ?> map) throws Exception {
        CredentialListItem self = new CredentialListItem();
        return TeaModel.build(map, self);
    }

    public CredentialListItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CredentialListItem setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CredentialListItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CredentialListItem setRelatedWorloads(java.util.List<RelatedWorkload> relatedWorloads) {
        this.relatedWorloads = relatedWorloads;
        return this;
    }
    public java.util.List<RelatedWorkload> getRelatedWorloads() {
        return this.relatedWorloads;
    }

    public CredentialListItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CredentialListItem setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
