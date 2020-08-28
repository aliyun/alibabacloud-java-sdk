// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsBody extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("version")
    public String version;

    @NameInMap("disabled")
    public Boolean disabled;

    @NameInMap("required")
    public String required;

    @NameInMap("config")
    public String config;

    public static InstallClusterAddonsBody build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsBody self = new InstallClusterAddonsBody();
        return TeaModel.build(map, self);
    }

}
