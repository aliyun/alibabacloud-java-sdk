// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BVolumeMount extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("path")
    public String path;

    public static E2BVolumeMount build(java.util.Map<String, ?> map) throws Exception {
        E2BVolumeMount self = new E2BVolumeMount();
        return TeaModel.build(map, self);
    }

    public E2BVolumeMount setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public E2BVolumeMount setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
