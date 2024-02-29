// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class OfflineNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineNodeResponseBody body;

    public static OfflineNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineNodeResponse self = new OfflineNodeResponse();
        return TeaModel.build(map, self);
    }

    public OfflineNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineNodeResponse setBody(OfflineNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineNodeResponseBody getBody() {
        return this.body;
    }

}
