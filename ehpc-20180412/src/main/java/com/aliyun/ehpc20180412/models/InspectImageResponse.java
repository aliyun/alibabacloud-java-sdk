// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InspectImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InspectImageResponseBody body;

    public static InspectImageResponse build(java.util.Map<String, ?> map) throws Exception {
        InspectImageResponse self = new InspectImageResponse();
        return TeaModel.build(map, self);
    }

    public InspectImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InspectImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InspectImageResponse setBody(InspectImageResponseBody body) {
        this.body = body;
        return this;
    }
    public InspectImageResponseBody getBody() {
        return this.body;
    }

}
