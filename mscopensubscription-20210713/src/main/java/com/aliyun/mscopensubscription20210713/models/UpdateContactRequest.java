// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class UpdateContactRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc-def</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>联系人名称</p>
     * <p>This parameter is required.</p>
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
     * <p>en</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>用户电话</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1399999999</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    public static UpdateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactRequest self = new UpdateContactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContactRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public UpdateContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public UpdateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateContactRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public UpdateContactRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
