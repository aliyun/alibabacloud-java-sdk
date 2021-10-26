// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrafficControlResponseBody body;

    public static DeleteTrafficControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlResponse self = new DeleteTrafficControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficControlResponse setBody(DeleteTrafficControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficControlResponseBody getBody() {
        return this.body;
    }

}
