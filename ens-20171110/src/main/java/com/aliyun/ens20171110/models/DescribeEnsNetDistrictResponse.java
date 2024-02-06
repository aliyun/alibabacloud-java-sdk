// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsNetDistrictResponseBody body;

    public static DescribeEnsNetDistrictResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetDistrictResponse self = new DescribeEnsNetDistrictResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetDistrictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsNetDistrictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsNetDistrictResponse setBody(DescribeEnsNetDistrictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsNetDistrictResponseBody getBody() {
        return this.body;
    }

}
