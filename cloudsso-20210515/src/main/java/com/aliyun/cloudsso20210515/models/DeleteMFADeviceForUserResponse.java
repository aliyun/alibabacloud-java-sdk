// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteMFADeviceForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMFADeviceForUserResponseBody body;

    public static DeleteMFADeviceForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMFADeviceForUserResponse self = new DeleteMFADeviceForUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMFADeviceForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMFADeviceForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMFADeviceForUserResponse setBody(DeleteMFADeviceForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMFADeviceForUserResponseBody getBody() {
        return this.body;
    }

}
