// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TransferCallToSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferCallToSkillGroupResponseBody body;

    public static TransferCallToSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferCallToSkillGroupResponse self = new TransferCallToSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public TransferCallToSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferCallToSkillGroupResponse setBody(TransferCallToSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferCallToSkillGroupResponseBody getBody() {
        return this.body;
    }

}
