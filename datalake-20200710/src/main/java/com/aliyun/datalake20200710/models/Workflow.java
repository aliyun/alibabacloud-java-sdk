// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Workflow extends TeaModel {
    // 最近运行的结束时间
    @NameInMap("LatestEndTime")
    public String latestEndTime;

    // 实例id
    @NameInMap("LatestInstanceId")
    public String latestInstanceId;

    // 最后运行实例的状态
    @NameInMap("LatestInstanceStatus")
    public String latestInstanceStatus;

    // 最后运行的开始时间
    @NameInMap("LatestStartTime")
    public String latestStartTime;

    public static Workflow build(java.util.Map<String, ?> map) throws Exception {
        Workflow self = new Workflow();
        return TeaModel.build(map, self);
    }

    public Workflow setLatestEndTime(String latestEndTime) {
        this.latestEndTime = latestEndTime;
        return this;
    }
    public String getLatestEndTime() {
        return this.latestEndTime;
    }

    public Workflow setLatestInstanceId(String latestInstanceId) {
        this.latestInstanceId = latestInstanceId;
        return this;
    }
    public String getLatestInstanceId() {
        return this.latestInstanceId;
    }

    public Workflow setLatestInstanceStatus(String latestInstanceStatus) {
        this.latestInstanceStatus = latestInstanceStatus;
        return this;
    }
    public String getLatestInstanceStatus() {
        return this.latestInstanceStatus;
    }

    public Workflow setLatestStartTime(String latestStartTime) {
        this.latestStartTime = latestStartTime;
        return this;
    }
    public String getLatestStartTime() {
        return this.latestStartTime;
    }

}
