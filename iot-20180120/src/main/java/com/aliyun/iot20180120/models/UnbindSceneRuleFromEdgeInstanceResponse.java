// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindSceneRuleFromEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindSceneRuleFromEdgeInstanceResponseBody body;

    public static UnbindSceneRuleFromEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSceneRuleFromEdgeInstanceResponse self = new UnbindSceneRuleFromEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSceneRuleFromEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSceneRuleFromEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSceneRuleFromEdgeInstanceResponse setBody(UnbindSceneRuleFromEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSceneRuleFromEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
