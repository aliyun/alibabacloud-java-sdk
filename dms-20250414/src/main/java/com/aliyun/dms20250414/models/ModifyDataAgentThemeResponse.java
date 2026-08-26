// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyDataAgentThemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDataAgentThemeResponseBody body;

    public static ModifyDataAgentThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataAgentThemeResponse self = new ModifyDataAgentThemeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataAgentThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataAgentThemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataAgentThemeResponse setBody(ModifyDataAgentThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataAgentThemeResponseBody getBody() {
        return this.body;
    }

}
