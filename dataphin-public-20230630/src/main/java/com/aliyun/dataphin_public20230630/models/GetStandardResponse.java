// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStandardResponseBody body;

    public static GetStandardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardResponse self = new GetStandardResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandardResponse setBody(GetStandardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardResponseBody getBody() {
        return this.body;
    }

}
