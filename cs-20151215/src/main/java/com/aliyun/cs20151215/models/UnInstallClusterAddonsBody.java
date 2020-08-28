// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsBody extends TeaModel {
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static UnInstallClusterAddonsBody build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsBody self = new UnInstallClusterAddonsBody();
        return TeaModel.build(map, self);
    }

}
