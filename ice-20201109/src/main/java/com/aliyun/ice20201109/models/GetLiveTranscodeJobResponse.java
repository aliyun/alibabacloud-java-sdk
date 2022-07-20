// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveTranscodeJobResponseBody body;

    public static GetLiveTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveTranscodeJobResponse self = new GetLiveTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveTranscodeJobResponse setBody(GetLiveTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
