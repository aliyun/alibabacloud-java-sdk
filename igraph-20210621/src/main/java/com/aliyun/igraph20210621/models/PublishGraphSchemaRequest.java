// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class PublishGraphSchemaRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static PublishGraphSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishGraphSchemaRequest self = new PublishGraphSchemaRequest();
        return TeaModel.build(map, self);
    }

    public PublishGraphSchemaRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
