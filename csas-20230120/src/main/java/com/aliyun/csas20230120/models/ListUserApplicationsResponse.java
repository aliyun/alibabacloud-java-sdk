// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserApplicationsResponseBody body;

    public static ListUserApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserApplicationsResponse self = new ListUserApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserApplicationsResponse setBody(ListUserApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserApplicationsResponseBody getBody() {
        return this.body;
    }

}
