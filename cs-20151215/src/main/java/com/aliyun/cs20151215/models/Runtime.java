// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Runtime extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>docker</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>19.03.5</p>
     */
    @NameInMap("version")
    public String version;

    public static Runtime build(java.util.Map<String, ?> map) throws Exception {
        Runtime self = new Runtime();
        return TeaModel.build(map, self);
    }

    public Runtime setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Runtime setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
