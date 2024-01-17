// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetPurchasedApiGroupStatusRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("BillingStatus")
    public String billingStatus;

    @NameInMap("CloseOrder")
    public Boolean closeOrder;

    @NameInMap("GroupId")
    public String groupId;

    public static SetPurchasedApiGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPurchasedApiGroupStatusRequest self = new SetPurchasedApiGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetPurchasedApiGroupStatusRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public SetPurchasedApiGroupStatusRequest setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }
    public String getBillingStatus() {
        return this.billingStatus;
    }

    public SetPurchasedApiGroupStatusRequest setCloseOrder(Boolean closeOrder) {
        this.closeOrder = closeOrder;
        return this;
    }
    public Boolean getCloseOrder() {
        return this.closeOrder;
    }

    public SetPurchasedApiGroupStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
