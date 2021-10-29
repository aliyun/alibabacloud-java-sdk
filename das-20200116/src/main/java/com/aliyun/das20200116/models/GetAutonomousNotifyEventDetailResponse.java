// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutonomousNotifyEventDetailResponseBody body;

    public static GetAutonomousNotifyEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventDetailResponse self = new GetAutonomousNotifyEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutonomousNotifyEventDetailResponse setBody(GetAutonomousNotifyEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutonomousNotifyEventDetailResponseBody getBody() {
        return this.body;
    }

}
