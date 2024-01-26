// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldGroupSaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDesktopOversoldGroupSaleResponseBody body;

    public static ModifyDesktopOversoldGroupSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldGroupSaleResponse self = new ModifyDesktopOversoldGroupSaleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldGroupSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopOversoldGroupSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopOversoldGroupSaleResponse setBody(ModifyDesktopOversoldGroupSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopOversoldGroupSaleResponseBody getBody() {
        return this.body;
    }

}
