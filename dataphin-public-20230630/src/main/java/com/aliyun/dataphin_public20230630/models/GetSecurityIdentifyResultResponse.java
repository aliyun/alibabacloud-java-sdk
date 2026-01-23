// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecurityIdentifyResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityIdentifyResultResponseBody body;

    public static GetSecurityIdentifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityIdentifyResultResponse self = new GetSecurityIdentifyResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityIdentifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityIdentifyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityIdentifyResultResponse setBody(GetSecurityIdentifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityIdentifyResultResponseBody getBody() {
        return this.body;
    }

}
