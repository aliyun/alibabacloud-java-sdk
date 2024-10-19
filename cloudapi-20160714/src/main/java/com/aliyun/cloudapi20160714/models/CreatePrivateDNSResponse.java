// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePrivateDNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrivateDNSResponseBody body;

    public static CreatePrivateDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateDNSResponse self = new CreatePrivateDNSResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivateDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrivateDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrivateDNSResponse setBody(CreatePrivateDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrivateDNSResponseBody getBody() {
        return this.body;
    }

}
