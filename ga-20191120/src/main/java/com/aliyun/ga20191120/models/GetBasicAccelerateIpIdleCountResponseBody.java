// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpIdleCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned, which indicates the number of idle accelerated IP addresses.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetBasicAccelerateIpIdleCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpIdleCountResponseBody self = new GetBasicAccelerateIpIdleCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpIdleCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicAccelerateIpIdleCountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
