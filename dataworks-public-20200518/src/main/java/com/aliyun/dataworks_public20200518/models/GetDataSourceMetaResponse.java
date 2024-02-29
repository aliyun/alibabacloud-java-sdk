// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataSourceMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataSourceMetaResponseBody body;

    public static GetDataSourceMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceMetaResponse self = new GetDataSourceMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceMetaResponse setBody(GetDataSourceMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceMetaResponseBody getBody() {
        return this.body;
    }

}
