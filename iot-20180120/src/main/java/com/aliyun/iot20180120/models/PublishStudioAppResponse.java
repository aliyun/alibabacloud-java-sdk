// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishStudioAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishStudioAppResponseBody body;

    public static PublishStudioAppResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishStudioAppResponse self = new PublishStudioAppResponse();
        return TeaModel.build(map, self);
    }

    public PublishStudioAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishStudioAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishStudioAppResponse setBody(PublishStudioAppResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishStudioAppResponseBody getBody() {
        return this.body;
    }

}
