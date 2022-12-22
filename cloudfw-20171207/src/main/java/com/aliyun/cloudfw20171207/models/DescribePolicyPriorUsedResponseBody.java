// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyPriorUsedResponseBody extends TeaModel {
    // The lowest priority of existing access control policies.
    // 
    // >  The value -1 indicates the lowest priority.
    @NameInMap("End")
    public Integer end;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The highest priority of existing access control policies.
    // 
    // >  The value 0 indicates the highest priority.
    @NameInMap("Start")
    public Integer start;

    public static DescribePolicyPriorUsedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyPriorUsedResponseBody self = new DescribePolicyPriorUsedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyPriorUsedResponseBody setEnd(Integer end) {
        this.end = end;
        return this;
    }
    public Integer getEnd() {
        return this.end;
    }

    public DescribePolicyPriorUsedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyPriorUsedResponseBody setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
