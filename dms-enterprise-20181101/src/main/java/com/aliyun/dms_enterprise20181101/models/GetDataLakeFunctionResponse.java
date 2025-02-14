// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataLakeFunctionResponseBody body;

    public static GetDataLakeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakeFunctionResponse self = new GetDataLakeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public GetDataLakeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataLakeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataLakeFunctionResponse setBody(GetDataLakeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataLakeFunctionResponseBody getBody() {
        return this.body;
    }

}
