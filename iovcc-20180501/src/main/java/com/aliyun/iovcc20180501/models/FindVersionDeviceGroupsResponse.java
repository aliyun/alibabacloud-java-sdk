// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionDeviceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindVersionDeviceGroupsResponseBody body;

    public static FindVersionDeviceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        FindVersionDeviceGroupsResponse self = new FindVersionDeviceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public FindVersionDeviceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindVersionDeviceGroupsResponse setBody(FindVersionDeviceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public FindVersionDeviceGroupsResponseBody getBody() {
        return this.body;
    }

}
