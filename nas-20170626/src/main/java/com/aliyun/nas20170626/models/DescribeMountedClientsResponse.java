// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountedClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMountedClientsResponseBody body;

    public static DescribeMountedClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountedClientsResponse self = new DescribeMountedClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMountedClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMountedClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMountedClientsResponse setBody(DescribeMountedClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMountedClientsResponseBody getBody() {
        return this.body;
    }

}
