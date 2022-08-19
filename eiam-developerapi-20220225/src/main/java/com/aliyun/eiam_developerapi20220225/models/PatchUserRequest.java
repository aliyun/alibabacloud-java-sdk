// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchUserRequest extends TeaModel {
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("email")
    public String email;

    @NameInMap("emailVerified")
    public Boolean emailVerified;

    @NameInMap("phoneNumber")
    public String phoneNumber;

    @NameInMap("phoneNumberVerified")
    public Boolean phoneNumberVerified;

    @NameInMap("phoneRegion")
    public String phoneRegion;

    @NameInMap("username")
    public String username;

    public static PatchUserRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchUserRequest self = new PatchUserRequest();
        return TeaModel.build(map, self);
    }

    public PatchUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public PatchUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public PatchUserRequest setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public PatchUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PatchUserRequest setPhoneNumberVerified(Boolean phoneNumberVerified) {
        this.phoneNumberVerified = phoneNumberVerified;
        return this;
    }
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    public PatchUserRequest setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public PatchUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
