// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterNodesBody body;

    public static DeleteClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesRequest self = new DeleteClusterNodesRequest();
        return TeaModel.build(map, self);
    }

}
