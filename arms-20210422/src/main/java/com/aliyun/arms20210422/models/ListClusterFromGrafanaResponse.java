// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListClusterFromGrafanaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterFromGrafanaResponseBody body;

    public static ListClusterFromGrafanaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterFromGrafanaResponse self = new ListClusterFromGrafanaResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterFromGrafanaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterFromGrafanaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterFromGrafanaResponse setBody(ListClusterFromGrafanaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterFromGrafanaResponseBody getBody() {
        return this.body;
    }

}
