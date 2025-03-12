// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackMaxQpsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>613</p>
     */
    @NameInMap("Qps")
    public String qps;

    /**
     * <strong>example:</strong>
     * <p>62F9BD81-8BCA-5B23-A3CB-3FB7CEB7A4CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainAttackMaxQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackMaxQpsResponseBody self = new DescribeDomainAttackMaxQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackMaxQpsResponseBody setQps(String qps) {
        this.qps = qps;
        return this;
    }
    public String getQps() {
        return this.qps;
    }

    public DescribeDomainAttackMaxQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
