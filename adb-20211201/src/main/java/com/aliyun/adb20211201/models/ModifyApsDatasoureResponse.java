// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsDatasoureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApsDatasoureResponseBody body;

    public static ModifyApsDatasoureResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsDatasoureResponse self = new ModifyApsDatasoureResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApsDatasoureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApsDatasoureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApsDatasoureResponse setBody(ModifyApsDatasoureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApsDatasoureResponseBody getBody() {
        return this.body;
    }

}
