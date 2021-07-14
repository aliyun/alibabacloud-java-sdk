// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class SayNameRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    public static SayNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SayNameRequest self = new SayNameRequest();
        return TeaModel.build(map, self);
    }

    public SayNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
