// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteDeliveryTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSiteDeliveryTasksResponseBody body;

    public static ListSiteDeliveryTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSiteDeliveryTasksResponse self = new ListSiteDeliveryTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSiteDeliveryTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSiteDeliveryTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSiteDeliveryTasksResponse setBody(ListSiteDeliveryTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSiteDeliveryTasksResponseBody getBody() {
        return this.body;
    }

}
