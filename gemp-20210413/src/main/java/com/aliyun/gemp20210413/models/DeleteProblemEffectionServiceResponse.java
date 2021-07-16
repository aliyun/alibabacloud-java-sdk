// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemEffectionServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProblemEffectionServiceResponseBody body;

    public static DeleteProblemEffectionServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemEffectionServiceResponse self = new DeleteProblemEffectionServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProblemEffectionServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProblemEffectionServiceResponse setBody(DeleteProblemEffectionServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

}
