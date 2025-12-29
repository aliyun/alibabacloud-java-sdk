// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UpdateContactsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:XXXX@alibaba-inc.com">XXXX@alibaba-inc.com</a></p>
     */
    @NameInMap("ContactEmail")
    public String contactEmail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1194432</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <strong>example:</strong>
     * <p>192XXXXXXXX</p>
     */
    @NameInMap("ContactPhone")
    public String contactPhone;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>1</p>
     */
    @NameInMap("PhoneStatus")
    public Integer phoneStatus;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactsRequest self = new UpdateContactsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContactsRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public UpdateContactsRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public UpdateContactsRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public UpdateContactsRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public UpdateContactsRequest setMailStatus(Integer mailStatus) {
        this.mailStatus = mailStatus;
        return this;
    }
    public Integer getMailStatus() {
        return this.mailStatus;
    }

    public UpdateContactsRequest setOpenStatusWarning(Boolean openStatusWarning) {
        this.openStatusWarning = openStatusWarning;
        return this;
    }
    public Boolean getOpenStatusWarning() {
        return this.openStatusWarning;
    }

    public UpdateContactsRequest setOpentAttributionWarning(Boolean opentAttributionWarning) {
        this.opentAttributionWarning = opentAttributionWarning;
        return this;
    }
    public Boolean getOpentAttributionWarning() {
        return this.opentAttributionWarning;
    }

    public UpdateContactsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateContactsRequest setPhoneStatus(Integer phoneStatus) {
        this.phoneStatus = phoneStatus;
        return this;
    }
    public Integer getPhoneStatus() {
        return this.phoneStatus;
    }

    public UpdateContactsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateContactsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
