// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWebHostingStatusResponseBody body;

    public static GetWebHostingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingStatusResponse self = new GetWebHostingStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetWebHostingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebHostingStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWebHostingStatusResponse setBody(GetWebHostingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebHostingStatusResponseBody getBody() {
        return this.body;
    }

}
