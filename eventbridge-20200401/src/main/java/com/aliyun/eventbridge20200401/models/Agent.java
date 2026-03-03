// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Agent extends TeaModel {
    @NameInMap("CreatedAt")
    public Long createdAt;

    @NameInMap("Description")
    public String description;

    @NameInMap("Metadata")
    public Metadata metadata;

    @NameInMap("Name")
    public String name;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static Agent build(java.util.Map<String, ?> map) throws Exception {
        Agent self = new Agent();
        return TeaModel.build(map, self);
    }

    public Agent setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Agent setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Agent setMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public Metadata getMetadata() {
        return this.metadata;
    }

    public Agent setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Agent setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public Agent setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
