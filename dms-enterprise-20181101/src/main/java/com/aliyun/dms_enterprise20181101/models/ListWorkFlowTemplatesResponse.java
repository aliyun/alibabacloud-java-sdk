// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListWorkFlowTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkFlowTemplatesResponse setBody(ListWorkFlowTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkFlowTemplatesResponseBody getBody() {
        return this.body;
    }

}
