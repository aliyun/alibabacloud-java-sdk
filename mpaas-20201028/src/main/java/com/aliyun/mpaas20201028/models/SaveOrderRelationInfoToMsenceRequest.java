// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveOrderRelationInfoToMsenceRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizOrderId")
    public String bizOrderId;

    @NameInMap("BizOrderStatus")
    public Integer bizOrderStatus;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("CpExtra")
    public String cpExtra;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("ItemTitle")
    public String itemTitle;

    @NameInMap("MiniProgramId")
    public String miniProgramId;

    @NameInMap("OpenUid")
    public String openUid;

    @NameInMap("PlatformId")
    public String platformId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SaveOrderRelationInfoToMsenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOrderRelationInfoToMsenceRequest self = new SaveOrderRelationInfoToMsenceRequest();
        return TeaModel.build(map, self);
    }

    public SaveOrderRelationInfoToMsenceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public SaveOrderRelationInfoToMsenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveOrderRelationInfoToMsenceRequest setBizOrderId(String bizOrderId) {
        this.bizOrderId = bizOrderId;
        return this;
    }
    public String getBizOrderId() {
        return this.bizOrderId;
    }

    public SaveOrderRelationInfoToMsenceRequest setBizOrderStatus(Integer bizOrderStatus) {
        this.bizOrderStatus = bizOrderStatus;
        return this;
    }
    public Integer getBizOrderStatus() {
        return this.bizOrderStatus;
    }

    public SaveOrderRelationInfoToMsenceRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public SaveOrderRelationInfoToMsenceRequest setCpExtra(String cpExtra) {
        this.cpExtra = cpExtra;
        return this;
    }
    public String getCpExtra() {
        return this.cpExtra;
    }

    public SaveOrderRelationInfoToMsenceRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public SaveOrderRelationInfoToMsenceRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public SaveOrderRelationInfoToMsenceRequest setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }
    public String getItemTitle() {
        return this.itemTitle;
    }

    public SaveOrderRelationInfoToMsenceRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public SaveOrderRelationInfoToMsenceRequest setOpenUid(String openUid) {
        this.openUid = openUid;
        return this;
    }
    public String getOpenUid() {
        return this.openUid;
    }

    public SaveOrderRelationInfoToMsenceRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public SaveOrderRelationInfoToMsenceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveOrderRelationInfoToMsenceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
