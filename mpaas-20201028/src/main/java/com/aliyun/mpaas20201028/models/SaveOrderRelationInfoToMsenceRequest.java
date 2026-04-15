// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveOrderRelationInfoToMsenceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
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
     * <p>3929520</p>
     */
    @NameInMap("BizOrderId")
    public String bizOrderId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BizOrderStatus")
    public Integer bizOrderStatus;

    /**
     * <strong>example:</strong>
     * <p>test_custom_id</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <strong>example:</strong>
     * <p>123321</p>
     */
    @NameInMap("MiniProgramId")
    public String miniProgramId;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OpenUid")
    public String openUid;

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

    public SaveOrderRelationInfoToMsenceRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
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
