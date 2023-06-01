// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopSnatIpForSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopSnatIpForSnatEntryResponseBody body;

    public static StopSnatIpForSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSnatIpForSnatEntryResponse self = new StopSnatIpForSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public StopSnatIpForSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSnatIpForSnatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSnatIpForSnatEntryResponse setBody(StopSnatIpForSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

}
