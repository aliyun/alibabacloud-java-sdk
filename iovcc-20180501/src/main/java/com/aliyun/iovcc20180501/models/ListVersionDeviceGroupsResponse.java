// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListVersionDeviceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVersionDeviceGroupsResponseBody body;

    public static ListVersionDeviceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVersionDeviceGroupsResponse self = new ListVersionDeviceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListVersionDeviceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVersionDeviceGroupsResponse setBody(ListVersionDeviceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVersionDeviceGroupsResponseBody getBody() {
        return this.body;
    }

}
