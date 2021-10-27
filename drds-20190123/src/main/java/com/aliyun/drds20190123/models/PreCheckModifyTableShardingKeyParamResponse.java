// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PreCheckModifyTableShardingKeyParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreCheckModifyTableShardingKeyParamResponseBody body;

    public static PreCheckModifyTableShardingKeyParamResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckModifyTableShardingKeyParamResponse self = new PreCheckModifyTableShardingKeyParamResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckModifyTableShardingKeyParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCheckModifyTableShardingKeyParamResponse setBody(PreCheckModifyTableShardingKeyParamResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCheckModifyTableShardingKeyParamResponseBody getBody() {
        return this.body;
    }

}
