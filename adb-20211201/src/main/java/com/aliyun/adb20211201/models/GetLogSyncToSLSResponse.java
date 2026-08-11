// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetLogSyncToSLSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogSyncToSLSResponseBody body;

    public static GetLogSyncToSLSResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogSyncToSLSResponse self = new GetLogSyncToSLSResponse();
        return TeaModel.build(map, self);
    }

    public GetLogSyncToSLSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogSyncToSLSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogSyncToSLSResponse setBody(GetLogSyncToSLSResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogSyncToSLSResponseBody getBody() {
        return this.body;
    }

}
