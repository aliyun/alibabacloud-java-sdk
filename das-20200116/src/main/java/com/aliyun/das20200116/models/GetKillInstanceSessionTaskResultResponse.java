// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetKillInstanceSessionTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKillInstanceSessionTaskResultResponseBody body;

    public static GetKillInstanceSessionTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKillInstanceSessionTaskResultResponse self = new GetKillInstanceSessionTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetKillInstanceSessionTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKillInstanceSessionTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKillInstanceSessionTaskResultResponse setBody(GetKillInstanceSessionTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKillInstanceSessionTaskResultResponseBody getBody() {
        return this.body;
    }

}
