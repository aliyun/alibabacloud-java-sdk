// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsBody extends TeaModel {
    @NameInMap("component_name")
    public String componentName;

    @NameInMap("version")
    public String version;

    public static UpgradeClusterAddonsBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterAddonsBody self = new UpgradeClusterAddonsBody();
        return TeaModel.build(map, self);
    }

}
