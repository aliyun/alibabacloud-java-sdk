// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDeliveryTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeliveryTasksResponseBody body;

    public static ListDeliveryTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryTasksResponse self = new ListDeliveryTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDeliveryTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeliveryTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeliveryTasksResponse setBody(ListDeliveryTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeliveryTasksResponseBody getBody() {
        return this.body;
    }

}
