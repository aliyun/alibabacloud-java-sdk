// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetUploadAudioDataParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadAudioDataParamsResponseBody body;

    public static GetUploadAudioDataParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadAudioDataParamsResponse self = new GetUploadAudioDataParamsResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadAudioDataParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadAudioDataParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadAudioDataParamsResponse setBody(GetUploadAudioDataParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadAudioDataParamsResponseBody getBody() {
        return this.body;
    }

}
