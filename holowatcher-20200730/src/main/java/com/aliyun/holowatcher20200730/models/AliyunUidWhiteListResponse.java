// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunUidWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AliyunUidWhiteListResponseBody body;

    public static AliyunUidWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AliyunUidWhiteListResponse self = new AliyunUidWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AliyunUidWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AliyunUidWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AliyunUidWhiteListResponse setBody(AliyunUidWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AliyunUidWhiteListResponseBody getBody() {
        return this.body;
    }

}
