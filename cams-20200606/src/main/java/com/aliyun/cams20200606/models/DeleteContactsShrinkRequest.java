// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteContactsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <strong>example:</strong>
     * <p>1507486****</p>
     */
    @NameInMap("ContactDetails")
    public String contactDetails;

    /**
     * <strong>example:</strong>
     * <p>hahaha</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <strong>example:</strong>
     * <p>http://****</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteContactsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactsShrinkRequest self = new DeleteContactsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactsShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public DeleteContactsShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public DeleteContactsShrinkRequest setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }
    public String getContactDetails() {
        return this.contactDetails;
    }

    public DeleteContactsShrinkRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public DeleteContactsShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DeleteContactsShrinkRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public DeleteContactsShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteContactsShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteContactsShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
