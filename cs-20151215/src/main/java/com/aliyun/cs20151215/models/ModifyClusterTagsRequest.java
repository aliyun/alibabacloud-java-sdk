// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterTagsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterTagsBody body;

    public static ModifyClusterTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTagsRequest self = new ModifyClusterTagsRequest();
        return TeaModel.build(map, self);
    }

}
