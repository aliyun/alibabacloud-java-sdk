// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSourceTableMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSourceTableMetaResponseBody body;

    public static GetSourceTableMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSourceTableMetaResponse self = new GetSourceTableMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetSourceTableMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSourceTableMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSourceTableMetaResponse setBody(GetSourceTableMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSourceTableMetaResponseBody getBody() {
        return this.body;
    }

}
