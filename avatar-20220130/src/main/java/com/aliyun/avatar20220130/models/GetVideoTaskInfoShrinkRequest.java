// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class GetVideoTaskInfoShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("TaskUuid")
    public String taskUuid;

    @NameInMap("TenantId")
    public Long tenantId;

    public static GetVideoTaskInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTaskInfoShrinkRequest self = new GetVideoTaskInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoTaskInfoShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public GetVideoTaskInfoShrinkRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public GetVideoTaskInfoShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
