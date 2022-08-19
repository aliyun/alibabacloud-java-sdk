// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserIdByPhoneNumberResponseBody body;

    public static GetUserIdByPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByPhoneNumberResponse self = new GetUserIdByPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdByPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdByPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdByPhoneNumberResponse setBody(GetUserIdByPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdByPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
