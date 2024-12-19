// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefreshSettlementOrderAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>709447***856069</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20210125****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>7521****8332932</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static RefreshSettlementOrderAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshSettlementOrderAccountRequest self = new RefreshSettlementOrderAccountRequest();
        return TeaModel.build(map, self);
    }

    public RefreshSettlementOrderAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public RefreshSettlementOrderAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefreshSettlementOrderAccountRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RefreshSettlementOrderAccountRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
