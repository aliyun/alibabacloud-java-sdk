// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListMFADevicesForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMFADevicesForUserResponseBody body;

    public static ListMFADevicesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMFADevicesForUserResponse self = new ListMFADevicesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListMFADevicesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMFADevicesForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMFADevicesForUserResponse setBody(ListMFADevicesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMFADevicesForUserResponseBody getBody() {
        return this.body;
    }

}
