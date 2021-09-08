// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListThingTemplatesResponse setBody(ListThingTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListThingTemplatesResponseBody getBody() {
        return this.body;
    }

}
