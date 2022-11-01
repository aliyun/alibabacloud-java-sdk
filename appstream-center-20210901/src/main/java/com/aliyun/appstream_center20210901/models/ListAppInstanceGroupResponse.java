// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppInstanceGroupResponseBody body;

    public static ListAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceGroupResponse self = new ListAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppInstanceGroupResponse setBody(ListAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
