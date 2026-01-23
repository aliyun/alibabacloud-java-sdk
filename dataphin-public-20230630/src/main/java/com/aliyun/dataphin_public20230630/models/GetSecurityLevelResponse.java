// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecurityLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityLevelResponseBody body;

    public static GetSecurityLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityLevelResponse self = new GetSecurityLevelResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityLevelResponse setBody(GetSecurityLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityLevelResponseBody getBody() {
        return this.body;
    }

}
