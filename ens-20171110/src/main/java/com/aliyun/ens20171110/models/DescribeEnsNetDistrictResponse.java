// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEnsNetDistrictResponse setBody(DescribeEnsNetDistrictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsNetDistrictResponseBody getBody() {
        return this.body;
    }

}
