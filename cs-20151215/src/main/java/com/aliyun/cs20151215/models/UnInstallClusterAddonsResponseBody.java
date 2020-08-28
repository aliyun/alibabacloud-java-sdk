// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnInstallClusterAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsResponseBody self = new UnInstallClusterAddonsResponseBody();
        return TeaModel.build(map, self);
    }

}
