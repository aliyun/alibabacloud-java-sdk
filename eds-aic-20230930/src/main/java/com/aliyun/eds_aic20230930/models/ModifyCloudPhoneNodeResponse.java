// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyCloudPhoneNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudPhoneNodeResponseBody body;

    public static ModifyCloudPhoneNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudPhoneNodeResponse self = new ModifyCloudPhoneNodeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudPhoneNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudPhoneNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudPhoneNodeResponse setBody(ModifyCloudPhoneNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudPhoneNodeResponseBody getBody() {
        return this.body;
    }

}
