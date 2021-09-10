// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDIProjectConfigResponseBody body;

    public static ListDIProjectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIProjectConfigResponse self = new ListDIProjectConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListDIProjectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDIProjectConfigResponse setBody(ListDIProjectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDIProjectConfigResponseBody getBody() {
        return this.body;
    }

}
