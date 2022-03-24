// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeLhDagOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ChangeLhDagOwnerResponse setBody(ChangeLhDagOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeLhDagOwnerResponseBody getBody() {
        return this.body;
    }

}
