// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreatePayOrderToMsenceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>NPHTGKNR</p>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <strong>example:</strong>
     * <p>test_custom_id</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>123321</p>
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
     * <p>NPHTGKNR</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreatePayOrderToMsenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePayOrderToMsenceShrinkRequest self = new CreatePayOrderToMsenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePayOrderToMsenceShrinkRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreatePayOrderToMsenceShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreatePayOrderToMsenceShrinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatePayOrderToMsenceShrinkRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CreatePayOrderToMsenceShrinkRequest setExtraInfoShrink(String extraInfoShrink) {
        this.extraInfoShrink = extraInfoShrink;
        return this;
    }
    public String getExtraInfoShrink() {
        return this.extraInfoShrink;
    }

    public CreatePayOrderToMsenceShrinkRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public CreatePayOrderToMsenceShrinkRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public CreatePayOrderToMsenceShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePayOrderToMsenceShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
