// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnInstallClusterAddonsBody body;

    public static UnInstallClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsRequest self = new UnInstallClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

}
