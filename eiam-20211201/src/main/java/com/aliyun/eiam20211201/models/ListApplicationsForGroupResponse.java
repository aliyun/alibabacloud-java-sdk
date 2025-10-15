// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForGroupResponseBody body;

    public static ListApplicationsForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForGroupResponse self = new ListApplicationsForGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForGroupResponse setBody(ListApplicationsForGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForGroupResponseBody getBody() {
        return this.body;
    }

}
