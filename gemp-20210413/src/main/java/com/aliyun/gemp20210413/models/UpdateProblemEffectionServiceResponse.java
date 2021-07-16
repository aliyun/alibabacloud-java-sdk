// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemEffectionServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProblemEffectionServiceResponseBody body;

    public static UpdateProblemEffectionServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemEffectionServiceResponse self = new UpdateProblemEffectionServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProblemEffectionServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProblemEffectionServiceResponse setBody(UpdateProblemEffectionServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

}
