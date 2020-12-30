// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceComponentHealthInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterServiceComponentHealthInfoResponseBody body;

    public static ListClusterServiceComponentHealthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceComponentHealthInfoResponse self = new ListClusterServiceComponentHealthInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceComponentHealthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterServiceComponentHealthInfoResponse setBody(ListClusterServiceComponentHealthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterServiceComponentHealthInfoResponseBody getBody() {
        return this.body;
    }

}
