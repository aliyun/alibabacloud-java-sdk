// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetHotlineQualificationByOrderRequest extends TeaModel {
    /**
     * <p>The ticket ID.</p>
     * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Qualification\&amp;Communication Script Management</strong> &gt; <strong>Qualification Management</strong>, and then click the <strong>400 Qualifications</strong> tab to view the ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22456****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetHotlineQualificationByOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineQualificationByOrderRequest self = new GetHotlineQualificationByOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineQualificationByOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetHotlineQualificationByOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetHotlineQualificationByOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetHotlineQualificationByOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
