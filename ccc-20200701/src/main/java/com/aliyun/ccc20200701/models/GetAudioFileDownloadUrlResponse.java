// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAudioFileDownloadUrlResponseBody body;

    public static GetAudioFileDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileDownloadUrlResponse self = new GetAudioFileDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioFileDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioFileDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAudioFileDownloadUrlResponse setBody(GetAudioFileDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioFileDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
