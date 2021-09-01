// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RemoveEventDataMistakeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveEventDataMistakeResponseBody body;

    public static RemoveEventDataMistakeResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEventDataMistakeResponse self = new RemoveEventDataMistakeResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEventDataMistakeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEventDataMistakeResponse setBody(RemoveEventDataMistakeResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEventDataMistakeResponseBody getBody() {
        return this.body;
    }

}
