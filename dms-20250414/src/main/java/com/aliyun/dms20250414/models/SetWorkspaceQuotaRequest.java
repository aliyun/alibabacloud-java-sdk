// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SetWorkspaceQuotaRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-payment for the order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>A unique, client-generated token to ensure request idempotence. The token can contain only ASCII characters and must be no longer than 64 characters. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>acdxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The compute unit (CU) quota for the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CuQuota")
    public Integer cuQuota;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the Data Management Service (DMS) workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20923*****7291</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SetWorkspaceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWorkspaceQuotaRequest self = new SetWorkspaceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetWorkspaceQuotaRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public SetWorkspaceQuotaRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetWorkspaceQuotaRequest setCuQuota(Integer cuQuota) {
        this.cuQuota = cuQuota;
        return this;
    }
    public Integer getCuQuota() {
        return this.cuQuota;
    }

    public SetWorkspaceQuotaRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SetWorkspaceQuotaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
