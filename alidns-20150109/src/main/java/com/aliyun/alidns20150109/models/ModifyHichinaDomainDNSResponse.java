// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ModifyHichinaDomainDNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyHichinaDomainDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHichinaDomainDNSResponse setBody(ModifyHichinaDomainDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHichinaDomainDNSResponseBody getBody() {
        return this.body;
    }

}
