// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CheckUserInSecurityCenterWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserInSecurityCenterWhiteListResponseBody body;

    public static CheckUserInSecurityCenterWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserInSecurityCenterWhiteListResponse self = new CheckUserInSecurityCenterWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserInSecurityCenterWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserInSecurityCenterWhiteListResponse setBody(CheckUserInSecurityCenterWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserInSecurityCenterWhiteListResponseBody getBody() {
        return this.body;
    }

}
