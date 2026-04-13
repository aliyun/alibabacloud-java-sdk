// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeCandidateInstanceTypeResponseBody extends TeaModel {
    @NameInMap("CandidateInstanceTypes")
    public java.util.List<String> candidateInstanceTypes;

    @NameInMap("CandidateZoneIds")
    public java.util.List<String> candidateZoneIds;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCandidateInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCandidateInstanceTypeResponseBody self = new DescribeCandidateInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCandidateInstanceTypeResponseBody setCandidateInstanceTypes(java.util.List<String> candidateInstanceTypes) {
        this.candidateInstanceTypes = candidateInstanceTypes;
        return this;
    }
    public java.util.List<String> getCandidateInstanceTypes() {
        return this.candidateInstanceTypes;
    }

    public DescribeCandidateInstanceTypeResponseBody setCandidateZoneIds(java.util.List<String> candidateZoneIds) {
        this.candidateZoneIds = candidateZoneIds;
        return this;
    }
    public java.util.List<String> getCandidateZoneIds() {
        return this.candidateZoneIds;
    }

    public DescribeCandidateInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
