// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceForRenewDesktopOversoldGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePriceForRenewDesktopOversoldGroupResponseBody body;

    public static DescribePriceForRenewDesktopOversoldGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceForRenewDesktopOversoldGroupResponse self = new DescribePriceForRenewDesktopOversoldGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribePriceForRenewDesktopOversoldGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePriceForRenewDesktopOversoldGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePriceForRenewDesktopOversoldGroupResponse setBody(DescribePriceForRenewDesktopOversoldGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePriceForRenewDesktopOversoldGroupResponseBody getBody() {
        return this.body;
    }

}
