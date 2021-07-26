// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationVariateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigurationVariateResponseBody body;

    public static ListConfigurationVariateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigurationVariateResponse self = new ListConfigurationVariateResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigurationVariateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigurationVariateResponse setBody(ListConfigurationVariateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigurationVariateResponseBody getBody() {
        return this.body;
    }

}
