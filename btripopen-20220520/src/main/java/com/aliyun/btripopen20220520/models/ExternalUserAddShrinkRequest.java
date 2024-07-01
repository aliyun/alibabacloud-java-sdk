// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserAddShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2000-01-02</p>
     */
    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_request_list")
    public String certRequestListShrink;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:zhangsan@alibaba-inc.com">zhangsan@alibaba-inc.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0012</p>
     */
    @NameInMap("external_user_id")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>13438009765</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("real_name")
    public String realName;

    /**
     * <strong>example:</strong>
     * <p>zhang/san</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("user_type")
    public Integer userType;

    public static ExternalUserAddShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserAddShrinkRequest self = new ExternalUserAddShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExternalUserAddShrinkRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public ExternalUserAddShrinkRequest setCertRequestListShrink(String certRequestListShrink) {
        this.certRequestListShrink = certRequestListShrink;
        return this;
    }
    public String getCertRequestListShrink() {
        return this.certRequestListShrink;
    }

    public ExternalUserAddShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ExternalUserAddShrinkRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ExternalUserAddShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ExternalUserAddShrinkRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public ExternalUserAddShrinkRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public ExternalUserAddShrinkRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

}
