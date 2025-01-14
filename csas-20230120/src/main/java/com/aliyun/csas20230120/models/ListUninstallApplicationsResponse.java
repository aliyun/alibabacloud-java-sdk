// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUninstallApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUninstallApplicationsResponseBody body;

    public static ListUninstallApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallApplicationsResponse self = new ListUninstallApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListUninstallApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUninstallApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUninstallApplicationsResponse setBody(ListUninstallApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUninstallApplicationsResponseBody getBody() {
        return this.body;
    }

}
