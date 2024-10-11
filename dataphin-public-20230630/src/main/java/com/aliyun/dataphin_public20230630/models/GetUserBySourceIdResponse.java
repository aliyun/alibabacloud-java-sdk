// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUserBySourceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserBySourceIdResponseBody body;

    public static GetUserBySourceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserBySourceIdResponse self = new GetUserBySourceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserBySourceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserBySourceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserBySourceIdResponse setBody(GetUserBySourceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserBySourceIdResponseBody getBody() {
        return this.body;
    }

}
