// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static UpgradeClusterAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterAddonsResponse self = new UpgradeClusterAddonsResponse();
        return TeaModel.build(map, self);
    }

}
