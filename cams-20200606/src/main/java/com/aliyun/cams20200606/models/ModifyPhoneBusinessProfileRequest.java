// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileRequest extends TeaModel {
    /**
     * <p>The about information.</p>
     * 
     * <strong>example:</strong>
     * <p>business profile</p>
     */
    @NameInMap("About")
    public String about;

    /**
     * <p>The address.</p>
     * 
     * <strong>example:</strong>
     * <p>Sichuan</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The space ID of the ISV sub-customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:aa@aliyun.com">aa@aliyun.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861380000****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The profile picture URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.img">http://a.img</a></p>
     */
    @NameInMap("ProfilePictureUrl")
    public String profilePictureUrl;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The industry vertical.</p>
     * 
     * <strong>example:</strong>
     * <p>OTHER</p>
     */
    @NameInMap("Vertical")
    public String vertical;

    /**
     * <p>The websites.</p>
     */
    @NameInMap("Websites")
    public java.util.List<String> websites;

    public static ModifyPhoneBusinessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneBusinessProfileRequest self = new ModifyPhoneBusinessProfileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneBusinessProfileRequest setAbout(String about) {
        this.about = about;
        return this;
    }
    public String getAbout() {
        return this.about;
    }

    public ModifyPhoneBusinessProfileRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ModifyPhoneBusinessProfileRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyPhoneBusinessProfileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPhoneBusinessProfileRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyPhoneBusinessProfileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPhoneBusinessProfileRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ModifyPhoneBusinessProfileRequest setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
        return this;
    }
    public String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public ModifyPhoneBusinessProfileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPhoneBusinessProfileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyPhoneBusinessProfileRequest setVertical(String vertical) {
        this.vertical = vertical;
        return this;
    }
    public String getVertical() {
        return this.vertical;
    }

    public ModifyPhoneBusinessProfileRequest setWebsites(java.util.List<String> websites) {
        this.websites = websites;
        return this;
    }
    public java.util.List<String> getWebsites() {
        return this.websites;
    }

}
