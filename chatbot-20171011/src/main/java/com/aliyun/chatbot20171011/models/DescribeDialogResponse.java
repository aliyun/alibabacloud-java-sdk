// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeDialogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDialogResponse setBody(DescribeDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDialogResponseBody getBody() {
        return this.body;
    }

}
