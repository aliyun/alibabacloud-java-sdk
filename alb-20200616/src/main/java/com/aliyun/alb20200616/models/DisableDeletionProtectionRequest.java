// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DisableDeletionProtectionRequest extends TeaModel {
    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    //  是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 实例id
    @NameInMap("ResourceId")
    public String resourceId;

    public static DisableDeletionProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDeletionProtectionRequest self = new DisableDeletionProtectionRequest();
        return TeaModel.build(map, self);
    }

    public DisableDeletionProtectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableDeletionProtectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableDeletionProtectionRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
