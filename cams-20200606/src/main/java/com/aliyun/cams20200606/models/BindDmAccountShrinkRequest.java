// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BindDmAccountShrinkRequest extends TeaModel {
    /**
     * <p>The account code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("AccountCode")
    public String accountCode;

    /**
     * <p>The SpaceId of the ISV sub-customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The extended attributes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExtendAttr")
    public String extendAttrShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BindDmAccountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDmAccountShrinkRequest self = new BindDmAccountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindDmAccountShrinkRequest setAccountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }
    public String getAccountCode() {
        return this.accountCode;
    }

    public BindDmAccountShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public BindDmAccountShrinkRequest setExtendAttrShrink(String extendAttrShrink) {
        this.extendAttrShrink = extendAttrShrink;
        return this;
    }
    public String getExtendAttrShrink() {
        return this.extendAttrShrink;
    }

    public BindDmAccountShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindDmAccountShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindDmAccountShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
