// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAutoScaleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoScaleConfigResponseBody body;

    public static GetAutoScaleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleConfigResponse self = new GetAutoScaleConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScaleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoScaleConfigResponse setBody(GetAutoScaleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScaleConfigResponseBody getBody() {
        return this.body;
    }

}
