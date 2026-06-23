// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreatePayOrderToMsenceRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthToken")
    public String authToken;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    @NameInMap("MiniProgramId")
    public String miniProgramId;

    @NameInMap("PlatformId")
    public String platformId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreatePayOrderToMsenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePayOrderToMsenceRequest self = new CreatePayOrderToMsenceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePayOrderToMsenceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreatePayOrderToMsenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreatePayOrderToMsenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatePayOrderToMsenceRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CreatePayOrderToMsenceRequest setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public CreatePayOrderToMsenceRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public CreatePayOrderToMsenceRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public CreatePayOrderToMsenceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePayOrderToMsenceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
