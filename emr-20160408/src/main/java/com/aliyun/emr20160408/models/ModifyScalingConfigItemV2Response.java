// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigItemV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScalingConfigItemV2ResponseBody body;

    public static ModifyScalingConfigItemV2Response build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigItemV2Response self = new ModifyScalingConfigItemV2Response();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigItemV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScalingConfigItemV2Response setBody(ModifyScalingConfigItemV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingConfigItemV2ResponseBody getBody() {
        return this.body;
    }

}
