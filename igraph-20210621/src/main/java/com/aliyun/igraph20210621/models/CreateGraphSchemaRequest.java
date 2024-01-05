// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class CreateGraphSchemaRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("namespace")
    public String namespace;

    public static CreateGraphSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGraphSchemaRequest self = new CreateGraphSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateGraphSchemaRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateGraphSchemaRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
