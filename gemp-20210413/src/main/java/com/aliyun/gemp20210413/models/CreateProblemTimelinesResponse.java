// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProblemTimelinesResponseBody body;

    public static CreateProblemTimelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemTimelinesResponse self = new CreateProblemTimelinesResponse();
        return TeaModel.build(map, self);
    }

    public CreateProblemTimelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProblemTimelinesResponse setBody(CreateProblemTimelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProblemTimelinesResponseBody getBody() {
        return this.body;
    }

}
