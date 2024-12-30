// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsSlsADBJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApsSlsADBJobResponseBody body;

    public static ModifyApsSlsADBJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsSlsADBJobResponse self = new ModifyApsSlsADBJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApsSlsADBJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApsSlsADBJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApsSlsADBJobResponse setBody(ModifyApsSlsADBJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApsSlsADBJobResponseBody getBody() {
        return this.body;
    }

}
