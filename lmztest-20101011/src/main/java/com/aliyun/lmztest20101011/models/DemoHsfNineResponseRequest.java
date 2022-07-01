// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfNineResponseRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("userMap")
    public java.util.Map<String, UserMapValue> userMap;

    public static DemoHsfNineResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfNineResponseRequest self = new DemoHsfNineResponseRequest();
        return TeaModel.build(map, self);
    }

    public DemoHsfNineResponseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DemoHsfNineResponseRequest setUserMap(java.util.Map<String, UserMapValue> userMap) {
        this.userMap = userMap;
        return this;
    }
    public java.util.Map<String, UserMapValue> getUserMap() {
        return this.userMap;
    }

}
