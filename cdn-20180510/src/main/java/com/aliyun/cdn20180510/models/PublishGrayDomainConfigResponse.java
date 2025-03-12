// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PublishGrayDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishGrayDomainConfigResponseBody body;

    public static PublishGrayDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishGrayDomainConfigResponse self = new PublishGrayDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public PublishGrayDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishGrayDomainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishGrayDomainConfigResponse setBody(PublishGrayDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishGrayDomainConfigResponseBody getBody() {
        return this.body;
    }

}
