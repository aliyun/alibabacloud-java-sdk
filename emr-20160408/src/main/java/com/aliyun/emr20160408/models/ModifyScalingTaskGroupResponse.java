// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScalingTaskGroupResponseBody body;

    public static ModifyScalingTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingTaskGroupResponse self = new ModifyScalingTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScalingTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScalingTaskGroupResponse setBody(ModifyScalingTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingTaskGroupResponseBody getBody() {
        return this.body;
    }

}
