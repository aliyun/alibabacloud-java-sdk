// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListOneMetaSqlTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOneMetaSqlTemplatesResponseBody body;

    public static ListOneMetaSqlTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOneMetaSqlTemplatesResponse self = new ListOneMetaSqlTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListOneMetaSqlTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOneMetaSqlTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOneMetaSqlTemplatesResponse setBody(ListOneMetaSqlTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOneMetaSqlTemplatesResponseBody getBody() {
        return this.body;
    }

}
