// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeContact extends TeaModel {
    @NameInMap("email")
    public String email;

    @NameInMap("emailVerify")
    public Boolean emailVerify;

    @NameInMap("extend")
    public java.util.Map<String, ?> extend;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("identifier")
    public String identifier;

    @NameInMap("lang")
    public String lang;

    @NameInMap("name")
    public String name;

    @NameInMap("phone")
    public String phone;

    @NameInMap("phoneCode")
    public String phoneCode;

    @NameInMap("phoneVerify")
    public Boolean phoneVerify;

    @NameInMap("source")
    public String source;

    public static MergeContact build(java.util.Map<String, ?> map) throws Exception {
        MergeContact self = new MergeContact();
        return TeaModel.build(map, self);
    }

    public MergeContact setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public MergeContact setEmailVerify(Boolean emailVerify) {
        this.emailVerify = emailVerify;
        return this;
    }
    public Boolean getEmailVerify() {
        return this.emailVerify;
    }

    public MergeContact setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public MergeContact setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MergeContact setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MergeContact setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public MergeContact setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MergeContact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MergeContact setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public MergeContact setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }
    public String getPhoneCode() {
        return this.phoneCode;
    }

    public MergeContact setPhoneVerify(Boolean phoneVerify) {
        this.phoneVerify = phoneVerify;
        return this;
    }
    public Boolean getPhoneVerify() {
        return this.phoneVerify;
    }

    public MergeContact setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
