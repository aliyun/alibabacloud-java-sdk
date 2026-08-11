// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenLogSyncToSLSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenLogSyncToSLSResponseBody body;

    public static OpenLogSyncToSLSResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenLogSyncToSLSResponse self = new OpenLogSyncToSLSResponse();
        return TeaModel.build(map, self);
    }

    public OpenLogSyncToSLSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenLogSyncToSLSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenLogSyncToSLSResponse setBody(OpenLogSyncToSLSResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenLogSyncToSLSResponseBody getBody() {
        return this.body;
    }

}
