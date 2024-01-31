// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BtripBillInfoAdjustResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BtripBillInfoAdjustResponseBody body;

    public static BtripBillInfoAdjustResponse build(java.util.Map<String, ?> map) throws Exception {
        BtripBillInfoAdjustResponse self = new BtripBillInfoAdjustResponse();
        return TeaModel.build(map, self);
    }

    public BtripBillInfoAdjustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BtripBillInfoAdjustResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BtripBillInfoAdjustResponse setBody(BtripBillInfoAdjustResponseBody body) {
        this.body = body;
        return this;
    }
    public BtripBillInfoAdjustResponseBody getBody() {
        return this.body;
    }

}
