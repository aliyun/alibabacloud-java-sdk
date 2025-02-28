// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeMajorCustomersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMajorCustomersResponseBody body;

    public static DescribeMajorCustomersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorCustomersResponse self = new DescribeMajorCustomersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMajorCustomersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMajorCustomersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMajorCustomersResponse setBody(DescribeMajorCustomersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMajorCustomersResponseBody getBody() {
        return this.body;
    }

}
