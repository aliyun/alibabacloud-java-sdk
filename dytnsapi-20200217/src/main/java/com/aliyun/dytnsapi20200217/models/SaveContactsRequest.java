// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class SaveContactsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dytns</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:1234@alibaba-inc.com">1234@alibaba-inc.com</a></p>
     */
    @NameInMap("ContactEmail")
    public String contactEmail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <strong>example:</strong>
     * <p>122354532434</p>
     */
    @NameInMap("ContactPhone")
    public String contactPhone;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MailStatus")
    public Integer mailStatus;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OpenStatusWarning")
    public Boolean openStatusWarning;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OpentAttributionWarning")
    public Boolean opentAttributionWarning;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PhoneStatus")
    public Integer phoneStatus;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SaveContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContactsRequest self = new SaveContactsRequest();
        return TeaModel.build(map, self);
    }

    public SaveContactsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SaveContactsRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public SaveContactsRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SaveContactsRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public SaveContactsRequest setMailStatus(Integer mailStatus) {
        this.mailStatus = mailStatus;
        return this;
    }
    public Integer getMailStatus() {
        return this.mailStatus;
    }

    public SaveContactsRequest setOpenStatusWarning(Boolean openStatusWarning) {
        this.openStatusWarning = openStatusWarning;
        return this;
    }
    public Boolean getOpenStatusWarning() {
        return this.openStatusWarning;
    }

    public SaveContactsRequest setOpentAttributionWarning(Boolean opentAttributionWarning) {
        this.opentAttributionWarning = opentAttributionWarning;
        return this;
    }
    public Boolean getOpentAttributionWarning() {
        return this.opentAttributionWarning;
    }

    public SaveContactsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SaveContactsRequest setPhoneStatus(Integer phoneStatus) {
        this.phoneStatus = phoneStatus;
        return this;
    }
    public Integer getPhoneStatus() {
        return this.phoneStatus;
    }

    public SaveContactsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SaveContactsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
