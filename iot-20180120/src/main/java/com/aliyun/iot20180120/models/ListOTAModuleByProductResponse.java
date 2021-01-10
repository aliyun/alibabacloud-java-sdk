// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAModuleByProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOTAModuleByProductResponseBody body;

    public static ListOTAModuleByProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAModuleByProductResponse self = new ListOTAModuleByProductResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAModuleByProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTAModuleByProductResponse setBody(ListOTAModuleByProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTAModuleByProductResponseBody getBody() {
        return this.body;
    }

}
