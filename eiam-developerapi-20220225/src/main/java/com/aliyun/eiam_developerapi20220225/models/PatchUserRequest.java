// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchUserRequest extends TeaModel {
    // 账户展示名
    @NameInMap("displayName")
    public String displayName;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 邮箱是否验证，邮箱若设置此字段必须设置，无特殊业务可直接设置为true
    @NameInMap("emailVerified")
    public Boolean emailVerified;

    // 手机号
    @NameInMap("phoneNumber")
    public String phoneNumber;

    // 手机号是否验证，手机号若设置此字段必须设置，无特殊业务可直接设置为true
    @NameInMap("phoneNumberVerified")
    public Boolean phoneNumberVerified;

    // 手机地区编号,示例：中国大陆手区号为86，不带 00 或 +, 手机号若设置，此参数必填
    @NameInMap("phoneRegion")
    public String phoneRegion;

    // 账户名
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
