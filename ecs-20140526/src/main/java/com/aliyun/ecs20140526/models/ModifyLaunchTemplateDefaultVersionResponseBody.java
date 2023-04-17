// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyLaunchTemplateDefaultVersionResponseBody extends TeaModel {
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLaunchTemplateDefaultVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLaunchTemplateDefaultVersionResponseBody self = new ModifyLaunchTemplateDefaultVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLaunchTemplateDefaultVersionResponseBody setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public ModifyLaunchTemplateDefaultVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
