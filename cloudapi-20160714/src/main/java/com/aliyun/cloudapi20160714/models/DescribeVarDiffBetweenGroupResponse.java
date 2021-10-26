// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVarDiffBetweenGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVarDiffBetweenGroupResponseBody body;

    public static DescribeVarDiffBetweenGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVarDiffBetweenGroupResponse self = new DescribeVarDiffBetweenGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVarDiffBetweenGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVarDiffBetweenGroupResponse setBody(DescribeVarDiffBetweenGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVarDiffBetweenGroupResponseBody getBody() {
        return this.body;
    }

}
