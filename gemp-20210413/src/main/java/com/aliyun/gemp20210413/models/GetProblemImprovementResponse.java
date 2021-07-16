// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemImprovementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProblemImprovementResponseBody body;

    public static GetProblemImprovementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProblemImprovementResponse self = new GetProblemImprovementResponse();
        return TeaModel.build(map, self);
    }

    public GetProblemImprovementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProblemImprovementResponse setBody(GetProblemImprovementResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProblemImprovementResponseBody getBody() {
        return this.body;
    }

}
