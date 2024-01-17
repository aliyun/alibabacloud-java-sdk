// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDataSourceOrderConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataSourceOrderConfigResponseBody body;

    public static GetDataSourceOrderConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceOrderConfigResponse self = new GetDataSourceOrderConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceOrderConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceOrderConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceOrderConfigResponse setBody(GetDataSourceOrderConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceOrderConfigResponseBody getBody() {
        return this.body;
    }

}
