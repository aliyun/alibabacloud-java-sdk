// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ChangeMcubeMiniTaskStatusRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("BizType")
    @Validation(required = true)
    public String bizType;

    @NameInMap("PackageId")
    @Validation(required = true)
    public Long packageId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    @NameInMap("TaskStatus")
    @Validation(required = true)
    public Long taskStatus;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static ChangeMcubeMiniTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeMiniTaskStatusRequest self = new ChangeMcubeMiniTaskStatusRequest();
        return TeaModel.build(map, self);
    }

}
