// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAtiRegistrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAtiRegistrantResponseBody body;

    public static UpdateAtiRegistrantResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAtiRegistrantResponse self = new UpdateAtiRegistrantResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAtiRegistrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAtiRegistrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAtiRegistrantResponse setBody(UpdateAtiRegistrantResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAtiRegistrantResponseBody getBody() {
        return this.body;
    }

}
