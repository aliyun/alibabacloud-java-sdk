// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class NoticeInstanceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NoticeInstanceUserResponseBody body;

    public static NoticeInstanceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        NoticeInstanceUserResponse self = new NoticeInstanceUserResponse();
        return TeaModel.build(map, self);
    }

    public NoticeInstanceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NoticeInstanceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NoticeInstanceUserResponse setBody(NoticeInstanceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public NoticeInstanceUserResponseBody getBody() {
        return this.body;
    }

}
