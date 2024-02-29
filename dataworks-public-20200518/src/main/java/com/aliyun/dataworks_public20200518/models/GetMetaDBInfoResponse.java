// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaDBInfoResponseBody body;

    public static GetMetaDBInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoResponse self = new GetMetaDBInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaDBInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaDBInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaDBInfoResponse setBody(GetMetaDBInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaDBInfoResponseBody getBody() {
        return this.body;
    }

}
