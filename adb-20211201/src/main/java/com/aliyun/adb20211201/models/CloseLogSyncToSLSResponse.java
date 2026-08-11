// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CloseLogSyncToSLSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseLogSyncToSLSResponseBody body;

    public static CloseLogSyncToSLSResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseLogSyncToSLSResponse self = new CloseLogSyncToSLSResponse();
        return TeaModel.build(map, self);
    }

    public CloseLogSyncToSLSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseLogSyncToSLSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseLogSyncToSLSResponse setBody(CloseLogSyncToSLSResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseLogSyncToSLSResponseBody getBody() {
        return this.body;
    }

}
