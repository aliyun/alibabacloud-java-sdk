// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAppBySwimmingLaneGroupTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppBySwimmingLaneGroupTagResponseBody body;

    public static ListAppBySwimmingLaneGroupTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppBySwimmingLaneGroupTagResponse self = new ListAppBySwimmingLaneGroupTagResponse();
        return TeaModel.build(map, self);
    }

    public ListAppBySwimmingLaneGroupTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppBySwimmingLaneGroupTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppBySwimmingLaneGroupTagResponse setBody(ListAppBySwimmingLaneGroupTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppBySwimmingLaneGroupTagResponseBody getBody() {
        return this.body;
    }

}
