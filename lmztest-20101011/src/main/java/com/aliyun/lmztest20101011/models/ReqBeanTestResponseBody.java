// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ReqBeanTestResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static ReqBeanTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReqBeanTestResponseBody self = new ReqBeanTestResponseBody();
        return TeaModel.build(map, self);
    }

    public ReqBeanTestResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReqBeanTestResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
