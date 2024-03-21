// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDialogResponseBody body;

    public static DescribeDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogResponse self = new DescribeDialogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDialogResponse setBody(DescribeDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDialogResponseBody getBody() {
        return this.body;
    }

}
