// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveBlacklistCallTaggingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Number")
    public String number;

    public static RemoveBlacklistCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBlacklistCallTaggingRequest self = new RemoveBlacklistCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBlacklistCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveBlacklistCallTaggingRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RemoveBlacklistCallTaggingRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
