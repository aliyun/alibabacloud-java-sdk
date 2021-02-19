// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingActivitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScalingActivitiesResponseBody body;

    public static DescribeScalingActivitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivitiesResponse self = new DescribeScalingActivitiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScalingActivitiesResponse setBody(DescribeScalingActivitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScalingActivitiesResponseBody getBody() {
        return this.body;
    }

}
