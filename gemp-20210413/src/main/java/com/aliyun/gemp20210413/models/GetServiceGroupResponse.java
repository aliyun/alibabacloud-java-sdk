// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceGroupResponseBody body;

    public static GetServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupResponse self = new GetServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceGroupResponse setBody(GetServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceGroupResponseBody getBody() {
        return this.body;
    }

}
