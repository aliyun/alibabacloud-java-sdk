// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnsRegionIdResourceResponseBody body;

    public static DescribeEnsRegionIdResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdResourceResponse self = new DescribeEnsRegionIdResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsRegionIdResourceResponse setBody(DescribeEnsRegionIdResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsRegionIdResourceResponseBody getBody() {
        return this.body;
    }

}
