// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class MarkEventDataMistakeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MarkEventDataMistakeResponseBody body;

    public static MarkEventDataMistakeResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkEventDataMistakeResponse self = new MarkEventDataMistakeResponse();
        return TeaModel.build(map, self);
    }

    public MarkEventDataMistakeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkEventDataMistakeResponse setBody(MarkEventDataMistakeResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkEventDataMistakeResponseBody getBody() {
        return this.body;
    }

}
