// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerIdeInstancesResponseBody body;

    public static ListServerIdeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeInstancesResponse self = new ListServerIdeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListServerIdeInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerIdeInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerIdeInstancesResponse setBody(ListServerIdeInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerIdeInstancesResponseBody getBody() {
        return this.body;
    }

}
