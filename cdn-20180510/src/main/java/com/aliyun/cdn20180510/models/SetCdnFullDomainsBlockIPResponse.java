// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnFullDomainsBlockIPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCdnFullDomainsBlockIPResponseBody body;

    public static SetCdnFullDomainsBlockIPResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCdnFullDomainsBlockIPResponse self = new SetCdnFullDomainsBlockIPResponse();
        return TeaModel.build(map, self);
    }

    public SetCdnFullDomainsBlockIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCdnFullDomainsBlockIPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCdnFullDomainsBlockIPResponse setBody(SetCdnFullDomainsBlockIPResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCdnFullDomainsBlockIPResponseBody getBody() {
        return this.body;
    }

}
