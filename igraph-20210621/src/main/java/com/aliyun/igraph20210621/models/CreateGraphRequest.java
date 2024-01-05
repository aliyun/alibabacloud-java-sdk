// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class CreateGraphRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("namespace")
    public String namespace;

    public static CreateGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGraphRequest self = new CreateGraphRequest();
        return TeaModel.build(map, self);
    }

    public CreateGraphRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateGraphRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
