// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeAudioSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnalyzeAudioSyncResponseBody body;

    public static AnalyzeAudioSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeAudioSyncResponse self = new AnalyzeAudioSyncResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeAudioSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeAudioSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeAudioSyncResponse setBody(AnalyzeAudioSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeAudioSyncResponseBody getBody() {
        return this.body;
    }

}
