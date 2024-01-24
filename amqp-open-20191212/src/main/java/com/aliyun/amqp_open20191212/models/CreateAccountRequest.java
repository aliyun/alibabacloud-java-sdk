// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of your Alibaba Cloud account or RAM user. For information about how to obtain an AccessKey pair, see [Create an AccessKey pair](~~116401~~).</p>
     * <br>
     * <p>>  If you use the pair of static username and password that is created by using the Accesskey pair of a RAM user to access ApsaraMQ for RabbitMQ to send and receive messages, make sure that the RAM user is granted the required permissions. For more information, see [RAM policies](~~146559~~).</p>
     */
    @NameInMap("accountAccessKey")
    public String accountAccessKey;

    /**
     * <p>The timestamp that indicates when the password is created. Unit: milliseconds.</p>
     * <br>
     * <p>>  This timestamp is specified by you and is used to generate a static password. The timestamp is not the timestamp that indicates when the system generates the password.</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The ID of the instance for which you want to create a pair of static username and password.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The AccessKey secret signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.</p>
     * <br>
     * <p>The system uses the HMAC-SHA1 algorithm to generate the AccessKey secret signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the **"Sample code on how to generate a signature"** section of this topic.</p>
     */
    @NameInMap("secretSign")
    public String secretSign;

    /**
     * <p>The signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.</p>
     * <br>
     * <p>The system uses the HMAC-SHA1 algorithm to generate the signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the **"Sample code on how to generate a signature"** section of this topic.</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <p>The static username that you want to create.</p>
     * <br>
     * <p>The value of this parameter is a Base64-encoded string that is generated based on the instance ID and AccessKey ID. For more information, see the "**Sample code on how to generate a username**" section of this topic.</p>
     */
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
