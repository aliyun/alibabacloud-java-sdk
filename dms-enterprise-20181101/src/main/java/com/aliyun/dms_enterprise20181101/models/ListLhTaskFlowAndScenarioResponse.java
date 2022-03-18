// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLhTaskFlowAndScenarioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLhTaskFlowAndScenarioResponseBody body;

    public static ListLhTaskFlowAndScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLhTaskFlowAndScenarioResponse self = new ListLhTaskFlowAndScenarioResponse();
        return TeaModel.build(map, self);
    }

    public ListLhTaskFlowAndScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLhTaskFlowAndScenarioResponse setBody(ListLhTaskFlowAndScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLhTaskFlowAndScenarioResponseBody getBody() {
        return this.body;
    }

}
