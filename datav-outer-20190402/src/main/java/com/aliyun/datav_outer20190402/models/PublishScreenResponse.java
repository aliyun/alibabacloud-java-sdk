// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class PublishScreenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishScreenResponseBody body;

    public static PublishScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishScreenResponse self = new PublishScreenResponse();
        return TeaModel.build(map, self);
    }

    public PublishScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishScreenResponse setBody(PublishScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishScreenResponseBody getBody() {
        return this.body;
    }

}
