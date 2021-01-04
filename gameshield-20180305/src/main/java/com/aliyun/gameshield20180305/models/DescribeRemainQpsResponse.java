// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRemainQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRemainQpsResponseBody body;

    public static DescribeRemainQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRemainQpsResponse self = new DescribeRemainQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRemainQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRemainQpsResponse setBody(DescribeRemainQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRemainQpsResponseBody getBody() {
        return this.body;
    }

}
