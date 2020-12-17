// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Runtimes extends TeaModel {
    // 容器运行时名称。
    @NameInMap("name")
    public String name;

    // 容器运行时版本。
    @NameInMap("version")
    public String version;

    public static Runtimes build(java.util.Map<String, ?> map) throws Exception {
        Runtimes self = new Runtimes();
        return TeaModel.build(map, self);
    }

    public Runtimes setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Runtimes setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
