// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    @NameInMap("body")
    public Environment body;

    public static UpdateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentRequest self = new UpdateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentRequest setBody(Environment body) {
        this.body = body;
        return this;
    }
    public Environment getBody() {
        return this.body;
    }

}
