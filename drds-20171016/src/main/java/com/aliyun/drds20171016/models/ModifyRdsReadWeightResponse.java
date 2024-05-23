// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyRdsReadWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRdsReadWeightResponseBody body;

    public static ModifyRdsReadWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRdsReadWeightResponse self = new ModifyRdsReadWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRdsReadWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRdsReadWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRdsReadWeightResponse setBody(ModifyRdsReadWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRdsReadWeightResponseBody getBody() {
        return this.body;
    }

}
