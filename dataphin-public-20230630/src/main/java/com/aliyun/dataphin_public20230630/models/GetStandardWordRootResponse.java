// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardWordRootResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStandardWordRootResponseBody body;

    public static GetStandardWordRootResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardWordRootResponse self = new GetStandardWordRootResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardWordRootResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardWordRootResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandardWordRootResponse setBody(GetStandardWordRootResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardWordRootResponseBody getBody() {
        return this.body;
    }

}
