// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeLhDagOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeLhDagOwnerResponseBody body;

    public static ChangeLhDagOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeLhDagOwnerResponse self = new ChangeLhDagOwnerResponse();
        return TeaModel.build(map, self);
    }

    public ChangeLhDagOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeLhDagOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeLhDagOwnerResponse setBody(ChangeLhDagOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeLhDagOwnerResponseBody getBody() {
        return this.body;
    }

}
