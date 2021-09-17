// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ListXsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListXsInstancesResponseBody body;

    public static ListXsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListXsInstancesResponse self = new ListXsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListXsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListXsInstancesResponse setBody(ListXsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListXsInstancesResponseBody getBody() {
        return this.body;
    }

}
