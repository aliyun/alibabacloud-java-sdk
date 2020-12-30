// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClustersResponseBody body;

    public static ListClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponse self = new ListClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClustersResponse setBody(ListClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClustersResponseBody getBody() {
        return this.body;
    }

}
