// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchEnableSentinelParamDegradeRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchEnableSentinelParamDegradeRulesResponseBody body;

    public static BatchEnableSentinelParamDegradeRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableSentinelParamDegradeRulesResponse self = new BatchEnableSentinelParamDegradeRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchEnableSentinelParamDegradeRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEnableSentinelParamDegradeRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchEnableSentinelParamDegradeRulesResponse setBody(BatchEnableSentinelParamDegradeRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEnableSentinelParamDegradeRulesResponseBody getBody() {
        return this.body;
    }

}
