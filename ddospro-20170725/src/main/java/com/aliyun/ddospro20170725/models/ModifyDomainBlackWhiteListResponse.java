// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDomainBlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDomainBlackWhiteListResponseBody body;

    public static ModifyDomainBlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainBlackWhiteListResponse self = new ModifyDomainBlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainBlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainBlackWhiteListResponse setBody(ModifyDomainBlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainBlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
