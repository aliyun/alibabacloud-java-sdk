// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateContactRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>联系人名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>图灵</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>联系人电子邮箱</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:turing@addr.cs">turing@addr.cs</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>用户电话</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13910772437</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>职位</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>技术负责人</p>
     */
    @NameInMap("Position")
    public String position;

    public static CreateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContactRequest self = new CreateContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateContactRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateContactRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public CreateContactRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateContactRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

}
