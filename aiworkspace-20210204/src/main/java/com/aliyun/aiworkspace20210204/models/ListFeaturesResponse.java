// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFeaturesResponseBody body;

    public static ListFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeaturesResponse self = new ListFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeaturesResponse setBody(ListFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeaturesResponseBody getBody() {
        return this.body;
    }

}
