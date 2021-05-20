// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeInputOrOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeInputOrOutputResponseBody body;

    public static ListNodeInputOrOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInputOrOutputResponse self = new ListNodeInputOrOutputResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeInputOrOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeInputOrOutputResponse setBody(ListNodeInputOrOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeInputOrOutputResponseBody getBody() {
        return this.body;
    }

}
