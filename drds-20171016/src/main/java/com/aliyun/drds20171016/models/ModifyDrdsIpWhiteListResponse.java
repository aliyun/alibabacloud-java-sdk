// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyDrdsIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDrdsIpWhiteListResponseBody body;

    public static ModifyDrdsIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsIpWhiteListResponse self = new ModifyDrdsIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDrdsIpWhiteListResponse setBody(ModifyDrdsIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDrdsIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
