// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizISPIntervalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody body;

    public static DescribeSDKStatisticResultByEsnBizISPIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizISPIntervalResponse self = new DescribeSDKStatisticResultByEsnBizISPIntervalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponse setBody(DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody getBody() {
        return this.body;
    }

}
