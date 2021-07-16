// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemImprovementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProblemImprovementResponseBody body;

    public static UpdateProblemImprovementResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemImprovementResponse self = new UpdateProblemImprovementResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProblemImprovementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProblemImprovementResponse setBody(UpdateProblemImprovementResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemImprovementResponseBody getBody() {
        return this.body;
    }

}
