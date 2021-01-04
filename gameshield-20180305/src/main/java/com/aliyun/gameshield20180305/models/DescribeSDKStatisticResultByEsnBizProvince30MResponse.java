// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizProvince30MResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSDKStatisticResultByEsnBizProvince30MResponseBody body;

    public static DescribeSDKStatisticResultByEsnBizProvince30MResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizProvince30MResponse self = new DescribeSDKStatisticResultByEsnBizProvince30MResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponse setBody(DescribeSDKStatisticResultByEsnBizProvince30MResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDKStatisticResultByEsnBizProvince30MResponseBody getBody() {
        return this.body;
    }

}
