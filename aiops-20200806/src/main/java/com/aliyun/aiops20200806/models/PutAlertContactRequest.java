// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Webhook")
    public String webhook;

    public static PutAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertContactRequest self = new PutAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public PutAlertContactRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PutAlertContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PutAlertContactRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public PutAlertContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public PutAlertContactRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
