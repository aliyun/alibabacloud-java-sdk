// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyVSwitchAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeResponse self = new ModifyVSwitchAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
