// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterTemplatesResponseBody body;

    public static ListClusterTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTemplatesResponse self = new ListClusterTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterTemplatesResponse setBody(ListClusterTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterTemplatesResponseBody getBody() {
        return this.body;
    }

}
