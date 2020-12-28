// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteJobsResponseBody body;

    public static DeleteJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsResponse self = new DeleteJobsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobsResponse setBody(DeleteJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobsResponseBody getBody() {
        return this.body;
    }

}
