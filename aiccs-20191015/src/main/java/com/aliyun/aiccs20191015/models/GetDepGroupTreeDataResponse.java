// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetDepGroupTreeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDepGroupTreeDataResponseBody body;

    public static GetDepGroupTreeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDepGroupTreeDataResponse self = new GetDepGroupTreeDataResponse();
        return TeaModel.build(map, self);
    }

    public GetDepGroupTreeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDepGroupTreeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDepGroupTreeDataResponse setBody(GetDepGroupTreeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDepGroupTreeDataResponseBody getBody() {
        return this.body;
    }

}
