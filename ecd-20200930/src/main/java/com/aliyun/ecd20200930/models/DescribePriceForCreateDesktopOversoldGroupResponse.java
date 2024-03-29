// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceForCreateDesktopOversoldGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePriceForCreateDesktopOversoldGroupResponseBody body;

    public static DescribePriceForCreateDesktopOversoldGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceForCreateDesktopOversoldGroupResponse self = new DescribePriceForCreateDesktopOversoldGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribePriceForCreateDesktopOversoldGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePriceForCreateDesktopOversoldGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePriceForCreateDesktopOversoldGroupResponse setBody(DescribePriceForCreateDesktopOversoldGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePriceForCreateDesktopOversoldGroupResponseBody getBody() {
        return this.body;
    }

}
