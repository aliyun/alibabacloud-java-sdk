// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EstimatedPriceQueryV2ResponseBody body;

    public static EstimatedPriceQueryV2Response build(java.util.Map<String, ?> map) throws Exception {
        EstimatedPriceQueryV2Response self = new EstimatedPriceQueryV2Response();
        return TeaModel.build(map, self);
    }

    public EstimatedPriceQueryV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimatedPriceQueryV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EstimatedPriceQueryV2Response setBody(EstimatedPriceQueryV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimatedPriceQueryV2ResponseBody getBody() {
        return this.body;
    }

}
