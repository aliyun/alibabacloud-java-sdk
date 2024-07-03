// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private number in the binding, that is, phone number X.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13900001234</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

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
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>AXB_170</strong></li>
     * <li><strong>AXN_170</strong></li>
     * <li><strong>AXN_95</strong></li>
     * <li><strong>AXN_EXTENSION_REUSE</strong></li>
     * </ul>
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
     * <p>The binding ID.</p>
     * <p>Log on to the Phone Number Protection console, choose <strong>Number and Number Pool</strong> &gt; <strong>Number Management</strong>. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the <strong>SubsId</strong> parameter returned by an API operation for a phone number binding such as <a href="https://help.aliyun.com/document_detail/110248.html">BindAxb</a>. The value of this parameter indicates a binding ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000076879****</p>
     */
    @NameInMap("SubsId")
    public String subsId;

    public static QuerySubscriptionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscriptionDetailRequest self = new QuerySubscriptionDetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySubscriptionDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySubscriptionDetailRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public QuerySubscriptionDetailRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public QuerySubscriptionDetailRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QuerySubscriptionDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySubscriptionDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySubscriptionDetailRequest setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

}
