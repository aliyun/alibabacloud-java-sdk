// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aquila20200104.models;

import com.aliyun.tea.*;

public class DoIntentionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DoIntentionResponse build(java.util.Map<String, ?> map) throws Exception {
        DoIntentionResponse self = new DoIntentionResponse();
        return TeaModel.build(map, self);
    }

    public DoIntentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
