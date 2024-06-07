// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubscriptionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>>  This parameter is required when **ProductType** is left empty.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The product type. Fixed value: **AXB_170**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
     * <br>
     * <p>*   This parameter is required when **PoolKey** is left empty.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The private number, that is, phone number X specified in an API operation for a phone number binding such as [BindAXG](https://help.aliyun.com/document_detail/110249.html) or automatically assigned after such an operation is called.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretNo")
    public String secretNo;

    /**
     * <p>The binding ID.</p>
     * <br>
     * <p>Log on to the Phone Number Protection console, choose **Number and Number Pool** > **Number Management**. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the **SubsId** parameter returned by an API operation for a phone number binding such as BindAxb. The value of this parameter indicates a binding ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubsId")
    public String subsId;

    public static UnbindSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSubscriptionRequest self = new UnbindSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSubscriptionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindSubscriptionRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public UnbindSubscriptionRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UnbindSubscriptionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindSubscriptionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindSubscriptionRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

    public UnbindSubscriptionRequest setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

}
