// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeInstanceGroupPriceForRenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceGroupPriceForRenewResponseBody body;

    public static DescribeInstanceGroupPriceForRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceGroupPriceForRenewResponse self = new DescribeInstanceGroupPriceForRenewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceGroupPriceForRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceGroupPriceForRenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceGroupPriceForRenewResponse setBody(DescribeInstanceGroupPriceForRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceGroupPriceForRenewResponseBody getBody() {
        return this.body;
    }

}
