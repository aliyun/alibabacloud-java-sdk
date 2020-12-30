// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowJobResponseBody body;

    public static ListFlowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobResponse self = new ListFlowJobResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowJobResponse setBody(ListFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowJobResponseBody getBody() {
        return this.body;
    }

}
