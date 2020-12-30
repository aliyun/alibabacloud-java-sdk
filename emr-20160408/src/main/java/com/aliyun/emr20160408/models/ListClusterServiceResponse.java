// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterServiceResponseBody body;

    public static ListClusterServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceResponse self = new ListClusterServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterServiceResponse setBody(ListClusterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterServiceResponseBody getBody() {
        return this.body;
    }

}
