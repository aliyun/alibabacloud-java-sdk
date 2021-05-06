// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyPriorUsedResponseBody extends TeaModel {
    @NameInMap("End")
    public Integer end;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("RequestId")
    public String requestId;

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

    public DescribePolicyPriorUsedResponseBody setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public DescribePolicyPriorUsedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
