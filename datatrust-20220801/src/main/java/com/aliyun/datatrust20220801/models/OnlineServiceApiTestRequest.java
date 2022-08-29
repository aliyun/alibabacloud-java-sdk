// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class OnlineServiceApiTestRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("UserId")
    public String userId;

    public static OnlineServiceApiTestRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineServiceApiTestRequest self = new OnlineServiceApiTestRequest();
        return TeaModel.build(map, self);
    }

    public OnlineServiceApiTestRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public OnlineServiceApiTestRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public OnlineServiceApiTestRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public OnlineServiceApiTestRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
