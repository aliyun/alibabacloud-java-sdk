// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateDefaultBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDefaultBResponseBody body;

    public static UpdateDefaultBResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDefaultBResponse self = new UpdateDefaultBResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDefaultBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDefaultBResponse setBody(UpdateDefaultBResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDefaultBResponseBody getBody() {
        return this.body;
    }

}
