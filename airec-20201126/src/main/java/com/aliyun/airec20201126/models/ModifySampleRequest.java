// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifySampleRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static ModifySampleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySampleRequest self = new ModifySampleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySampleRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
