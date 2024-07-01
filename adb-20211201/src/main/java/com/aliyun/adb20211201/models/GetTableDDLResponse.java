// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableDDLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableDDLResponseBody body;

    public static GetTableDDLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableDDLResponse self = new GetTableDDLResponse();
        return TeaModel.build(map, self);
    }

    public GetTableDDLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableDDLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableDDLResponse setBody(GetTableDDLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableDDLResponseBody getBody() {
        return this.body;
    }

}
