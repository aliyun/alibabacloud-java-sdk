// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainAccountsV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainAccountsV2ResponseBody body;

    public static DescribeAntChainAccountsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainAccountsV2Response self = new DescribeAntChainAccountsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainAccountsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainAccountsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainAccountsV2Response setBody(DescribeAntChainAccountsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainAccountsV2ResponseBody getBody() {
        return this.body;
    }

}
