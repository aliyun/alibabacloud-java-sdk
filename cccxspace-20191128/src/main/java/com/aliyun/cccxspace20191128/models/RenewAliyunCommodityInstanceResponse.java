// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class RenewAliyunCommodityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewAliyunCommodityInstanceResponseBody body;

    public static RenewAliyunCommodityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAliyunCommodityInstanceResponse self = new RenewAliyunCommodityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewAliyunCommodityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAliyunCommodityInstanceResponse setBody(RenewAliyunCommodityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAliyunCommodityInstanceResponseBody getBody() {
        return this.body;
    }

}
