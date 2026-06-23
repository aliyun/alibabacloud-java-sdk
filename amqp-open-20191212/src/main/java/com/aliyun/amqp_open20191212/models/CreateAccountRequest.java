// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The remarks on the static user.</p>
     * 
     * <strong>example:</strong>
     * <p>*** environment</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The AccessKey ID of your Alibaba Cloud account or RAM user. For more information about how to obtain an AccessKey ID, see <a href="https://help.aliyun.com/document_detail/116401.html">Create an AccessKey</a>.</p>
     * <blockquote>
     * <p>If you use the AccessKey of a RAM user to create a static username and password to access ApsaraMQ for RabbitMQ and to send and receive messages, make sure that the RAM user is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/146559.html">RAM access policies</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAccessKeyID</p>
     */
    @NameInMap("accountAccessKey")
    public String accountAccessKey;

    /**
     * <p>The timestamp that indicates when the username and password are created. Unit: milliseconds.</p>
     * <blockquote>
     * <p>This timestamp is used to calculate the static password. You can customize this value. This is not the timestamp that the system generates when the username and password are created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1671175303522</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance. This specifies the instance for which you want to create a static username and password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-*********</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The signature of the AccessKey secret. The system calculates the static password based on the signature, the AccessKey secret signature, and the username.</p>
     * <p>The AccessKey secret signature is calculated using the HmacSHA1 algorithm on the creation timestamp of the specified username and the AccessKey ID. For more information about how to calculate the signature, see the <strong>Signature algorithm sample code</strong> section in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c1a6367ce4c4255e9617326f9133ac635******</p>
     */
    @NameInMap("secretSign")
    public String secretSign;

    /**
     * <p>The signature. The system calculates the static password based on the signature, the AccessKey secret signature, and the username.</p>
     * <p>The signature is calculated using the HmacSHA1 algorithm on the creation timestamp of the specified username and the AccessKey ID. For more information about how to calculate the signature, see the <strong>Signature algorithm sample code</strong> section in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22c2d7d1769cb53c5a6d9213248e2de524******</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <p>The static username that you want to create.</p>
     * <p>The value of this parameter is a Base64-encoded string that is constructed from the instance ID and the AccessKey ID. For more information about how to calculate the value, see the <strong>Username calculation sample code</strong> section in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mjo****************</p>
     */
    @NameInMap("userName")
    public String userName;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
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
