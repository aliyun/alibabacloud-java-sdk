// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlTransTableMetaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlTransTableMetaInfoResponseBody body;

    public static GetSqlTransTableMetaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTransTableMetaInfoResponse self = new GetSqlTransTableMetaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlTransTableMetaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlTransTableMetaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlTransTableMetaInfoResponse setBody(GetSqlTransTableMetaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlTransTableMetaInfoResponseBody getBody() {
        return this.body;
    }

}
