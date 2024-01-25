// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateAlertContactRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Webhook")
    public String webhook;

    public static CreateAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactRequest self = new CreateAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateAlertContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertContactRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public CreateAlertContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateAlertContactRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
