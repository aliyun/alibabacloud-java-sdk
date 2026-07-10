// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateTeamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTeamResponseBody body;

    public static UpdateTeamResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamResponse self = new UpdateTeamResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTeamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTeamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTeamResponse setBody(UpdateTeamResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTeamResponseBody getBody() {
        return this.body;
    }

}
