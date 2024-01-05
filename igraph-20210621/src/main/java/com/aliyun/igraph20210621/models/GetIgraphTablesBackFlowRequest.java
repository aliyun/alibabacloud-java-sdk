// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetIgraphTablesBackFlowRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    public static GetIgraphTablesBackFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIgraphTablesBackFlowRequest self = new GetIgraphTablesBackFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetIgraphTablesBackFlowRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
