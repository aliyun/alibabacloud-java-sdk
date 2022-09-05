// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetMainPartListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMainPartListByUserIdResponseBody body;

    public static GetMainPartListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainPartListByUserIdResponse self = new GetMainPartListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMainPartListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMainPartListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMainPartListByUserIdResponse setBody(GetMainPartListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMainPartListByUserIdResponseBody getBody() {
        return this.body;
    }

}
