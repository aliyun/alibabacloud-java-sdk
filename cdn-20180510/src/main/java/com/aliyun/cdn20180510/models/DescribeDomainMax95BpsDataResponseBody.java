// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMax95BpsDataResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomesticMax95Bps")
    public String domesticMax95Bps;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Max95Bps")
    public String max95Bps;

    @NameInMap("OverseasMax95Bps")
    public String overseasMax95Bps;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainMax95BpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMax95BpsDataResponseBody self = new DescribeDomainMax95BpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMax95BpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainMax95BpsDataResponseBody setDomesticMax95Bps(String domesticMax95Bps) {
        this.domesticMax95Bps = domesticMax95Bps;
        return this;
    }
    public String getDomesticMax95Bps() {
        return this.domesticMax95Bps;
    }

    public DescribeDomainMax95BpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainMax95BpsDataResponseBody setMax95Bps(String max95Bps) {
        this.max95Bps = max95Bps;
        return this;
    }
    public String getMax95Bps() {
        return this.max95Bps;
    }

    public DescribeDomainMax95BpsDataResponseBody setOverseasMax95Bps(String overseasMax95Bps) {
        this.overseasMax95Bps = overseasMax95Bps;
        return this;
    }
    public String getOverseasMax95Bps() {
        return this.overseasMax95Bps;
    }

    public DescribeDomainMax95BpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainMax95BpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
