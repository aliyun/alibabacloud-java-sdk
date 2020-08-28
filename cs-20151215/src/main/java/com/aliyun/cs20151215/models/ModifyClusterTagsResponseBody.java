// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterTagsResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyClusterTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTagsResponseBody self = new ModifyClusterTagsResponseBody();
        return TeaModel.build(map, self);
    }

}
