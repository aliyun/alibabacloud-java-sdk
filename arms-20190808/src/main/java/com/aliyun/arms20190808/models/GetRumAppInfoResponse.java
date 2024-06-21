// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumAppInfoResponseBody body;

    public static GetRumAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumAppInfoResponse self = new GetRumAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRumAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumAppInfoResponse setBody(GetRumAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumAppInfoResponseBody getBody() {
        return this.body;
    }

}
