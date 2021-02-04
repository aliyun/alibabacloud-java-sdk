// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateMaterialRequest extends TeaModel {
    @NameInMap("Path")
    public String path;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaterialRequest self = new CreateMaterialRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaterialRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateMaterialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMaterialRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateMaterialRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CreateMaterialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
