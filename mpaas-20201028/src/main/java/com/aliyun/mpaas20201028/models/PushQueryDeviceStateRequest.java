// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushQueryDeviceStateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <strong>example:</strong>
     * <p>PLDIAUZO</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushQueryDeviceStateRequest build(java.util.Map<String, ?> map) throws Exception {
        PushQueryDeviceStateRequest self = new PushQueryDeviceStateRequest();
        return TeaModel.build(map, self);
    }

    public PushQueryDeviceStateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushQueryDeviceStateRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public PushQueryDeviceStateRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public PushQueryDeviceStateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PushQueryDeviceStateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
