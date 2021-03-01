// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListServiceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceGroupsResponseBody body;

    public static ListServiceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsResponse self = new ListServiceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceGroupsResponse setBody(ListServiceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceGroupsResponseBody getBody() {
        return this.body;
    }

}
