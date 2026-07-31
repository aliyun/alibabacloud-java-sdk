// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReplaceSemanticViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceSemanticViewResponseBody body;

    public static ReplaceSemanticViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSemanticViewResponse self = new ReplaceSemanticViewResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceSemanticViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceSemanticViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceSemanticViewResponse setBody(ReplaceSemanticViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceSemanticViewResponseBody getBody() {
        return this.body;
    }

}
