// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLDAPConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLDAPConfigResponseBody body;

    public static DescribeLDAPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLDAPConfigResponse self = new DescribeLDAPConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLDAPConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLDAPConfigResponse setBody(DescribeLDAPConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLDAPConfigResponseBody getBody() {
        return this.body;
    }

}
