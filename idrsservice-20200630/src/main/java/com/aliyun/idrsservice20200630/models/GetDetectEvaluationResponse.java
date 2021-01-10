// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectEvaluationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectEvaluationResponseBody body;

    public static GetDetectEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectEvaluationResponse self = new GetDetectEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectEvaluationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectEvaluationResponse setBody(GetDetectEvaluationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectEvaluationResponseBody getBody() {
        return this.body;
    }

}
