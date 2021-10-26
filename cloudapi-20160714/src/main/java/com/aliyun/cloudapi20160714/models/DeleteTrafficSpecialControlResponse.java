// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteTrafficSpecialControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrafficSpecialControlResponseBody body;

    public static DeleteTrafficSpecialControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficSpecialControlResponse self = new DeleteTrafficSpecialControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficSpecialControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficSpecialControlResponse setBody(DeleteTrafficSpecialControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficSpecialControlResponseBody getBody() {
        return this.body;
    }

}
