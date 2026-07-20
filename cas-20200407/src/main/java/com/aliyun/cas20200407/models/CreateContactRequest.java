// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateContactRequest extends TeaModel {
    /**
     * <p>The email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@126.com">test@126.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID card number of the contact. This parameter is required for the CFCA certificate brand and is not required for other brands.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Idcard")
    public String idcard;

    /**
     * <p>The phone number of the contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1335678****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The name of the certificate contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zhang san</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The webhook URLs of DingTalk, WeCom, or Lark chatbots. The value is a string in list format.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/dc1aa9b9-47cd-4b34-91ef-73c1034208e5%5C%5C%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/dc1aa9b9-47cd-4b34-91ef-73c1034208e5\\&quot;]</a></p>
     */
    @NameInMap("Webhooks")
    public String webhooks;

    public static CreateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContactRequest self = new CreateContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateContactRequest setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }
    public String getIdcard() {
        return this.idcard;
    }

    public CreateContactRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContactRequest setWebhooks(String webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public String getWebhooks() {
        return this.webhooks;
    }

}
