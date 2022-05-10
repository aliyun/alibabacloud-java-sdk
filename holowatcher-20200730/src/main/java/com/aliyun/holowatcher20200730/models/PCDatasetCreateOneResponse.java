// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PCDatasetCreateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PCDatasetCreateOneResponseBody body;

    public static PCDatasetCreateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        PCDatasetCreateOneResponse self = new PCDatasetCreateOneResponse();
        return TeaModel.build(map, self);
    }

    public PCDatasetCreateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PCDatasetCreateOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PCDatasetCreateOneResponse setBody(PCDatasetCreateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public PCDatasetCreateOneResponseBody getBody() {
        return this.body;
    }

}
