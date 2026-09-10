// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetCronExecTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCronExecTimeResponseBody body;

    public static GetCronExecTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCronExecTimeResponse self = new GetCronExecTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetCronExecTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCronExecTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCronExecTimeResponse setBody(GetCronExecTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCronExecTimeResponseBody getBody() {
        return this.body;
    }

}
