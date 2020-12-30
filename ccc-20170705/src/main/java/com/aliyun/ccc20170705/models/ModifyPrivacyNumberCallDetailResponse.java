// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPrivacyNumberCallDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyPrivacyNumberCallDetailResponse setBody(ModifyPrivacyNumberCallDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrivacyNumberCallDetailResponseBody getBody() {
        return this.body;
    }

}
