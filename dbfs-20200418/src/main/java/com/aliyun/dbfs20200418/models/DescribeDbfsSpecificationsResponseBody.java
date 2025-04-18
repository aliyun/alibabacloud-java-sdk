// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DescribeDbfsSpecificationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaxDbfsNumberPerEcs")
    public java.util.Map<String, ?> maxDbfsNumberPerEcs;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportedEcsInstanceTypeFamily")
    public java.util.List<String> supportedEcsInstanceTypeFamily;

    public static DescribeDbfsSpecificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbfsSpecificationsResponseBody self = new DescribeDbfsSpecificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbfsSpecificationsResponseBody setMaxDbfsNumberPerEcs(java.util.Map<String, ?> maxDbfsNumberPerEcs) {
        this.maxDbfsNumberPerEcs = maxDbfsNumberPerEcs;
        return this;
    }
    public java.util.Map<String, ?> getMaxDbfsNumberPerEcs() {
        return this.maxDbfsNumberPerEcs;
    }

    public DescribeDbfsSpecificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbfsSpecificationsResponseBody setSupportedEcsInstanceTypeFamily(java.util.List<String> supportedEcsInstanceTypeFamily) {
        this.supportedEcsInstanceTypeFamily = supportedEcsInstanceTypeFamily;
        return this;
    }
    public java.util.List<String> getSupportedEcsInstanceTypeFamily() {
        return this.supportedEcsInstanceTypeFamily;
    }

}
