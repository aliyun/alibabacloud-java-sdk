// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifySyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySyncJobResponseBody body;

    public static ModifySyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySyncJobResponse self = new ModifySyncJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifySyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySyncJobResponse setBody(ModifySyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySyncJobResponseBody getBody() {
        return this.body;
    }

}
