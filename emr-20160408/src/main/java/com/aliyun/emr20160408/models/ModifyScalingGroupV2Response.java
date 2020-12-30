// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScalingGroupV2ResponseBody body;

    public static ModifyScalingGroupV2Response build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupV2Response self = new ModifyScalingGroupV2Response();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScalingGroupV2Response setBody(ModifyScalingGroupV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingGroupV2ResponseBody getBody() {
        return this.body;
    }

}
