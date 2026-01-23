// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineStandardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineStandardResponseBody body;

    public static OfflineStandardResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineStandardResponse self = new OfflineStandardResponse();
        return TeaModel.build(map, self);
    }

    public OfflineStandardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineStandardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineStandardResponse setBody(OfflineStandardResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineStandardResponseBody getBody() {
        return this.body;
    }

}
