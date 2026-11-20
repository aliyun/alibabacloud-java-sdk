// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubs700Request extends TeaModel {
    /**
     * <p>Optional. The Industrial Internet identification code, which has a one-to-one mapping with the OrderID. The code supports characters such as periods (.) and forward slashes (/) to separate code domains. The code must not contain non-printable characters, such as spaces or line feeds. This field is required when the service consumer generates the Industrial Internet identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>700.100.1/12345678</p>
     */
    @NameInMap("IndustrialId")
    public String industrialId;

    /**
     * <p>The order ID. This parameter is required in practice. Encrypt the order ID for reporting to the regulatory platform.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number pool key.</p>
     * <p>To obtain the <strong>number pool key</strong>, go to the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number pool management</a> page in the Phone Number Privacy Protection console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000016848****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number binding ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000****</p>
     */
    @NameInMap("SubsId")
    public Long subsId;

    /**
     * <p>The intermediate number X. If the service consumer does not specify number X, the application platform assigns a number from the number pool as number X.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>700********0000</p>
     */
    @NameInMap("TelX")
    public String telX;

    public static UnbindSubs700Request build(java.util.Map<String, ?> map) throws Exception {
        UnbindSubs700Request self = new UnbindSubs700Request();
        return TeaModel.build(map, self);
    }

    public UnbindSubs700Request setIndustrialId(String industrialId) {
        this.industrialId = industrialId;
        return this;
    }
    public String getIndustrialId() {
        return this.industrialId;
    }

    public UnbindSubs700Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UnbindSubs700Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindSubs700Request setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public UnbindSubs700Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindSubs700Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindSubs700Request setSubsId(Long subsId) {
        this.subsId = subsId;
        return this;
    }
    public Long getSubsId() {
        return this.subsId;
    }

    public UnbindSubs700Request setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

}
