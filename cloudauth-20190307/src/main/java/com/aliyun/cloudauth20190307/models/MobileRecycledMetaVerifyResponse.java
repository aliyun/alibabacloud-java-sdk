// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileRecycledMetaVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MobileRecycledMetaVerifyResponseBody body;

    public static MobileRecycledMetaVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        MobileRecycledMetaVerifyResponse self = new MobileRecycledMetaVerifyResponse();
        return TeaModel.build(map, self);
    }

    public MobileRecycledMetaVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MobileRecycledMetaVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MobileRecycledMetaVerifyResponse setBody(MobileRecycledMetaVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public MobileRecycledMetaVerifyResponseBody getBody() {
        return this.body;
    }

}
