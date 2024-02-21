// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnOrderCommodityCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnOrderCommodityCodeResponseBody body;

    public static DescribeCdnOrderCommodityCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnOrderCommodityCodeResponse self = new DescribeCdnOrderCommodityCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnOrderCommodityCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnOrderCommodityCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnOrderCommodityCodeResponse setBody(DescribeCdnOrderCommodityCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnOrderCommodityCodeResponseBody getBody() {
        return this.body;
    }

}
