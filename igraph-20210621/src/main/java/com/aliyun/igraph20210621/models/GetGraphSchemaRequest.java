// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetGraphSchemaRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static GetGraphSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGraphSchemaRequest self = new GetGraphSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetGraphSchemaRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
