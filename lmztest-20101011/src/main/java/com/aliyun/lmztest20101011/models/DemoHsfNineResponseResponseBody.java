// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfNineResponseResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("id")
    public String id;

    @NameInMap("infos")
    public java.util.List<java.util.Map<String, String>> infos;

    @NameInMap("name")
    public String name;

    public static DemoHsfNineResponseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfNineResponseResponseBody self = new DemoHsfNineResponseResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoHsfNineResponseResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DemoHsfNineResponseResponseBody setInfos(java.util.List<java.util.Map<String, String>> infos) {
        this.infos = infos;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getInfos() {
        return this.infos;
    }

    public DemoHsfNineResponseResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
