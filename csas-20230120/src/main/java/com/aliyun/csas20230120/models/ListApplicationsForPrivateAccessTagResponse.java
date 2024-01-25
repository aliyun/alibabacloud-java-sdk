// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForPrivateAccessTagResponseBody body;

    public static ListApplicationsForPrivateAccessTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessTagResponse self = new ListApplicationsForPrivateAccessTagResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForPrivateAccessTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForPrivateAccessTagResponse setBody(ListApplicationsForPrivateAccessTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForPrivateAccessTagResponseBody getBody() {
        return this.body;
    }

}
