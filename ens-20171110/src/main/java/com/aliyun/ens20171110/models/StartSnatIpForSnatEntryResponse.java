// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartSnatIpForSnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSnatIpForSnatEntryResponseBody body;

    public static StartSnatIpForSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSnatIpForSnatEntryResponse self = new StartSnatIpForSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public StartSnatIpForSnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSnatIpForSnatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSnatIpForSnatEntryResponse setBody(StartSnatIpForSnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

}
