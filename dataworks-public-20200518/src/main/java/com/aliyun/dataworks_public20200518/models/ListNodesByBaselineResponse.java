// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodesByBaselineResponseBody body;

    public static ListNodesByBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByBaselineResponse self = new ListNodesByBaselineResponse();
        return TeaModel.build(map, self);
    }

    public ListNodesByBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodesByBaselineResponse setBody(ListNodesByBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodesByBaselineResponseBody getBody() {
        return this.body;
    }

}
