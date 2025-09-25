// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifySqlTemplatePositionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySqlTemplatePositionResponseBody body;

    public static ModifySqlTemplatePositionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlTemplatePositionResponse self = new ModifySqlTemplatePositionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySqlTemplatePositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySqlTemplatePositionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySqlTemplatePositionResponse setBody(ModifySqlTemplatePositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySqlTemplatePositionResponseBody getBody() {
        return this.body;
    }

}
