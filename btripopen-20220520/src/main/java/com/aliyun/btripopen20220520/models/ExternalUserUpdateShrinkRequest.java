// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserUpdateShrinkRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>13438009765</p>
     */
    @NameInMap("phone")
    public String phone;

    @NameInMap("real_name")
    public String realName;

    /**
     * <strong>example:</strong>
     * <p>zhang/san</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    public static ExternalUserUpdateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserUpdateShrinkRequest self = new ExternalUserUpdateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExternalUserUpdateShrinkRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public ExternalUserUpdateShrinkRequest setCertRequestListShrink(String certRequestListShrink) {
        this.certRequestListShrink = certRequestListShrink;
        return this;
    }
    public String getCertRequestListShrink() {
        return this.certRequestListShrink;
    }

    public ExternalUserUpdateShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ExternalUserUpdateShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ExternalUserUpdateShrinkRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public ExternalUserUpdateShrinkRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

}
