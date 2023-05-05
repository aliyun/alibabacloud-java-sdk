// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DistributeAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DistributeAppResponseBody body;

    public static DistributeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DistributeAppResponse self = new DistributeAppResponse();
        return TeaModel.build(map, self);
    }

    public DistributeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DistributeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DistributeAppResponse setBody(DistributeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DistributeAppResponseBody getBody() {
        return this.body;
    }

}
