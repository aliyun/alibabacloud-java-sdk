// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetCreateGroupFlagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCreateGroupFlagResponseBody body;

    public static GetCreateGroupFlagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreateGroupFlagResponse self = new GetCreateGroupFlagResponse();
        return TeaModel.build(map, self);
    }

    public GetCreateGroupFlagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreateGroupFlagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreateGroupFlagResponse setBody(GetCreateGroupFlagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreateGroupFlagResponseBody getBody() {
        return this.body;
    }

}
