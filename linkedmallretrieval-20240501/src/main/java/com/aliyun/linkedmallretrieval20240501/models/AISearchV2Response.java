// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class AISearchV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AISearchV2ResponseBody body;

    public static AISearchV2Response build(java.util.Map<String, ?> map) throws Exception {
        AISearchV2Response self = new AISearchV2Response();
        return TeaModel.build(map, self);
    }

    public AISearchV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AISearchV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AISearchV2Response setBody(AISearchV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public AISearchV2ResponseBody getBody() {
        return this.body;
    }

}
