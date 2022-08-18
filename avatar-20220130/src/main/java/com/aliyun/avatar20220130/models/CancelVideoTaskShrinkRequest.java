// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class CancelVideoTaskShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("TaskUuid")
    public String taskUuid;

    @NameInMap("TenantId")
    public Long tenantId;

    public static CancelVideoTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelVideoTaskShrinkRequest self = new CancelVideoTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelVideoTaskShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public CancelVideoTaskShrinkRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public CancelVideoTaskShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
