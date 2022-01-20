// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aquila20200104.models;

import com.aliyun.tea.*;

public class DoInferenceRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static DoInferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        DoInferenceRequest self = new DoInferenceRequest();
        return TeaModel.build(map, self);
    }

    public DoInferenceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
