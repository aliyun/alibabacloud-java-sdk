// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxnBindFixedLineRequest extends TeaModel {
    /**
     * <p>The number pool ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000016848****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The unique identifier of the message request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123*******</p>
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
     * <p>A93I******</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>The business timestamp. Format: yyyyMMddHHmmssSSS. The time is in UTC+8, in 24-hour format, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static DeleteAxnBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxnBindFixedLineRequest self = new DeleteAxnBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAxnBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAxnBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeleteAxnBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAxnBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAxnBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteAxnBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public DeleteAxnBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
