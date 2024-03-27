// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDesensitizationStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDesensitizationStrategyResponseBody body;

    public static ModifyDesensitizationStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesensitizationStrategyResponse self = new ModifyDesensitizationStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesensitizationStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesensitizationStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesensitizationStrategyResponse setBody(ModifyDesensitizationStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesensitizationStrategyResponseBody getBody() {
        return this.body;
    }

}
