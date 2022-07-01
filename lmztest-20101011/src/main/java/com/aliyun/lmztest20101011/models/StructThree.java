// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class StructThree extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    public static StructThree build(java.util.Map<String, ?> map) throws Exception {
        StructThree self = new StructThree();
        return TeaModel.build(map, self);
    }

    public StructThree setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
