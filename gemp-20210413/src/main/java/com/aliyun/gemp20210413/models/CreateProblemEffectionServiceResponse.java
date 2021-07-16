// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemEffectionServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProblemEffectionServiceResponseBody body;

    public static CreateProblemEffectionServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemEffectionServiceResponse self = new CreateProblemEffectionServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateProblemEffectionServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProblemEffectionServiceResponse setBody(CreateProblemEffectionServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

}
