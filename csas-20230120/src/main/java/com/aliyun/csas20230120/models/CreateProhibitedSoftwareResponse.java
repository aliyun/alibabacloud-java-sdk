// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProhibitedSoftwareResponseBody body;

    public static CreateProhibitedSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedSoftwareResponse self = new CreateProhibitedSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProhibitedSoftwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProhibitedSoftwareResponse setBody(CreateProhibitedSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProhibitedSoftwareResponseBody getBody() {
        return this.body;
    }

}
