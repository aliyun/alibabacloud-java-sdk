// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeCpfsAccessPointMountedClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCpfsAccessPointMountedClientsResponseBody body;

    public static DescribeCpfsAccessPointMountedClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCpfsAccessPointMountedClientsResponse self = new DescribeCpfsAccessPointMountedClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCpfsAccessPointMountedClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCpfsAccessPointMountedClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCpfsAccessPointMountedClientsResponse setBody(DescribeCpfsAccessPointMountedClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCpfsAccessPointMountedClientsResponseBody getBody() {
        return this.body;
    }

}
