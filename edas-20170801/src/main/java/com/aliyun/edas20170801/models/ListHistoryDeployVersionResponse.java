// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListHistoryDeployVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHistoryDeployVersionResponseBody body;

    public static ListHistoryDeployVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryDeployVersionResponse self = new ListHistoryDeployVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoryDeployVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoryDeployVersionResponse setBody(ListHistoryDeployVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoryDeployVersionResponseBody getBody() {
        return this.body;
    }

}
