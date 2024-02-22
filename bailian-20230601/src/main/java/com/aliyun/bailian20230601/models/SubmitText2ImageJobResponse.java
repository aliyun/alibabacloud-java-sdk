// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SubmitText2ImageJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitText2ImageJobResponseBody body;

    public static SubmitText2ImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitText2ImageJobResponse self = new SubmitText2ImageJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitText2ImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitText2ImageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitText2ImageJobResponse setBody(SubmitText2ImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitText2ImageJobResponseBody getBody() {
        return this.body;
    }

}
