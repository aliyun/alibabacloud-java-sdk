// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeContact extends TeaModel {
    /**
     * <p>邮箱地址。</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:zhangsan@company.com">zhangsan@company.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>邮箱是否已验证。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("emailVerify")
    public Boolean emailVerify;

    /**
     * <p>扩展字段，用于存储额外信息。</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;department&quot;: &quot;运维部&quot;, &quot;role&quot;: &quot;工程师&quot; }</p>
     */
    @NameInMap("extend")
    public java.util.Map<String, ?> extend;

    /**
     * <p>创建时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>最后修改时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>联系人唯一标识符。</p>
     * 
     * <strong>example:</strong>
     * <p>user-12345</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <p>语言偏好。</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>联系人姓名。</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>手机号码。</p>
     * 
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>手机号码国家区号。</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("phoneCode")
    public String phoneCode;

    /**
     * <p>手机号码是否已验证。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("phoneVerify")
    public Boolean phoneVerify;

    /**
     * <p>联系人来源系统。</p>
     * 
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
