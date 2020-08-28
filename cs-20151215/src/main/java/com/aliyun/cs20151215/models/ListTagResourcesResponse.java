// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ListTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponse self = new ListTagResourcesResponse();
        return TeaModel.build(map, self);
    }

}
