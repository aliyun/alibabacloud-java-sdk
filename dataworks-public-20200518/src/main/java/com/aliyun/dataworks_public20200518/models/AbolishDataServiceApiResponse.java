// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AbolishDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbolishDataServiceApiResponseBody body;

    public static AbolishDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishDataServiceApiResponse self = new AbolishDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public AbolishDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbolishDataServiceApiResponse setBody(AbolishDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishDataServiceApiResponseBody getBody() {
        return this.body;
    }

}
