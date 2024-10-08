// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserDeliveryTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserDeliveryTasksResponseBody body;

    public static ListUserDeliveryTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDeliveryTasksResponse self = new ListUserDeliveryTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDeliveryTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDeliveryTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserDeliveryTasksResponse setBody(ListUserDeliveryTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDeliveryTasksResponseBody getBody() {
        return this.body;
    }

}
