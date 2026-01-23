// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableColumnLineagesResponseBody body;

    public static GetTableColumnLineagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineagesResponse self = new GetTableColumnLineagesResponse();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableColumnLineagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableColumnLineagesResponse setBody(GetTableColumnLineagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableColumnLineagesResponseBody getBody() {
        return this.body;
    }

}
