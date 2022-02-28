// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveDoNotCallNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDoNotCallNumbersResponseBody body;

    public static RemoveDoNotCallNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDoNotCallNumbersResponse self = new RemoveDoNotCallNumbersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDoNotCallNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDoNotCallNumbersResponse setBody(RemoveDoNotCallNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDoNotCallNumbersResponseBody getBody() {
        return this.body;
    }

}
