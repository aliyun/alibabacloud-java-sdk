// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubscriptionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>ProductType</strong> is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FC123456</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The product type. Fixed value: <strong>AXB_170</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
     * </li>
     * <li><p>This parameter is required when <strong>PoolKey</strong> is left empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AXB_170</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The private number, that is, phone number X specified in an API operation for a phone number binding such as <a href="https://help.aliyun.com/document_detail/110249.html">BindAXG</a> or automatically assigned after such an operation is called.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("SecretNo")
    public String secretNo;

    /**
     * <p>The binding ID.</p>
     * <p>Log on to the Phone Number Protection console, choose <strong>Number and Number Pool</strong> &gt; <strong>Number Management</strong>. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the <strong>SubsId</strong> parameter returned by an API operation for a phone number binding such as BindAxb. The value of this parameter indicates a binding ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1************2</p>
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
