// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddContactsShrinkRequest extends TeaModel {
    /**
     * <p>The business code.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. Default value: an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>The description of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>15111111111</p>
     */
    @NameInMap("ContactDetails")
    public String contactDetails;

    /**
     * <p>The name of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>mary</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The country.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The email address.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The user group information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Groups")
    public String groups;

    /**
     * <p>Indicates whether the back-to-origin IP address whitelist needs to be updated. This parameter returns true when the current back-to-origin IP address whitelist differs from the latest back-to-origin IP address whitelist.</p>
     * <ul>
     * <li>true: The whitelist needs to be updated.</li>
     * <li>false: The whitelist does not need to be updated.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedUpdate")
    public Boolean needUpdate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddContactsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContactsShrinkRequest self = new AddContactsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddContactsShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public AddContactsShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public AddContactsShrinkRequest setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }
    public String getContactDetails() {
        return this.contactDetails;
    }

    public AddContactsShrinkRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public AddContactsShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public AddContactsShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddContactsShrinkRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public AddContactsShrinkRequest setGroups(String groups) {
        this.groups = groups;
        return this;
    }
    public String getGroups() {
        return this.groups;
    }

    public AddContactsShrinkRequest setNeedUpdate(Boolean needUpdate) {
        this.needUpdate = needUpdate;
        return this;
    }
    public Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public AddContactsShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddContactsShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddContactsShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddContactsShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
