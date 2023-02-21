// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkSession extends TeaModel {
    @NameInMap("Active")
    public String active;

    @NameInMap("AliyunUid")
    public Long aliyunUid;

    @NameInMap("SessionId")
    public Long sessionId;

    @NameInMap("State")
    public String state;

    public static SparkSession build(java.util.Map<String, ?> map) throws Exception {
        SparkSession self = new SparkSession();
        return TeaModel.build(map, self);
    }

    public SparkSession setActive(String active) {
        this.active = active;
        return this;
    }
    public String getActive() {
        return this.active;
    }

    public SparkSession setAliyunUid(Long aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    public SparkSession setSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Long getSessionId() {
        return this.sessionId;
    }

    public SparkSession setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
