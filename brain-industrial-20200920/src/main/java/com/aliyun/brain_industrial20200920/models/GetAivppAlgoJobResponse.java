// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetAivppAlgoJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAivppAlgoJobResponseBody body;

    public static GetAivppAlgoJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAivppAlgoJobResponse self = new GetAivppAlgoJobResponse();
        return TeaModel.build(map, self);
    }

    public GetAivppAlgoJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAivppAlgoJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAivppAlgoJobResponse setBody(GetAivppAlgoJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAivppAlgoJobResponseBody getBody() {
        return this.body;
    }

}
