// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class AccessKeyGetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccessKeyGetResponseBody body;

    public static AccessKeyGetResponse build(java.util.Map<String, ?> map) throws Exception {
        AccessKeyGetResponse self = new AccessKeyGetResponse();
        return TeaModel.build(map, self);
    }

    public AccessKeyGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccessKeyGetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccessKeyGetResponse setBody(AccessKeyGetResponseBody body) {
        this.body = body;
        return this;
    }
    public AccessKeyGetResponseBody getBody() {
        return this.body;
    }

}
