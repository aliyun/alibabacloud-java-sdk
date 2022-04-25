// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class LjxTestRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static LjxTestRequest build(java.util.Map<String, ?> map) throws Exception {
        LjxTestRequest self = new LjxTestRequest();
        return TeaModel.build(map, self);
    }

    public LjxTestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
