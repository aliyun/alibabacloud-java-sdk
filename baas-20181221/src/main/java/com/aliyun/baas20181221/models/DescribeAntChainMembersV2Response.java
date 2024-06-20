// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMembersV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainMembersV2ResponseBody body;

    public static DescribeAntChainMembersV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMembersV2Response self = new DescribeAntChainMembersV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMembersV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMembersV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMembersV2Response setBody(DescribeAntChainMembersV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMembersV2ResponseBody getBody() {
        return this.body;
    }

}
