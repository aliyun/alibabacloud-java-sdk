// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SharePrivateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SharePrivateDataResponseBody body;

    public static SharePrivateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        SharePrivateDataResponse self = new SharePrivateDataResponse();
        return TeaModel.build(map, self);
    }

    public SharePrivateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SharePrivateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SharePrivateDataResponse setBody(SharePrivateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public SharePrivateDataResponseBody getBody() {
        return this.body;
    }

}
