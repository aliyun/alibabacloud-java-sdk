// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateK8sClusterUserConfigExpireResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static UpdateK8sClusterUserConfigExpireResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sClusterUserConfigExpireResponse self = new UpdateK8sClusterUserConfigExpireResponse();
        return TeaModel.build(map, self);
    }

}
