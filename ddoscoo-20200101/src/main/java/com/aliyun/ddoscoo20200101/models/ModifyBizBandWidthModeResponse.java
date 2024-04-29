// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBizBandWidthModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBizBandWidthModeResponseBody body;

    public static ModifyBizBandWidthModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizBandWidthModeResponse self = new ModifyBizBandWidthModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBizBandWidthModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBizBandWidthModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBizBandWidthModeResponse setBody(ModifyBizBandWidthModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBizBandWidthModeResponseBody getBody() {
        return this.body;
    }

}
