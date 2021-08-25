// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregatorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAggregatorsResponseBody body;

    public static DeleteAggregatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregatorsResponse self = new DeleteAggregatorsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAggregatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAggregatorsResponse setBody(DeleteAggregatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAggregatorsResponseBody getBody() {
        return this.body;
    }

}
