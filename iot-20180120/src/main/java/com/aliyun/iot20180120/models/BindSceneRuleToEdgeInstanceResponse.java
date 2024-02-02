// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindSceneRuleToEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BindSceneRuleToEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindSceneRuleToEdgeInstanceResponse setBody(BindSceneRuleToEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSceneRuleToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
