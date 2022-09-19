// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifySqlTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySqlTemplateGroupResponseBody body;

    public static ModifySqlTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlTemplateGroupResponse self = new ModifySqlTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifySqlTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySqlTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySqlTemplateGroupResponse setBody(ModifySqlTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySqlTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
