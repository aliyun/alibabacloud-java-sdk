// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsNetSaleDistrictResponseBody body;

    public static DescribeEnsNetSaleDistrictResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetSaleDistrictResponse self = new DescribeEnsNetSaleDistrictResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetSaleDistrictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsNetSaleDistrictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsNetSaleDistrictResponse setBody(DescribeEnsNetSaleDistrictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsNetSaleDistrictResponseBody getBody() {
        return this.body;
    }

}
