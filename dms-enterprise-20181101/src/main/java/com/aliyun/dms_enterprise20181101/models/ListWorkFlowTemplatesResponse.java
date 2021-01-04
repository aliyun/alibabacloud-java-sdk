// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkFlowTemplatesResponseBody body;

    public static ListWorkFlowTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowTemplatesResponse self = new ListWorkFlowTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkFlowTemplatesResponse setBody(ListWorkFlowTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkFlowTemplatesResponseBody getBody() {
        return this.body;
    }

}
