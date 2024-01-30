// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCloudResourceAuthorizedResponseBody body;

    public static CheckCloudResourceAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedResponse self = new CheckCloudResourceAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCloudResourceAuthorizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCloudResourceAuthorizedResponse setBody(CheckCloudResourceAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCloudResourceAuthorizedResponseBody getBody() {
        return this.body;
    }

}
