// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsDatasoureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApsDatasoureResponseBody body;

    public static CreateApsDatasoureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApsDatasoureResponse self = new CreateApsDatasoureResponse();
        return TeaModel.build(map, self);
    }

    public CreateApsDatasoureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApsDatasoureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApsDatasoureResponse setBody(CreateApsDatasoureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApsDatasoureResponseBody getBody() {
        return this.body;
    }

}
