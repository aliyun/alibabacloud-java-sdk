// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeRecordDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecordDataResponseBody body;

    public static DescribeRecordDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordDataResponse self = new DescribeRecordDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordDataResponse setBody(DescribeRecordDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordDataResponseBody getBody() {
        return this.body;
    }

}
