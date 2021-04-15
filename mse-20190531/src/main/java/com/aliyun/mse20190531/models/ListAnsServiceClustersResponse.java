// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServiceClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAnsServiceClustersResponseBody body;

    public static ListAnsServiceClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServiceClustersResponse self = new ListAnsServiceClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListAnsServiceClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnsServiceClustersResponse setBody(ListAnsServiceClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnsServiceClustersResponseBody getBody() {
        return this.body;
    }

}
