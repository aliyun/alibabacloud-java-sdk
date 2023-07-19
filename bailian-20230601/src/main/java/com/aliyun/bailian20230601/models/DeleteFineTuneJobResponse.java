// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteFineTuneJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFineTuneJobResponseBody body;

    public static DeleteFineTuneJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFineTuneJobResponse self = new DeleteFineTuneJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFineTuneJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFineTuneJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFineTuneJobResponse setBody(DeleteFineTuneJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFineTuneJobResponseBody getBody() {
        return this.body;
    }

}
