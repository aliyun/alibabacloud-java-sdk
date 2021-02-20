// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ModifyOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOrganizationResponseBody body;

    public static ModifyOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrganizationResponse self = new ModifyOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOrganizationResponse setBody(ModifyOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOrganizationResponseBody getBody() {
        return this.body;
    }

}
