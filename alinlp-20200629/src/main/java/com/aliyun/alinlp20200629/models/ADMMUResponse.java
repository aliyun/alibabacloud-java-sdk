// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADMMUResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ADMMUResponseBody body;

    public static ADMMUResponse build(java.util.Map<String, ?> map) throws Exception {
        ADMMUResponse self = new ADMMUResponse();
        return TeaModel.build(map, self);
    }

    public ADMMUResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ADMMUResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ADMMUResponse setBody(ADMMUResponseBody body) {
        this.body = body;
        return this;
    }
    public ADMMUResponseBody getBody() {
        return this.body;
    }

}
