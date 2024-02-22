// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetText2ImageJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetText2ImageJobResponseBody body;

    public static GetText2ImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetText2ImageJobResponse self = new GetText2ImageJobResponse();
        return TeaModel.build(map, self);
    }

    public GetText2ImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetText2ImageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetText2ImageJobResponse setBody(GetText2ImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetText2ImageJobResponseBody getBody() {
        return this.body;
    }

}
