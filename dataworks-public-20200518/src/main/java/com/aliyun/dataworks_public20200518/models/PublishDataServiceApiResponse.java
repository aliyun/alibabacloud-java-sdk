// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class PublishDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishDataServiceApiResponseBody body;

    public static PublishDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishDataServiceApiResponse self = new PublishDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public PublishDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishDataServiceApiResponse setBody(PublishDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishDataServiceApiResponseBody getBody() {
        return this.body;
    }

}
