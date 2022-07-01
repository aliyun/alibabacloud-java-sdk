// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfSixTestResponseBody extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    public static DemoHsfSixTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfSixTestResponseBody self = new DemoHsfSixTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoHsfSixTestResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DemoHsfSixTestResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
