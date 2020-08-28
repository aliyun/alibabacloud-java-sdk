// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveClusterNodesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    public RemoveClusterNodesBody body;

    public static RemoveClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterNodesRequest self = new RemoveClusterNodesRequest();
        return TeaModel.build(map, self);
    }

}
