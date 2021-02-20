// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventMaxResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Qps")
    public Long qps;

    @NameInMap("Cps")
    public Long cps;

    @NameInMap("Mbps")
    public Long mbps;

    public static DescribeDDosEventMaxResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventMaxResponseBody self = new DescribeDDosEventMaxResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventMaxResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDosEventMaxResponseBody setQps(Long qps) {
        this.qps = qps;
        return this;
    }
    public Long getQps() {
        return this.qps;
    }

    public DescribeDDosEventMaxResponseBody setCps(Long cps) {
        this.cps = cps;
        return this;
    }
    public Long getCps() {
        return this.cps;
    }

    public DescribeDDosEventMaxResponseBody setMbps(Long mbps) {
        this.mbps = mbps;
        return this;
    }
    public Long getMbps() {
        return this.mbps;
    }

}
