// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumptionTimestampResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyConsumptionTimestampResponse setBody(ModifyConsumptionTimestampResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumptionTimestampResponseBody getBody() {
        return this.body;
    }

}
