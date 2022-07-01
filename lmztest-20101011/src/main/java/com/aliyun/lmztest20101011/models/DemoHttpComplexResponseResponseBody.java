// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHttpComplexResponseResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("id")
    public String id;

    @NameInMap("infos")
    public java.util.List<java.util.Map<String, String>> infos;

    @NameInMap("name")
    public String name;

    public static DemoHttpComplexResponseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoHttpComplexResponseResponseBody self = new DemoHttpComplexResponseResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoHttpComplexResponseResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DemoHttpComplexResponseResponseBody setInfos(java.util.List<java.util.Map<String, String>> infos) {
        this.infos = infos;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getInfos() {
        return this.infos;
    }

    public DemoHttpComplexResponseResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
