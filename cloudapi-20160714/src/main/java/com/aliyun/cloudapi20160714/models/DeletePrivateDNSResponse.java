// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeletePrivateDNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivateDNSResponseBody body;

    public static DeletePrivateDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateDNSResponse self = new DeletePrivateDNSResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateDNSResponse setBody(DeletePrivateDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateDNSResponseBody getBody() {
        return this.body;
    }

}
