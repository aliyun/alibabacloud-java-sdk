// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectChefCapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectChefCapResponseBody body;

    public static DetectChefCapResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectChefCapResponse self = new DetectChefCapResponse();
        return TeaModel.build(map, self);
    }

    public DetectChefCapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectChefCapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectChefCapResponse setBody(DetectChefCapResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectChefCapResponseBody getBody() {
        return this.body;
    }

}
