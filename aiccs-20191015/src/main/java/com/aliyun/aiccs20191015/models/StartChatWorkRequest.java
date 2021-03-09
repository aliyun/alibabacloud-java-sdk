// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartChatWorkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // accountName
    @NameInMap("AccountName")
    public String accountName;

    // stationType
    @NameInMap("StationType")
    public String stationType;

    // workType
    @NameInMap("WorkType")
    public Integer workType;

    // userAgent
    @NameInMap("UserAgent")
    public String userAgent;

    public static StartChatWorkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartChatWorkRequest self = new StartChatWorkRequest();
        return TeaModel.build(map, self);
    }

    public StartChatWorkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartChatWorkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartChatWorkRequest setStationType(String stationType) {
        this.stationType = stationType;
        return this;
    }
    public String getStationType() {
        return this.stationType;
    }

    public StartChatWorkRequest setWorkType(Integer workType) {
        this.workType = workType;
        return this;
    }
    public Integer getWorkType() {
        return this.workType;
    }

    public StartChatWorkRequest setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    public String getUserAgent() {
        return this.userAgent;
    }

}
