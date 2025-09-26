// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCredentialOutput extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static CreateCredentialOutput build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialOutput self = new CreateCredentialOutput();
        return TeaModel.build(map, self);
    }

    public CreateCredentialOutput setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateCredentialOutput setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCredentialOutput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCredentialOutput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
