// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    @NameInMap("accountAccessKey")
    public String accountAccessKey;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("secretSign")
    public String secretSign;

    @NameInMap("signature")
    public String signature;

    @NameInMap("userName")
    public String userName;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccountAccessKey(String accountAccessKey) {
        this.accountAccessKey = accountAccessKey;
        return this;
    }
    public String getAccountAccessKey() {
        return this.accountAccessKey;
    }

    public CreateAccountRequest setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public CreateAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAccountRequest setSecretSign(String secretSign) {
        this.secretSign = secretSign;
        return this;
    }
    public String getSecretSign() {
        return this.secretSign;
    }

    public CreateAccountRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
