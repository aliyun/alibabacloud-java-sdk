// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckProcessingServerLockApplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckProcessingServerLockApplyResponseBody body;

    public static CheckProcessingServerLockApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckProcessingServerLockApplyResponse self = new CheckProcessingServerLockApplyResponse();
        return TeaModel.build(map, self);
    }

    public CheckProcessingServerLockApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckProcessingServerLockApplyResponse setBody(CheckProcessingServerLockApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckProcessingServerLockApplyResponseBody getBody() {
        return this.body;
    }

}
