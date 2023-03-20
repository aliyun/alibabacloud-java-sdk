// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackMaxQpsResponseBody extends TeaModel {
    @NameInMap("Qps")
    public String qps;

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
