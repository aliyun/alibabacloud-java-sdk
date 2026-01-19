// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDdosMaxBurstGbpsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>esa-site-a71k7bw19dz4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxBurstGbps")
    public String maxBurstGbps;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B5D71671-B074-5702-A0F5-B923920FDDD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDdosMaxBurstGbpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosMaxBurstGbpsResponseBody self = new DescribeDdosMaxBurstGbpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosMaxBurstGbpsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDdosMaxBurstGbpsResponseBody setMaxBurstGbps(String maxBurstGbps) {
        this.maxBurstGbps = maxBurstGbps;
        return this;
    }
    public String getMaxBurstGbps() {
        return this.maxBurstGbps;
    }

    public DescribeDdosMaxBurstGbpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
