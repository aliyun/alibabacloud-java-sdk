// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class SyncAllEduInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncAllEduInfoResponseBody body;

    public static SyncAllEduInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncAllEduInfoResponse self = new SyncAllEduInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncAllEduInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncAllEduInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncAllEduInfoResponse setBody(SyncAllEduInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncAllEduInfoResponseBody getBody() {
        return this.body;
    }

}
