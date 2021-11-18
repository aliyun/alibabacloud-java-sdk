// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickOutboundNumbersRequest extends TeaModel {
    @NameInMap("CalleeNumber")
    public String calleeNumber;

    @NameInMap("CandidateNumber")
    public java.util.List<String> candidateNumber;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("InstanceId")
    public String instanceId;

    public static PickOutboundNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        PickOutboundNumbersRequest self = new PickOutboundNumbersRequest();
        return TeaModel.build(map, self);
    }

    public PickOutboundNumbersRequest setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
        return this;
    }
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    public PickOutboundNumbersRequest setCandidateNumber(java.util.List<String> candidateNumber) {
        this.candidateNumber = candidateNumber;
        return this;
    }
    public java.util.List<String> getCandidateNumber() {
        return this.candidateNumber;
    }

    public PickOutboundNumbersRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public PickOutboundNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
