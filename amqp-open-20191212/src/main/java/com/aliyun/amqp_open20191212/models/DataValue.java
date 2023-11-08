// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    @NameInMap("masterUid")
    public Long masterUid;

    @NameInMap("cInstanceId")
    public String cInstanceId;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("userName")
    public String userName;

    @NameInMap("password")
    public String password;

    @NameInMap("deleted")
    public Long deleted;

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
