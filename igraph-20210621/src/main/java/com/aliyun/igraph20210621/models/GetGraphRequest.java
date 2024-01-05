// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetGraphRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static GetGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGraphRequest self = new GetGraphRequest();
        return TeaModel.build(map, self);
    }

    public GetGraphRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
