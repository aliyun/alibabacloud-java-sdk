// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateCommerceSettingRequest extends TeaModel {
    /**
     * <p>Specifies whether to display the shopping cart button.</p>
     */
    @NameInMap("CartEnable")
    public Boolean cartEnable;

    /**
     * <p>Specifies whether to display the catalog button.</p>
     */
    @NameInMap("CatalogVisible")
    public Boolean catalogVisible;

    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

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

    public UpdateCommerceSettingRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
