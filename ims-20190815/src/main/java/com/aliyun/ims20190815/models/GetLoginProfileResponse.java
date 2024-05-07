// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLoginProfileResponseBody body;

    public static GetLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileResponse self = new GetLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoginProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoginProfileResponse setBody(GetLoginProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoginProfileResponseBody getBody() {
        return this.body;
    }

}
