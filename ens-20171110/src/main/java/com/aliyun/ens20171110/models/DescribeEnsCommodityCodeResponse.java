// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsCommodityCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnsCommodityCodeResponseBody body;

    public static DescribeEnsCommodityCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsCommodityCodeResponse self = new DescribeEnsCommodityCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsCommodityCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsCommodityCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsCommodityCodeResponse setBody(DescribeEnsCommodityCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsCommodityCodeResponseBody getBody() {
        return this.body;
    }

}
