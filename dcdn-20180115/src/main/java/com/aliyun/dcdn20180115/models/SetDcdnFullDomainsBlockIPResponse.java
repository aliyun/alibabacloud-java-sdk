// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnFullDomainsBlockIPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDcdnFullDomainsBlockIPResponseBody body;

    public static SetDcdnFullDomainsBlockIPResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnFullDomainsBlockIPResponse self = new SetDcdnFullDomainsBlockIPResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnFullDomainsBlockIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnFullDomainsBlockIPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDcdnFullDomainsBlockIPResponse setBody(SetDcdnFullDomainsBlockIPResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnFullDomainsBlockIPResponseBody getBody() {
        return this.body;
    }

}
