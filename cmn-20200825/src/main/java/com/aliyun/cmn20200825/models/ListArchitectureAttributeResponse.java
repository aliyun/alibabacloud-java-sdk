// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListArchitectureAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListArchitectureAttributeResponseBody body;

    public static ListArchitectureAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArchitectureAttributeResponse self = new ListArchitectureAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ListArchitectureAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArchitectureAttributeResponse setBody(ListArchitectureAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArchitectureAttributeResponseBody getBody() {
        return this.body;
    }

}
