// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SaveWebRtcInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveWebRtcInfoResponseBody body;

    public static SaveWebRtcInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRtcInfoResponse self = new SaveWebRtcInfoResponse();
        return TeaModel.build(map, self);
    }

    public SaveWebRtcInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWebRtcInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveWebRtcInfoResponse setBody(SaveWebRtcInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWebRtcInfoResponseBody getBody() {
        return this.body;
    }

}
