// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineBizEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineBizEntityResponseBody body;

    public static OfflineBizEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineBizEntityResponse self = new OfflineBizEntityResponse();
        return TeaModel.build(map, self);
    }

    public OfflineBizEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineBizEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineBizEntityResponse setBody(OfflineBizEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineBizEntityResponseBody getBody() {
        return this.body;
    }

}
