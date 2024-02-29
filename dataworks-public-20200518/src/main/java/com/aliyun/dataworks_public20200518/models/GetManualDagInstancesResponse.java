// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetManualDagInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetManualDagInstancesResponseBody body;

    public static GetManualDagInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManualDagInstancesResponse self = new GetManualDagInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetManualDagInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManualDagInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManualDagInstancesResponse setBody(GetManualDagInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManualDagInstancesResponseBody getBody() {
        return this.body;
    }

}
