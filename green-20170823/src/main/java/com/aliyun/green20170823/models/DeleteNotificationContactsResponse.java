// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteNotificationContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNotificationContactsResponseBody body;

    public static DeleteNotificationContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationContactsResponse self = new DeleteNotificationContactsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNotificationContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNotificationContactsResponse setBody(DeleteNotificationContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNotificationContactsResponseBody getBody() {
        return this.body;
    }

}
