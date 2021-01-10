// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindSceneRuleToEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindSceneRuleToEdgeInstanceResponseBody body;

    public static BindSceneRuleToEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindSceneRuleToEdgeInstanceResponse self = new BindSceneRuleToEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindSceneRuleToEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindSceneRuleToEdgeInstanceResponse setBody(BindSceneRuleToEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSceneRuleToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
