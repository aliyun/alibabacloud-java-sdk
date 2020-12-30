// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterHostComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterHostComponentResponseBody body;

    public static ListClusterHostComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHostComponentResponse self = new ListClusterHostComponentResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterHostComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterHostComponentResponse setBody(ListClusterHostComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterHostComponentResponseBody getBody() {
        return this.body;
    }

}
