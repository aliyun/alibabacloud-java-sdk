// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDtsJobsResponseBody body;

    public static DeleteDtsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtsJobsResponse self = new DeleteDtsJobsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDtsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDtsJobsResponse setBody(DeleteDtsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDtsJobsResponseBody getBody() {
        return this.body;
    }

}
