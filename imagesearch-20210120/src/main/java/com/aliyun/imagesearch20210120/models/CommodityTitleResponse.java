// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class CommodityTitleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CommodityTitleResponseBody body;

    public static CommodityTitleResponse build(java.util.Map<String, ?> map) throws Exception {
        CommodityTitleResponse self = new CommodityTitleResponse();
        return TeaModel.build(map, self);
    }

    public CommodityTitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommodityTitleResponse setBody(CommodityTitleResponseBody body) {
        this.body = body;
        return this;
    }
    public CommodityTitleResponseBody getBody() {
        return this.body;
    }

}
