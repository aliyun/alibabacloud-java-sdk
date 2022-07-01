// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class GrayReleaseDemoRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GrayReleaseDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        GrayReleaseDemoRequest self = new GrayReleaseDemoRequest();
        return TeaModel.build(map, self);
    }

    public GrayReleaseDemoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
