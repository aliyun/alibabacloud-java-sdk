// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterHostResponseBody body;

    public static ListClusterHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHostResponse self = new ListClusterHostResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterHostResponse setBody(ListClusterHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterHostResponseBody getBody() {
        return this.body;
    }

}
