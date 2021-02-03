// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ModifyHichinaDomainDNSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHichinaDomainDNSResponseBody body;

    public static ModifyHichinaDomainDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHichinaDomainDNSResponse self = new ModifyHichinaDomainDNSResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHichinaDomainDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHichinaDomainDNSResponse setBody(ModifyHichinaDomainDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHichinaDomainDNSResponseBody getBody() {
        return this.body;
    }

}
