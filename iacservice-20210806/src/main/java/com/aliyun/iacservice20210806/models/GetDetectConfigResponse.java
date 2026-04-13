// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetDetectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetectConfigResponseBody body;

    public static GetDetectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectConfigResponse self = new GetDetectConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectConfigResponse setBody(GetDetectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectConfigResponseBody getBody() {
        return this.body;
    }

}
