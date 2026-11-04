// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPrivacyNumberCallDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPrivacyNumberCallDetailResponseBody body;

    public static ModifyPrivacyNumberCallDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivacyNumberCallDetailResponse self = new ModifyPrivacyNumberCallDetailResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrivacyNumberCallDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrivacyNumberCallDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPrivacyNumberCallDetailResponse setBody(ModifyPrivacyNumberCallDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrivacyNumberCallDetailResponseBody getBody() {
        return this.body;
    }

}
