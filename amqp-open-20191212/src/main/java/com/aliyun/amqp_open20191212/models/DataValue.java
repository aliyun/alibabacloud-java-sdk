// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID or Resource Access Management (RAM) user to which the AccessKey pair that is used to create the static username and password belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1565*******973901</p>
     */
    @NameInMap("masterUid")
    public Long masterUid;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-uqm******03</p>
     */
    @NameInMap("cInstanceId")
    public String cInstanceId;

    /**
     * <p>The AccessKey ID that is used to create the static username and password.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI5***********eRZtEJ6vfo</p>
     */
    @NameInMap("accessKey")
    public String accessKey;

    /**
     * <p>The static username.</p>
     * 
     * <strong>example:</strong>
     * <p>MjphbXFwLWNuLXVxbTJ6cjc2djAwMzpMVEFJNX*******ZNMWVSWnRFSjZ2Zm8=</p>
     */
    @NameInMap("userName")
    public String userName;

    /**
     * <p>The static password.</p>
     * 
     * <strong>example:</strong>
     * <p>OUYwQzM2QjZBRkUxNDRFM***************MzZCNzdDQzoxNjcxNDMwMzkyODI1</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The timestamp that indicates when the static username and password were deleted. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1671175303522</p>
     */
    @NameInMap("deleted")
    public Long deleted;

    /**
     * <p>The timestamp that indicates when the static username and password were created. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1671175303522</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setMasterUid(Long masterUid) {
        this.masterUid = masterUid;
        return this;
    }
    public Long getMasterUid() {
        return this.masterUid;
    }

    public DataValue setCInstanceId(String cInstanceId) {
        this.cInstanceId = cInstanceId;
        return this;
    }
    public String getCInstanceId() {
        return this.cInstanceId;
    }

    public DataValue setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public DataValue setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DataValue setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DataValue setDeleted(Long deleted) {
        this.deleted = deleted;
        return this;
    }
    public Long getDeleted() {
        return this.deleted;
    }

    public DataValue setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

}
