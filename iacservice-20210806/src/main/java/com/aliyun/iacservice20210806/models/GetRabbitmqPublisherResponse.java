// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRabbitmqPublisherResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRabbitmqPublisherResponseBody body;

    public static GetRabbitmqPublisherResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRabbitmqPublisherResponse self = new GetRabbitmqPublisherResponse();
        return TeaModel.build(map, self);
    }

    public GetRabbitmqPublisherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRabbitmqPublisherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRabbitmqPublisherResponse setBody(GetRabbitmqPublisherResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRabbitmqPublisherResponseBody getBody() {
        return this.body;
    }

}
