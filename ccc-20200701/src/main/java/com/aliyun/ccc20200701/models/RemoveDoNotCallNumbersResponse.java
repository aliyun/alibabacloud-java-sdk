// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveDoNotCallNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveDoNotCallNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDoNotCallNumbersResponse setBody(RemoveDoNotCallNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDoNotCallNumbersResponseBody getBody() {
        return this.body;
    }

}
