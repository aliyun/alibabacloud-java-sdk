// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TimedResidentResourcePoolApplication extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("content")
    public String content;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("operationType")
    public String operationType;

    @NameInMap("status")
    public String status;

    @NameInMap("timedPoolId")
    public String timedPoolId;

    public static TimedResidentResourcePoolApplication build(java.util.Map<String, ?> map) throws Exception {
        TimedResidentResourcePoolApplication self = new TimedResidentResourcePoolApplication();
        return TeaModel.build(map, self);
    }

    public TimedResidentResourcePoolApplication setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public TimedResidentResourcePoolApplication setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public TimedResidentResourcePoolApplication setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public TimedResidentResourcePoolApplication setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public TimedResidentResourcePoolApplication setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public TimedResidentResourcePoolApplication setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TimedResidentResourcePoolApplication setTimedPoolId(String timedPoolId) {
        this.timedPoolId = timedPoolId;
        return this;
    }
    public String getTimedPoolId() {
        return this.timedPoolId;
    }

}
