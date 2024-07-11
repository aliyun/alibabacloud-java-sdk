// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of your Alibaba Cloud account or RAM user. For information about how to obtain an AccessKey pair, see <a href="https://help.aliyun.com/document_detail/116401.html">Create an AccessKey pair</a>.</p>
     * <blockquote>
     * <p> If you use the pair of static username and password that is created by using the Accesskey pair of a RAM user to access ApsaraMQ for RabbitMQ to send and receive messages, make sure that the RAM user is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/146559.html">RAM policies</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI5t8be*******tEJ6vfo</p>
     */
    @NameInMap("accountAccessKey")
    public String accountAccessKey;

    /**
     * <p>The timestamp that indicates when the password is created. Unit: milliseconds.</p>
     * <blockquote>
     * <p> This timestamp is specified by you and is used to generate a static password. The timestamp is not the timestamp that indicates when the system generates the password.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1671175303522</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The ID of the instance for which you want to create a pair of static username and password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-*********</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The AccessKey secret signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.</p>
     * <p>The system uses the HMAC-SHA1 algorithm to generate the AccessKey secret signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the <strong>&quot;Sample code on how to generate a signature&quot;</strong> section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c1a6367ce4c4255e9617326f9133ac6359533f6</p>
     */
    @NameInMap("secretSign")
    public String secretSign;

    /**
     * <p>The signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.</p>
     * <p>The system uses the HMAC-SHA1 algorithm to generate the signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the <strong>&quot;Sample code on how to generate a signature&quot;</strong> section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22c2d7d1769cb53c5a6d9213248e2de524c4f799</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <p>The static username that you want to create.</p>
     * <p>The value of this parameter is a Base64-encoded string that is generated based on the instance ID and AccessKey ID. For more information, see the &quot;<strong>Sample code on how to generate a username</strong>&quot; section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MjphbXFwLWNuLXp***********************Q4YmVNbVZNMWVSWnRFSjZ2Zm8=</p>
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
