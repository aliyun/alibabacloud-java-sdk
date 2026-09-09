// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class AddAgendaSumRecordFlowPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAgendaSumRecordFlowPopResponseBody body;

    public static AddAgendaSumRecordFlowPopResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAgendaSumRecordFlowPopResponse self = new AddAgendaSumRecordFlowPopResponse();
        return TeaModel.build(map, self);
    }

    public AddAgendaSumRecordFlowPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAgendaSumRecordFlowPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAgendaSumRecordFlowPopResponse setBody(AddAgendaSumRecordFlowPopResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAgendaSumRecordFlowPopResponseBody getBody() {
        return this.body;
    }

}
