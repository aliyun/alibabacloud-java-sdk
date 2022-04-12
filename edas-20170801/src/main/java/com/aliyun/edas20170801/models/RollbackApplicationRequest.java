// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Batch")
    public Integer batch;

    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HistoryVersion")
    public String historyVersion;

    public static RollbackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationRequest self = new RollbackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackApplicationRequest setBatch(Integer batch) {
        this.batch = batch;
        return this;
    }
    public Integer getBatch() {
        return this.batch;
    }

    public RollbackApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public RollbackApplicationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RollbackApplicationRequest setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

}
