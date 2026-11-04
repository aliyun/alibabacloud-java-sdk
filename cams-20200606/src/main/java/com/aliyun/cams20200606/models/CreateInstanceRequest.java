// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The channel type.</p>
     * <blockquote>
     * <p>Notice: The Singapore site supports all channels, and the Germany site currently supports only WhatsApp.</notice></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIBER</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The contact email address.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ContactMail")
    public String contactMail;

    /**
     * <p>The country code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <p>FacebookBmId</p>
     * 
     * <strong>example:</strong>
     * <p>393992929</p>
     */
    @NameInMap("FacebookBmId")
    public String facebookBmId;

    /**
     * <p>The instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>ins</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>viber_ins</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Specifies whether the audit is confirmed.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsConfirmAudit")
    public String isConfirmAudit;

    /**
     * <p>The name of the ISV/client agreement file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://a.com/1.pdf">https://a.com/1.pdf</a></p>
     */
    @NameInMap("IsvTerms")
    public String isvTerms;

    /**
     * <p>The enterprise address.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("OfficeAddress")
    public String officeAddress;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public CreateInstanceRequest setContactMail(String contactMail) {
        this.contactMail = contactMail;
        return this;
    }
    public String getContactMail() {
        return this.contactMail;
    }

    public CreateInstanceRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public CreateInstanceRequest setFacebookBmId(String facebookBmId) {
        this.facebookBmId = facebookBmId;
        return this;
    }
    public String getFacebookBmId() {
        return this.facebookBmId;
    }

    public CreateInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setIsConfirmAudit(String isConfirmAudit) {
        this.isConfirmAudit = isConfirmAudit;
        return this;
    }
    public String getIsConfirmAudit() {
        return this.isConfirmAudit;
    }

    public CreateInstanceRequest setIsvTerms(String isvTerms) {
        this.isvTerms = isvTerms;
        return this;
    }
    public String getIsvTerms() {
        return this.isvTerms;
    }

    public CreateInstanceRequest setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
        return this;
    }
    public String getOfficeAddress() {
        return this.officeAddress;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
