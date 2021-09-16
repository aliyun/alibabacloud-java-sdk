// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDtsJobResponseBody body;

    public static DeleteDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtsJobResponse self = new DeleteDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDtsJobResponse setBody(DeleteDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDtsJobResponseBody getBody() {
        return this.body;
    }

}
