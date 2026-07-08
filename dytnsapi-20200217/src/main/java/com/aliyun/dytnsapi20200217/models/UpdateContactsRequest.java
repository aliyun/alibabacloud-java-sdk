// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UpdateContactsRequest extends TeaModel {
    /**
     * <p>The email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:XXXX@alibaba-inc.com">XXXX@alibaba-inc.com</a></p>
     */
    @NameInMap("ContactEmail")
    public String contactEmail;

    /**
     * <p>The ID of the contact to update. You can retrieve the ID by calling the ListContacts operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1194432</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The name of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The mobile phone number of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>192XXXXXXXX</p>
     */
    @NameInMap("ContactPhone")
    public String contactPhone;

    /**
     * <p>Enables or disables email alerts. Valid values:</p>
     * <ul>
     * <li><p>0: disabled.</p>
     * </li>
     * <li><p>1: enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MailStatus")
    public Integer mailStatus;

    /**
     * <p>Enables or disables alerts for number status.
     * Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OpenStatusWarning")
    public Boolean openStatusWarning;

    /**
     * <p>Enables or disables alerts for number attribution queries. Valid values: -<strong>true</strong>: enabled. -<strong>false</strong>: disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OpentAttributionWarning")
    public Boolean opentAttributionWarning;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Enables or disables phone call alerts. Valid values:</p>
     * <ul>
     * <li><p>0: disabled.</p>
     * </li>
     * <li><p>1: enabled.</p>
     * </li>
     * </ul>
     * 
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
