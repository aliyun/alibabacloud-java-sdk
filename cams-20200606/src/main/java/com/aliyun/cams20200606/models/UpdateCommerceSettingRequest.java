// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateCommerceSettingRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the shopping cart. Valid values:</p>
     * <ul>
     * <li><p>true: Enable the shopping cart.</p>
     * </li>
     * <li><p>false: Disable the shopping cart.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CartEnable")
    public Boolean cartEnable;

    /**
     * <p>Specifies whether to enable the product catalog. Valid values:</p>
     * <ul>
     * <li><p>true: Enable the product catalog.</p>
     * </li>
     * <li><p>false: Disable the product catalog.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CatalogVisible")
    public Boolean catalogVisible;

    /**
     * <p>The Space ID of the Independent Software Vendor (ISV) sub-customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29348393884****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1380000****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateCommerceSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommerceSettingRequest self = new UpdateCommerceSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommerceSettingRequest setCartEnable(Boolean cartEnable) {
        this.cartEnable = cartEnable;
        return this;
    }
    public Boolean getCartEnable() {
        return this.cartEnable;
    }

    public UpdateCommerceSettingRequest setCatalogVisible(Boolean catalogVisible) {
        this.catalogVisible = catalogVisible;
        return this;
    }
    public Boolean getCatalogVisible() {
        return this.catalogVisible;
    }

    public UpdateCommerceSettingRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateCommerceSettingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCommerceSettingRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateCommerceSettingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateCommerceSettingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
