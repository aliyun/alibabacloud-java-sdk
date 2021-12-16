// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AnswerCallRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("UserId")
    public String userId;

    public static AnswerCallRequest build(java.util.Map<String, ?> map) throws Exception {
        AnswerCallRequest self = new AnswerCallRequest();
        return TeaModel.build(map, self);
    }

    public AnswerCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AnswerCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AnswerCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AnswerCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
