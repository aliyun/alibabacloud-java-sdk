// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterTagsResponseBody body;

    public static ModifyClusterTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTagsResponse self = new ModifyClusterTagsResponse();
        return TeaModel.build(map, self);
    }

}
