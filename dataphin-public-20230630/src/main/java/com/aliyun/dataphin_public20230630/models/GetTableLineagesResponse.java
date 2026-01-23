// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableLineagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableLineagesResponseBody body;

    public static GetTableLineagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableLineagesResponse self = new GetTableLineagesResponse();
        return TeaModel.build(map, self);
    }

    public GetTableLineagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableLineagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableLineagesResponse setBody(GetTableLineagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableLineagesResponseBody getBody() {
        return this.body;
    }

}
