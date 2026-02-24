// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeContact extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:zhangsan@company.com">zhangsan@company.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("emailVerify")
    public Boolean emailVerify;

    @NameInMap("extend")
    public java.util.Map<String, ?> extend;

    /**
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>user-12345</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("lang")
    public String lang;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("phoneCode")
    public String phoneCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("phoneVerify")
    public Boolean phoneVerify;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
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
