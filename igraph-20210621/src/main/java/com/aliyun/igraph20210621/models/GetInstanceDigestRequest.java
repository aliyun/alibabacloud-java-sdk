// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetInstanceDigestRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static GetInstanceDigestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDigestRequest self = new GetInstanceDigestRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceDigestRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
