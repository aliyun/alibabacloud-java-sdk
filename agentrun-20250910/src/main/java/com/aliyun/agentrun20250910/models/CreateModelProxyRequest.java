// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelProxyRequest extends TeaModel {
    @NameInMap("body")
    public CreateModelProxyInput body;

    public static CreateModelProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProxyRequest self = new CreateModelProxyRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelProxyRequest setBody(CreateModelProxyInput body) {
        this.body = body;
        return this;
    }
    public CreateModelProxyInput getBody() {
        return this.body;
    }

}
