// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListThingTemplatesResponseBody body;

    public static ListThingTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListThingTemplatesResponse self = new ListThingTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListThingTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListThingTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListThingTemplatesResponse setBody(ListThingTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListThingTemplatesResponseBody getBody() {
        return this.body;
    }

}
