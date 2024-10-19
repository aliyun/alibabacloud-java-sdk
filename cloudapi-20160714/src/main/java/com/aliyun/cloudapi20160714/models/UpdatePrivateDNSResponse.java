// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePrivateDNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrivateDNSResponseBody body;

    public static UpdatePrivateDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateDNSResponse self = new UpdatePrivateDNSResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivateDNSResponse setBody(UpdatePrivateDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateDNSResponseBody getBody() {
        return this.body;
    }

}
