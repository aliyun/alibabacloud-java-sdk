// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAnsServicesResponseBody body;

    public static ListAnsServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServicesResponse self = new ListAnsServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListAnsServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnsServicesResponse setBody(ListAnsServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnsServicesResponseBody getBody() {
        return this.body;
    }

}
