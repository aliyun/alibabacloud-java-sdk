// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePoliciesV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePoliciesV2ResponseBody body;

    public static DescribePoliciesV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribePoliciesV2Response self = new DescribePoliciesV2Response();
        return TeaModel.build(map, self);
    }

    public DescribePoliciesV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePoliciesV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePoliciesV2Response setBody(DescribePoliciesV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePoliciesV2ResponseBody getBody() {
        return this.body;
    }

}
