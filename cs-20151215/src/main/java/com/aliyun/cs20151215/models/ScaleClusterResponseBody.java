// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ScaleClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterResponseBody self = new ScaleClusterResponseBody();
        return TeaModel.build(map, self);
    }

}
