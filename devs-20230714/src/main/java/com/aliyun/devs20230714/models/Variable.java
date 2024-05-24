// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Variable extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("value")
    public String value;

    public static Variable build(java.util.Map<String, ?> map) throws Exception {
        Variable self = new Variable();
        return TeaModel.build(map, self);
    }

    public Variable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Variable setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
