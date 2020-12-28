// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyLaunchTemplateDefaultVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLaunchTemplateDefaultVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLaunchTemplateDefaultVersionResponseBody self = new ModifyLaunchTemplateDefaultVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLaunchTemplateDefaultVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
