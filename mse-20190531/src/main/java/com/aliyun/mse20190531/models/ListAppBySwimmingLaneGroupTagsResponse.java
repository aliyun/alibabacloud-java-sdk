// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAppBySwimmingLaneGroupTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppBySwimmingLaneGroupTagsResponseBody body;

    public static ListAppBySwimmingLaneGroupTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppBySwimmingLaneGroupTagsResponse self = new ListAppBySwimmingLaneGroupTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppBySwimmingLaneGroupTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppBySwimmingLaneGroupTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppBySwimmingLaneGroupTagsResponse setBody(ListAppBySwimmingLaneGroupTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppBySwimmingLaneGroupTagsResponseBody getBody() {
        return this.body;
    }

}
