// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class DoPhysicalDeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoPhysicalDeleteResourceResponseBody body;

    public static DoPhysicalDeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DoPhysicalDeleteResourceResponse self = new DoPhysicalDeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public DoPhysicalDeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoPhysicalDeleteResourceResponse setBody(DoPhysicalDeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DoPhysicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

}
