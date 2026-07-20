// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetContactResponseBody extends TeaModel {
    /**
     * <p>The contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1352570</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@163.com">test@163.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Indicates whether the email address is verified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EmailStatus")
    public Integer emailStatus;

    /**
     * <p>The ID card number of the contact. This parameter is required for the CFCA certificate brand and is not required for other brands.</p>
     * 
     * <strong>example:</strong>
     * <p>142***************</p>
     */
    @NameInMap("IdCard")
    public String idCard;

    /**
     * <p>The phone number of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>1510108****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Indicates whether the phone number is verified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MobileStatus")
    public Integer mobileStatus;

    /**
     * <p>The name of the certificate contact.</p>
     * 
     * <strong>example:</strong>
     * <p>zhang san</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EECA10D5-BD0F-4EF1-B3EA-B4578E5C6F8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The webhook URLs of DingTalk, WeCom, or Lark chatbots. The value is a string in list format.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/dc1aa9b9-47cd-4b34-91ef-73c1034208e5%5C%5C%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/dc1aa9b9-47cd-4b34-91ef-73c1034208e5\\&quot;]</a></p>
     */
    @NameInMap("Webhooks")
    public String webhooks;

    public static GetContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContactResponseBody self = new GetContactResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContactResponseBody setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public GetContactResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetContactResponseBody setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }
    public Integer getEmailStatus() {
        return this.emailStatus;
    }

    public GetContactResponseBody setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public GetContactResponseBody setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public GetContactResponseBody setMobileStatus(Integer mobileStatus) {
        this.mobileStatus = mobileStatus;
        return this;
    }
    public Integer getMobileStatus() {
        return this.mobileStatus;
    }

    public GetContactResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContactResponseBody setWebhooks(String webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public String getWebhooks() {
        return this.webhooks;
    }

}
