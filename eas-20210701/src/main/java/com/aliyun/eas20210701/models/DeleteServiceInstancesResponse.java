// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceInstancesResponseBody body;

    public static DeleteServiceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceInstancesResponse self = new DeleteServiceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceInstancesResponse setBody(DeleteServiceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceInstancesResponseBody getBody() {
        return this.body;
    }

}
