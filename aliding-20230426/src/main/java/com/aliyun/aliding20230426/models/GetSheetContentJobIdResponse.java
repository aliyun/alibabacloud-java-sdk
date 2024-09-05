// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetContentJobIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSheetContentJobIdResponseBody body;

    public static GetSheetContentJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSheetContentJobIdResponse self = new GetSheetContentJobIdResponse();
        return TeaModel.build(map, self);
    }

    public GetSheetContentJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSheetContentJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSheetContentJobIdResponse setBody(GetSheetContentJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSheetContentJobIdResponseBody getBody() {
        return this.body;
    }

}
