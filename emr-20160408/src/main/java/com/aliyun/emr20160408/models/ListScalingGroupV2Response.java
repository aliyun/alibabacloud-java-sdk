// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListScalingGroupV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScalingGroupV2ResponseBody body;

    public static ListScalingGroupV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListScalingGroupV2Response self = new ListScalingGroupV2Response();
        return TeaModel.build(map, self);
    }

    public ListScalingGroupV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScalingGroupV2Response setBody(ListScalingGroupV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScalingGroupV2ResponseBody getBody() {
        return this.body;
    }

}
