// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileShrinkRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Modifies the business information of the account to which a specified phone number is bound.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The address.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The industry.</p>
     * <br>
     * <p>> Enum: {OTHER, AUTO, BEAUTY, APPAREL, EDU, ENTERTAIN, EVENT_PLAN, FINANCE, GROCERY, GOVT, HOTEL, HEALTH, NONPROFIT, PROF_SERVICES, RETAIL, TRAVEL, RESTAURANT}</p>
     */
    @NameInMap("ProfilePictureUrl")
    public String profilePictureUrl;

    /**
     * <p>Sichuan</p>
     */
    @NameInMap("Vertical")
    public String vertical;

    /**
     * <p>The email address.</p>
     */
    @NameInMap("Websites")
    public String websitesShrink;

    public static ModifyPhoneBusinessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneBusinessProfileShrinkRequest self = new ModifyPhoneBusinessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneBusinessProfileShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
        return this;
    }
    public String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setVertical(String vertical) {
        this.vertical = vertical;
        return this;
    }
    public String getVertical() {
        return this.vertical;
    }

    public ModifyPhoneBusinessProfileShrinkRequest setWebsitesShrink(String websitesShrink) {
        this.websitesShrink = websitesShrink;
        return this;
    }
    public String getWebsitesShrink() {
        return this.websitesShrink;
    }

}
