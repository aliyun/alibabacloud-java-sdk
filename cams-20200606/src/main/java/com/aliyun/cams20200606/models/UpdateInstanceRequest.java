// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:123@alibaba.com">123@alibaba.com</a></p>
     */
    @NameInMap("ContactMail")
    public String contactMail;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <p>fb bmId</p>
     * 
     * <strong>example:</strong>
     * <p>3939982828</p>
     */
    @NameInMap("FacebookBmId")
    public String facebookBmId;

    /**
     * <strong>example:</strong>
     * <p>ins</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>82838838****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>viber_ins</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsConfirmAudit")
    public String isConfirmAudit;

    /**
     * <strong>example:</strong>
     * <p><a href="https://aa.com/a.pdf">https://aa.com/a.pdf</a></p>
     */
    @NameInMap("IsvTerms")
    public String isvTerms;

    /**
     * <strong>example:</strong>
     * <p>长沙麓谷</p>
     */
    @NameInMap("OfficeAddress")
    public String officeAddress;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setContactMail(String contactMail) {
        this.contactMail = contactMail;
        return this;
    }
    public String getContactMail() {
        return this.contactMail;
    }

    public UpdateInstanceRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public UpdateInstanceRequest setFacebookBmId(String facebookBmId) {
        this.facebookBmId = facebookBmId;
        return this;
    }
    public String getFacebookBmId() {
        return this.facebookBmId;
    }

    public UpdateInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public UpdateInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceRequest setIsConfirmAudit(String isConfirmAudit) {
        this.isConfirmAudit = isConfirmAudit;
        return this;
    }
    public String getIsConfirmAudit() {
        return this.isConfirmAudit;
    }

    public UpdateInstanceRequest setIsvTerms(String isvTerms) {
        this.isvTerms = isvTerms;
        return this;
    }
    public String getIsvTerms() {
        return this.isvTerms;
    }

    public UpdateInstanceRequest setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
        return this;
    }
    public String getOfficeAddress() {
        return this.officeAddress;
    }

    public UpdateInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
