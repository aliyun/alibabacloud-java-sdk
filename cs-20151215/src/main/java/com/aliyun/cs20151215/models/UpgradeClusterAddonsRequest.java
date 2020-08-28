// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    public UpgradeClusterAddonsBody body;

    public static UpgradeClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterAddonsRequest self = new UpgradeClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

}
