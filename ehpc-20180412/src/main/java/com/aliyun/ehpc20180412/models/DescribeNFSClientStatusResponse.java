// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeNFSClientStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNFSClientStatusResponseBody body;

    public static DescribeNFSClientStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNFSClientStatusResponse self = new DescribeNFSClientStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNFSClientStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNFSClientStatusResponse setBody(DescribeNFSClientStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNFSClientStatusResponseBody getBody() {
        return this.body;
    }

}
