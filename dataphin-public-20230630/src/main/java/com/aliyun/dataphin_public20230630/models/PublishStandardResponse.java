// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishStandardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishStandardResponseBody body;

    public static PublishStandardResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishStandardResponse self = new PublishStandardResponse();
        return TeaModel.build(map, self);
    }

    public PublishStandardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishStandardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishStandardResponse setBody(PublishStandardResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishStandardResponseBody getBody() {
        return this.body;
    }

}
