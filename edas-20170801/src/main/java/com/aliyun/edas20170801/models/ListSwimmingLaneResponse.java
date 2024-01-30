// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSwimmingLaneResponseBody body;

    public static ListSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneResponse self = new ListSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSwimmingLaneResponse setBody(ListSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
