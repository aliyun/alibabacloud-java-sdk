// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aquila20200104.models;

import com.aliyun.tea.*;

public class DoIntentionRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static DoIntentionRequest build(java.util.Map<String, ?> map) throws Exception {
        DoIntentionRequest self = new DoIntentionRequest();
        return TeaModel.build(map, self);
    }

    public DoIntentionRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
