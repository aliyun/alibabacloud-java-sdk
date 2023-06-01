// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSnatIpForSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSnatIpForSnatEntryResponseBody body;

    public static DeleteSnatIpForSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatIpForSnatEntryResponse self = new DeleteSnatIpForSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnatIpForSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnatIpForSnatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSnatIpForSnatEntryResponse setBody(DeleteSnatIpForSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

}
