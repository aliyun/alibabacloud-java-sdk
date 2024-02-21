// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumptionTimestampResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyConsumptionTimestampResponseBody body;

    public static ModifyConsumptionTimestampResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumptionTimestampResponse self = new ModifyConsumptionTimestampResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConsumptionTimestampResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConsumptionTimestampResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyConsumptionTimestampResponse setBody(ModifyConsumptionTimestampResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumptionTimestampResponseBody getBody() {
        return this.body;
    }

}
