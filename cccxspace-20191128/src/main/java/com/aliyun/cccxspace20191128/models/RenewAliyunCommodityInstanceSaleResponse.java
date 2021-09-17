// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class RenewAliyunCommodityInstanceSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewAliyunCommodityInstanceSaleResponseBody body;

    public static RenewAliyunCommodityInstanceSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAliyunCommodityInstanceSaleResponse self = new RenewAliyunCommodityInstanceSaleResponse();
        return TeaModel.build(map, self);
    }

    public RenewAliyunCommodityInstanceSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAliyunCommodityInstanceSaleResponse setBody(RenewAliyunCommodityInstanceSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAliyunCommodityInstanceSaleResponseBody getBody() {
        return this.body;
    }

}
