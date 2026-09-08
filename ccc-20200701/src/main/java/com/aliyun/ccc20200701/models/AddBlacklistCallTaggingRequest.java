// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddBlacklistCallTaggingRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Contact Center instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The call ID. If the phone number is encrypted and contains asterisks (\*), specify the JobId. This parameter is not required for unencrypted numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6582589278232****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1764590****</p>
     */
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
