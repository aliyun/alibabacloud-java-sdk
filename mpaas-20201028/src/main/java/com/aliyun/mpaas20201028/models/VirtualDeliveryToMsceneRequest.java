// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class VirtualDeliveryToMsceneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>test_custom_id</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <strong>example:</strong>
     * <p>1000001221323232</p>
     */
    @NameInMap("MiniProgramId")
    public String miniProgramId;

    /**
     * <strong>example:</strong>
     * <p>mPaaS_Goosefish</p>
     */
    @NameInMap("PlatformId")
    public String platformId;

    /**
     * <strong>example:</strong>
     * <p>IDUKCGEB</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static VirtualDeliveryToMsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        VirtualDeliveryToMsceneRequest self = new VirtualDeliveryToMsceneRequest();
        return TeaModel.build(map, self);
    }

    public VirtualDeliveryToMsceneRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public VirtualDeliveryToMsceneRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public VirtualDeliveryToMsceneRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public VirtualDeliveryToMsceneRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public VirtualDeliveryToMsceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public VirtualDeliveryToMsceneRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
