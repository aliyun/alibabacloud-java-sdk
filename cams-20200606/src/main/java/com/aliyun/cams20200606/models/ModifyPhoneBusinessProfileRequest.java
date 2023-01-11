// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Email")
    public String email;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ProfilePictureUrl")
    public String profilePictureUrl;

    @NameInMap("Vertical")
    public String vertical;

    @NameInMap("Websites")
    public java.util.List<String> websites;

    public static ModifyPhoneBusinessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneBusinessProfileRequest self = new ModifyPhoneBusinessProfileRequest();
        return TeaModel.build(map, self);
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
