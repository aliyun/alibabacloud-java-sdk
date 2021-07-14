// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class SayNameRequest extends TeaModel {
    @NameInMap("name")
    public java.io.InputStream name;

    public static SayNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SayNameRequest self = new SayNameRequest();
        return TeaModel.build(map, self);
    }

    public SayNameRequest setName(java.io.InputStream name) {
        this.name = name;
        return this;
    }
    public java.io.InputStream getName() {
        return this.name;
    }

}
