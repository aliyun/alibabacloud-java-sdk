// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClusterLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterLogsResponseBody body;

    public static ListClusterLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterLogsResponse self = new ListClusterLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterLogsResponse setBody(ListClusterLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterLogsResponseBody getBody() {
        return this.body;
    }

}
