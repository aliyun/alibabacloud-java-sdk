// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfNineResponseRequest extends TeaModel {
    @NameInMap("TestF1")
    public String testF1;

    @NameInMap("name")
    public String name;

    @NameInMap("userMap")
    public java.util.Map<String, UserMapValue> userMap;

    public static DemoHsfNineResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfNineResponseRequest self = new DemoHsfNineResponseRequest();
        return TeaModel.build(map, self);
    }

    public DemoHsfNineResponseRequest setTestF1(String testF1) {
        this.testF1 = testF1;
        return this;
    }
    public String getTestF1() {
        return this.testF1;
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
