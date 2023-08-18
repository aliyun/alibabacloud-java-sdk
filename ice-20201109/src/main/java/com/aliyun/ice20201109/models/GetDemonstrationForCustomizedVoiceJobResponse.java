// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDemonstrationForCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDemonstrationForCustomizedVoiceJobResponseBody body;

    public static GetDemonstrationForCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDemonstrationForCustomizedVoiceJobResponse self = new GetDemonstrationForCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDemonstrationForCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDemonstrationForCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDemonstrationForCustomizedVoiceJobResponse setBody(GetDemonstrationForCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDemonstrationForCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
