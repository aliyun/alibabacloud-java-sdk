// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class StructOne extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    public static StructOne build(java.util.Map<String, ?> map) throws Exception {
        StructOne self = new StructOne();
        return TeaModel.build(map, self);
    }

    public StructOne setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
