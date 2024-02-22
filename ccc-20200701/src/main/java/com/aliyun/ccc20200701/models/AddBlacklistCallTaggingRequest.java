// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddBlacklistCallTaggingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Number")
    public String number;

    public static AddBlacklistCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBlacklistCallTaggingRequest self = new AddBlacklistCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public AddBlacklistCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddBlacklistCallTaggingRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AddBlacklistCallTaggingRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
