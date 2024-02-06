// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsCommodityModuleCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsCommodityModuleCodeResponseBody body;

    public static DescribeEnsCommodityModuleCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsCommodityModuleCodeResponse self = new DescribeEnsCommodityModuleCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsCommodityModuleCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsCommodityModuleCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsCommodityModuleCodeResponse setBody(DescribeEnsCommodityModuleCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsCommodityModuleCodeResponseBody getBody() {
        return this.body;
    }

}
