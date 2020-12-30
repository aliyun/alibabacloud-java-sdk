// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunScalingActionV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunScalingActionV2ResponseBody body;

    public static RunScalingActionV2Response build(java.util.Map<String, ?> map) throws Exception {
        RunScalingActionV2Response self = new RunScalingActionV2Response();
        return TeaModel.build(map, self);
    }

    public RunScalingActionV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunScalingActionV2Response setBody(RunScalingActionV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public RunScalingActionV2ResponseBody getBody() {
        return this.body;
    }

}
