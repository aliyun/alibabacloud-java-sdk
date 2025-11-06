// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class FetchStaticAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAccessKeyID</p>
     */
    @NameInMap("AccountAccessKey")
    public String accountAccessKey;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1671175303522</p>
     */
    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>备注示例</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22c2d7d1769cb53c5a6d9213248e2de524******</p>
     */
    @NameInMap("SKey")
    public String SKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c1a6367ce4c4255e9617326f9133ac635******</p>
     */
    @NameInMap("SecretSign")
    public String secretSign;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mjo****************</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static FetchStaticAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchStaticAccountRequest self = new FetchStaticAccountRequest();
        return TeaModel.build(map, self);
    }

    public FetchStaticAccountRequest setAccountAccessKey(String accountAccessKey) {
        this.accountAccessKey = accountAccessKey;
        return this;
    }
    public String getAccountAccessKey() {
        return this.accountAccessKey;
    }

    public FetchStaticAccountRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public FetchStaticAccountRequest setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public FetchStaticAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FetchStaticAccountRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public FetchStaticAccountRequest setSKey(String SKey) {
        this.SKey = SKey;
        return this;
    }
    public String getSKey() {
        return this.SKey;
    }

    public FetchStaticAccountRequest setSecretSign(String secretSign) {
        this.secretSign = secretSign;
        return this;
    }
    public String getSecretSign() {
        return this.secretSign;
    }

    public FetchStaticAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
