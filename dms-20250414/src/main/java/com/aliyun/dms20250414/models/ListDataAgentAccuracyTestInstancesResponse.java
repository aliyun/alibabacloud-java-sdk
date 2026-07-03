// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentAccuracyTestInstancesResponseBody body;

    public static ListDataAgentAccuracyTestInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestInstancesResponse self = new ListDataAgentAccuracyTestInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentAccuracyTestInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentAccuracyTestInstancesResponse setBody(ListDataAgentAccuracyTestInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentAccuracyTestInstancesResponseBody getBody() {
        return this.body;
    }

}
