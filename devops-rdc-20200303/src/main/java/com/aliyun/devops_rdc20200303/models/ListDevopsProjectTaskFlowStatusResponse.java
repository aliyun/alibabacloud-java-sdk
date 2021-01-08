// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTaskFlowStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevopsProjectTaskFlowStatusResponseBody body;

    public static ListDevopsProjectTaskFlowStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTaskFlowStatusResponse self = new ListDevopsProjectTaskFlowStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTaskFlowStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevopsProjectTaskFlowStatusResponse setBody(ListDevopsProjectTaskFlowStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevopsProjectTaskFlowStatusResponseBody getBody() {
        return this.body;
    }

}
