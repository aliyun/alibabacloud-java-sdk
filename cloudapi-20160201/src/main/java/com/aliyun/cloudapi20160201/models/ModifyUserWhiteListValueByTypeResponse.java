// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyUserWhiteListValueByTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserWhiteListValueByTypeResponseBody body;

    public static ModifyUserWhiteListValueByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserWhiteListValueByTypeResponse self = new ModifyUserWhiteListValueByTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserWhiteListValueByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserWhiteListValueByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserWhiteListValueByTypeResponse setBody(ModifyUserWhiteListValueByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserWhiteListValueByTypeResponseBody getBody() {
        return this.body;
    }

}
