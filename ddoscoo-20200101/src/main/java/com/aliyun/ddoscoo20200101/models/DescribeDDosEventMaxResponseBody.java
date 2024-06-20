// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventMaxResponseBody extends TeaModel {
    /**
     * <p>The peak of connection flood attacks. Unit: connections per seconds (CPS).</p>
     * 
     * <strong>example:</strong>
     * <p>1302</p>
     */
    @NameInMap("Cps")
    public Long cps;

    /**
     * <p>The peak of volumetric attacks. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>6809</p>
     */
    @NameInMap("Mbps")
    public Long mbps;

    /**
     * <p>The peak of resource exhaustion attacks. Unit: queries per second (QPS).</p>
     * 
     * <strong>example:</strong>
     * <p>26314</p>
     */
    @NameInMap("Qps")
    public Long qps;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5AE2FC86-C840-41AE-9F1A-3A2747C7C1DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDDosEventMaxResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventMaxResponseBody self = new DescribeDDosEventMaxResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDDosEventMaxResponseBody setQps(Long qps) {
        this.qps = qps;
        return this;
    }
    public Long getQps() {
        return this.qps;
    }

    public DescribeDDosEventMaxResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
