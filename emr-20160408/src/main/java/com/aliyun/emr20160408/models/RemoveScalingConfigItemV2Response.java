// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RemoveScalingConfigItemV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveScalingConfigItemV2ResponseBody body;

    public static RemoveScalingConfigItemV2Response build(java.util.Map<String, ?> map) throws Exception {
        RemoveScalingConfigItemV2Response self = new RemoveScalingConfigItemV2Response();
        return TeaModel.build(map, self);
    }

    public RemoveScalingConfigItemV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveScalingConfigItemV2Response setBody(RemoveScalingConfigItemV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveScalingConfigItemV2ResponseBody getBody() {
        return this.body;
    }

}
