// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHostAvailabilityResponseBody body;

    public static DeleteHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAvailabilityResponse self = new DeleteHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHostAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHostAvailabilityResponse setBody(DeleteHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
