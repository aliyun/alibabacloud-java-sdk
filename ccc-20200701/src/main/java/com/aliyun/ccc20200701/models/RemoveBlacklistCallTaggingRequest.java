// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveBlacklistCallTaggingRequest extends TeaModel {
    /**
     * <p>ID of the Cloud Contact Center instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Call ID. Provide this field only for masked numbers (containing \*). Do not provide it for unmasked numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1312121****</p>
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
