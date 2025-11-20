// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelProxyRequest extends TeaModel {
    @NameInMap("body")
    public UpdateModelProxyInput body;

    public static UpdateModelProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelProxyRequest self = new UpdateModelProxyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelProxyRequest setBody(UpdateModelProxyInput body) {
        this.body = body;
        return this;
    }
    public UpdateModelProxyInput getBody() {
        return this.body;
    }

}
