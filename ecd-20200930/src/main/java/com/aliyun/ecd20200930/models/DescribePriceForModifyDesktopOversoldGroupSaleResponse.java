// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceForModifyDesktopOversoldGroupSaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePriceForModifyDesktopOversoldGroupSaleResponseBody body;

    public static DescribePriceForModifyDesktopOversoldGroupSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceForModifyDesktopOversoldGroupSaleResponse self = new DescribePriceForModifyDesktopOversoldGroupSaleResponse();
        return TeaModel.build(map, self);
    }

    public DescribePriceForModifyDesktopOversoldGroupSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePriceForModifyDesktopOversoldGroupSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePriceForModifyDesktopOversoldGroupSaleResponse setBody(DescribePriceForModifyDesktopOversoldGroupSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePriceForModifyDesktopOversoldGroupSaleResponseBody getBody() {
        return this.body;
    }

}
