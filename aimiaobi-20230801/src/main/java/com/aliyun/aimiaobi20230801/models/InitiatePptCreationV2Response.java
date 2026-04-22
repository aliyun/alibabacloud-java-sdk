// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitiatePptCreationV2ResponseBody body;

    public static InitiatePptCreationV2Response build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationV2Response self = new InitiatePptCreationV2Response();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitiatePptCreationV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitiatePptCreationV2Response setBody(InitiatePptCreationV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public InitiatePptCreationV2ResponseBody getBody() {
        return this.body;
    }

}
