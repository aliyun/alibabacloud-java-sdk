// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListInstancesOfUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstancesOfUserResponseBody body;

    public static ListInstancesOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesOfUserResponse self = new ListInstancesOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesOfUserResponse setBody(ListInstancesOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesOfUserResponseBody getBody() {
        return this.body;
    }

}
