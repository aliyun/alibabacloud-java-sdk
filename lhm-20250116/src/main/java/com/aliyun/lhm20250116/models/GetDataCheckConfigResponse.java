// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCheckConfigResponseBody body;

    public static GetDataCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckConfigResponse self = new GetDataCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCheckConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCheckConfigResponse setBody(GetDataCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCheckConfigResponseBody getBody() {
        return this.body;
    }

}
