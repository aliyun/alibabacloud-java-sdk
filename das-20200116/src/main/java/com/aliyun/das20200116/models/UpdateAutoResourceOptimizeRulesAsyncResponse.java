// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeRulesAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoResourceOptimizeRulesAsyncResponseBody body;

    public static UpdateAutoResourceOptimizeRulesAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoResourceOptimizeRulesAsyncResponse self = new UpdateAutoResourceOptimizeRulesAsyncResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponse setBody(UpdateAutoResourceOptimizeRulesAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoResourceOptimizeRulesAsyncResponseBody getBody() {
        return this.body;
    }

}
