// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreatePayOrderToMsenceShrinkRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthToken")
    public String authToken;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("ExtraInfo")
    public String extraInfoShrink;

    @NameInMap("MiniProgramId")
    public String miniProgramId;

    @NameInMap("PlatformId")
    public String platformId;

    @NameInMap("TenantId")
    public String tenantId;

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
