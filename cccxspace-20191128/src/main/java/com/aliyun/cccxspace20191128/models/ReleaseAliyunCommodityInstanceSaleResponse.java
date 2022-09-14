// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseAliyunCommodityInstanceSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseAliyunCommodityInstanceSaleResponseBody body;

    public static ReleaseAliyunCommodityInstanceSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAliyunCommodityInstanceSaleResponse self = new ReleaseAliyunCommodityInstanceSaleResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseAliyunCommodityInstanceSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseAliyunCommodityInstanceSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseAliyunCommodityInstanceSaleResponse setBody(ReleaseAliyunCommodityInstanceSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseAliyunCommodityInstanceSaleResponseBody getBody() {
        return this.body;
    }

}
