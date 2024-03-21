// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeDialogFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDialogFlowResponseBody body;

    public static DescribeDialogFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogFlowResponse self = new DescribeDialogFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDialogFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDialogFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDialogFlowResponse setBody(DescribeDialogFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDialogFlowResponseBody getBody() {
        return this.body;
    }

}
