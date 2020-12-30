// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigItemV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingConfigItemV2ResponseBody body;

    public static DescribeScalingConfigItemV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigItemV2Response self = new DescribeScalingConfigItemV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigItemV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingConfigItemV2Response setBody(DescribeScalingConfigItemV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingConfigItemV2ResponseBody getBody() {
        return this.body;
    }

}
