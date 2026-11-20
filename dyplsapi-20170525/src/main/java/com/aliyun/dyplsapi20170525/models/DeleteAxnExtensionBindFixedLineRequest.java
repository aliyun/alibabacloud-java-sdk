// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxnExtensionBindFixedLineRequest extends TeaModel {
    /**
     * <p>The business ID identifier assigned by Alibaba Cloud to the customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alitest</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The unique identifier of the message request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345dkwkd99d</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The binding ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GHX0534X202504221531579290029</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>Format: yyyyMMddHHmmssSSS. The time uses Beijing time in 24-hour format, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250421141723098</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static DeleteAxnExtensionBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxnExtensionBindFixedLineRequest self = new DeleteAxnExtensionBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAxnExtensionBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAxnExtensionBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeleteAxnExtensionBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAxnExtensionBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAxnExtensionBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteAxnExtensionBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public DeleteAxnExtensionBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
