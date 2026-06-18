// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBranchResponseBody body;

    public static DescribeBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBranchResponse self = new DescribeBranchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBranchResponse setBody(DescribeBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBranchResponseBody getBody() {
        return this.body;
    }

}
