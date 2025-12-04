// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetGeneralConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGeneralConfigResponseBody body;

    public static GetGeneralConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralConfigResponse self = new GetGeneralConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetGeneralConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGeneralConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGeneralConfigResponse setBody(GetGeneralConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGeneralConfigResponseBody getBody() {
        return this.body;
    }

}
