// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileUploadParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAudioFileUploadParametersResponseBody body;

    public static GetAudioFileUploadParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileUploadParametersResponse self = new GetAudioFileUploadParametersResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioFileUploadParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioFileUploadParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAudioFileUploadParametersResponse setBody(GetAudioFileUploadParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioFileUploadParametersResponseBody getBody() {
        return this.body;
    }

}
