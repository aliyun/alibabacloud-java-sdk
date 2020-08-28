// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleOutClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleOutClusterResponseBody body;

    public static ScaleOutClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutClusterResponse self = new ScaleOutClusterResponse();
        return TeaModel.build(map, self);
    }

}
