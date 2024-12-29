// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApsJobResponseBody body;

    public static ModifyApsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsJobResponse self = new ModifyApsJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApsJobResponse setBody(ModifyApsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApsJobResponseBody getBody() {
        return this.body;
    }

}
