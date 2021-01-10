// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListSupportFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSupportFeaturesResponseBody body;

    public static ListSupportFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportFeaturesResponse self = new ListSupportFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportFeaturesResponse setBody(ListSupportFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportFeaturesResponseBody getBody() {
        return this.body;
    }

}
