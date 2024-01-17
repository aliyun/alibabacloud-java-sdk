// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiMarketInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyApiMarketInstanceAttributeResponseBody body;

    public static ModifyApiMarketInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiMarketInstanceAttributeResponse self = new ModifyApiMarketInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiMarketInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiMarketInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiMarketInstanceAttributeResponse setBody(ModifyApiMarketInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiMarketInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
