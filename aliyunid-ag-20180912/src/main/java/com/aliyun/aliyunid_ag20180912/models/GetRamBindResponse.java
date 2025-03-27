// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class GetRamBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRamBindResponseBody body;

    public static GetRamBindResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRamBindResponse self = new GetRamBindResponse();
        return TeaModel.build(map, self);
    }

    public GetRamBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRamBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRamBindResponse setBody(GetRamBindResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRamBindResponseBody getBody() {
        return this.body;
    }

}
