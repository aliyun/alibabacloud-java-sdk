// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateCredentialOutput extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static UpdateCredentialOutput build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialOutput self = new UpdateCredentialOutput();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialOutput setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCredentialOutput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCredentialOutput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateCredentialOutput setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
