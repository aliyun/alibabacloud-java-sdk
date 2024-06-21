// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>business profile</p>
     */
    @NameInMap("About")
    public String about;

    /**
     * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
     * 
     * <strong>example:</strong>
     * <p>The phone number.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Modifies the business information of the account to which a specified phone number is bound.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The address.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:aa@aliyun.com">aa@aliyun.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800001234</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The industry.</p>
     * <blockquote>
     * <p>Enum: {OTHER, AUTO, BEAUTY, APPAREL, EDU, ENTERTAIN, EVENT_PLAN, FINANCE, GROCERY, GOVT, HOTEL, HEALTH, NONPROFIT, PROF_SERVICES, RETAIL, TRAVEL, RESTAURANT}</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.img">http://a.img</a></p>
     */
    @NameInMap("ProfilePictureUrl")
    public String profilePictureUrl;

    /**
     * <p>Sichuan</p>
     * 
     * <strong>example:</strong>
     * <p>OTHER</p>
     */
    @NameInMap("Vertical")
    public String vertical;

    /**
     * <p>The email address.</p>
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
