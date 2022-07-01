// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class Loop extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    @NameInMap("loop")
    public Loop loop;

    // name
    @NameInMap("name")
    public String name;

    public static Loop build(java.util.Map<String, ?> map) throws Exception {
        Loop self = new Loop();
        return TeaModel.build(map, self);
    }

    public Loop setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Loop setLoop(Loop loop) {
        this.loop = loop;
        return this;
    }
    public Loop getLoop() {
        return this.loop;
    }

    public Loop setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
