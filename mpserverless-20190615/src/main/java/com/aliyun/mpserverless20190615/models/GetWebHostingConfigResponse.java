// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWebHostingConfigResponseBody body;

    public static GetWebHostingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingConfigResponse self = new GetWebHostingConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetWebHostingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebHostingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWebHostingConfigResponse setBody(GetWebHostingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebHostingConfigResponseBody getBody() {
        return this.body;
    }

}
