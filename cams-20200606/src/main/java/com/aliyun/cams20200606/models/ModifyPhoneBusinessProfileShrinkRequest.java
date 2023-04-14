// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileShrinkRequest extends TeaModel {
    /**
     * <p>The address.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The email address.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The URL of the profile picture.</p>
     */
    @NameInMap("ProfilePictureUrl")
    public String profilePictureUrl;

    /**
     * <p>The industry.</p>
     */
    @NameInMap("Vertical")
    public String vertical;

    /**
     * <p>The websites.</p>
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
