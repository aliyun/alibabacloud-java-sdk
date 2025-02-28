// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeMajorCustomerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMajorCustomerInstancesResponseBody body;

    public static DescribeMajorCustomerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorCustomerInstancesResponse self = new DescribeMajorCustomerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMajorCustomerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMajorCustomerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMajorCustomerInstancesResponse setBody(DescribeMajorCustomerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMajorCustomerInstancesResponseBody getBody() {
        return this.body;
    }

}
