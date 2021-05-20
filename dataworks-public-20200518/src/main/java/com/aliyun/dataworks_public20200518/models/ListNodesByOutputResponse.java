// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodesByOutputResponseBody body;

    public static ListNodesByOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByOutputResponse self = new ListNodesByOutputResponse();
        return TeaModel.build(map, self);
    }

    public ListNodesByOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodesByOutputResponse setBody(ListNodesByOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodesByOutputResponseBody getBody() {
        return this.body;
    }

}
