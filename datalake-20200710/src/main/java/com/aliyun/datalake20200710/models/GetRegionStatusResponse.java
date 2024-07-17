// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetRegionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegionStatusResponseBody body;

    public static GetRegionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionStatusResponse self = new GetRegionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegionStatusResponse setBody(GetRegionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionStatusResponseBody getBody() {
        return this.body;
    }

}
