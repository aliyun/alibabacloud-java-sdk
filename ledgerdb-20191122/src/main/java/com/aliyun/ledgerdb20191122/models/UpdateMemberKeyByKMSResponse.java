// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class UpdateMemberKeyByKMSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMemberKeyByKMSResponseBody body;

    public static UpdateMemberKeyByKMSResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberKeyByKMSResponse self = new UpdateMemberKeyByKMSResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemberKeyByKMSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemberKeyByKMSResponse setBody(UpdateMemberKeyByKMSResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemberKeyByKMSResponseBody getBody() {
        return this.body;
    }

}
