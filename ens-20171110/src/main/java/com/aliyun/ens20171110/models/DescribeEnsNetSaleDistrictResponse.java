// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEnsNetSaleDistrictResponse setBody(DescribeEnsNetSaleDistrictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsNetSaleDistrictResponseBody getBody() {
        return this.body;
    }

}
