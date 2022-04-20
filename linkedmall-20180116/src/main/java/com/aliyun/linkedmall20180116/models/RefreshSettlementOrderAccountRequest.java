// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefreshSettlementOrderAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public String extInfo;

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
