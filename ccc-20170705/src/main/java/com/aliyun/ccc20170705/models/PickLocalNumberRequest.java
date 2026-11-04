// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickLocalNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CalleeNumber")
    public String calleeNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CandidateNumber")
    public java.util.List<String> candidateNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static PickLocalNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        PickLocalNumberRequest self = new PickLocalNumberRequest();
        return TeaModel.build(map, self);
    }

    public PickLocalNumberRequest setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
        return this;
    }
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    public PickLocalNumberRequest setCandidateNumber(java.util.List<String> candidateNumber) {
        this.candidateNumber = candidateNumber;
        return this;
    }
    public java.util.List<String> getCandidateNumber() {
        return this.candidateNumber;
    }

    public PickLocalNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
