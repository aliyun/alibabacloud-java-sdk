// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBizGroup30MResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRequestStatisticCountByEsnBizGroup30MResponseBody body;

    public static DescribeRequestStatisticCountByEsnBizGroup30MResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBizGroup30MResponse self = new DescribeRequestStatisticCountByEsnBizGroup30MResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponse setBody(DescribeRequestStatisticCountByEsnBizGroup30MResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestStatisticCountByEsnBizGroup30MResponseBody getBody() {
        return this.body;
    }

}
