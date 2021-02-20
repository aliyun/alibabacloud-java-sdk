// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDefenseRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDefenseRecordsResponseBody body;

    public static DescribeDefenseRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRecordsResponse self = new DescribeDefenseRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseRecordsResponse setBody(DescribeDefenseRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseRecordsResponseBody getBody() {
        return this.body;
    }

}
