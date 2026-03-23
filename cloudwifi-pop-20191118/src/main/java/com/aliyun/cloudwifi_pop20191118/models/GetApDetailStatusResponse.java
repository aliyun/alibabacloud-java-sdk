// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApDetailStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApDetailStatusResponseBody body;

    public static GetApDetailStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApDetailStatusResponse self = new GetApDetailStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetApDetailStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApDetailStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApDetailStatusResponse setBody(GetApDetailStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApDetailStatusResponseBody getBody() {
        return this.body;
    }

}
