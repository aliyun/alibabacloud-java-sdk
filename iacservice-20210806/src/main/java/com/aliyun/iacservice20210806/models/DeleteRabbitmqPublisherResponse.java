// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteRabbitmqPublisherResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRabbitmqPublisherResponseBody body;

    public static DeleteRabbitmqPublisherResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRabbitmqPublisherResponse self = new DeleteRabbitmqPublisherResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRabbitmqPublisherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRabbitmqPublisherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRabbitmqPublisherResponse setBody(DeleteRabbitmqPublisherResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRabbitmqPublisherResponseBody getBody() {
        return this.body;
    }

}
