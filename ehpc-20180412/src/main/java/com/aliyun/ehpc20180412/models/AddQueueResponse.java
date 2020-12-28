// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddQueueResponseBody body;

    public static AddQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        AddQueueResponse self = new AddQueueResponse();
        return TeaModel.build(map, self);
    }

    public AddQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddQueueResponse setBody(AddQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public AddQueueResponseBody getBody() {
        return this.body;
    }

}
