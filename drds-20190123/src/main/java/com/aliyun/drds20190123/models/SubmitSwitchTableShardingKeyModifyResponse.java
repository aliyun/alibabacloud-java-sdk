// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSwitchTableShardingKeyModifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSwitchTableShardingKeyModifyResponseBody body;

    public static SubmitSwitchTableShardingKeyModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSwitchTableShardingKeyModifyResponse self = new SubmitSwitchTableShardingKeyModifyResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSwitchTableShardingKeyModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSwitchTableShardingKeyModifyResponse setBody(SubmitSwitchTableShardingKeyModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSwitchTableShardingKeyModifyResponseBody getBody() {
        return this.body;
    }

}
