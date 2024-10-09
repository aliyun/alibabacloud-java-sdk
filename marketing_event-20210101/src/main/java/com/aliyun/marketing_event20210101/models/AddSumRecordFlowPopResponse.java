// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class AddSumRecordFlowPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSumRecordFlowPopResponseBody body;

    public static AddSumRecordFlowPopResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSumRecordFlowPopResponse self = new AddSumRecordFlowPopResponse();
        return TeaModel.build(map, self);
    }

    public AddSumRecordFlowPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSumRecordFlowPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSumRecordFlowPopResponse setBody(AddSumRecordFlowPopResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSumRecordFlowPopResponseBody getBody() {
        return this.body;
    }

}
