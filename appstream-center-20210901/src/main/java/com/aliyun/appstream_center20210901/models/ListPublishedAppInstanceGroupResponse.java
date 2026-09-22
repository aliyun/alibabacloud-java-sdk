// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPublishedAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishedAppInstanceGroupResponseBody body;

    public static ListPublishedAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppInstanceGroupResponse self = new ListPublishedAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedAppInstanceGroupResponse setBody(ListPublishedAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
