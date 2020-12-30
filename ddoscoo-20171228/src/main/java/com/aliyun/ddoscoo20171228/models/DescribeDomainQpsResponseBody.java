// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsResponseBody extends TeaModel {
    @NameInMap("IpBlockQps")
    public java.util.List<String> ipBlockQps;

    @NameInMap("CcJsQps")
    public java.util.List<String> ccJsQps;

    @NameInMap("Blocks")
    public java.util.List<String> blocks;

    @NameInMap("PreciseBlocks")
    public java.util.List<String> preciseBlocks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PreciseJsQps")
    public java.util.List<String> preciseJsQps;

    @NameInMap("Totals")
    public java.util.List<String> totals;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("CcBlockQps")
    public java.util.List<String> ccBlockQps;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("RegionBlocks")
    public java.util.List<String> regionBlocks;

    @NameInMap("CacheHits")
    public java.util.List<String> cacheHits;

    public static DescribeDomainQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsResponseBody self = new DescribeDomainQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsResponseBody setIpBlockQps(java.util.List<String> ipBlockQps) {
        this.ipBlockQps = ipBlockQps;
        return this;
    }
    public java.util.List<String> getIpBlockQps() {
        return this.ipBlockQps;
    }

    public DescribeDomainQpsResponseBody setCcJsQps(java.util.List<String> ccJsQps) {
        this.ccJsQps = ccJsQps;
        return this;
    }
    public java.util.List<String> getCcJsQps() {
        return this.ccJsQps;
    }

    public DescribeDomainQpsResponseBody setBlocks(java.util.List<String> blocks) {
        this.blocks = blocks;
        return this;
    }
    public java.util.List<String> getBlocks() {
        return this.blocks;
    }

    public DescribeDomainQpsResponseBody setPreciseBlocks(java.util.List<String> preciseBlocks) {
        this.preciseBlocks = preciseBlocks;
        return this;
    }
    public java.util.List<String> getPreciseBlocks() {
        return this.preciseBlocks;
    }

    public DescribeDomainQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsResponseBody setPreciseJsQps(java.util.List<String> preciseJsQps) {
        this.preciseJsQps = preciseJsQps;
        return this;
    }
    public java.util.List<String> getPreciseJsQps() {
        return this.preciseJsQps;
    }

    public DescribeDomainQpsResponseBody setTotals(java.util.List<String> totals) {
        this.totals = totals;
        return this;
    }
    public java.util.List<String> getTotals() {
        return this.totals;
    }

    public DescribeDomainQpsResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDomainQpsResponseBody setCcBlockQps(java.util.List<String> ccBlockQps) {
        this.ccBlockQps = ccBlockQps;
        return this;
    }
    public java.util.List<String> getCcBlockQps() {
        return this.ccBlockQps;
    }

    public DescribeDomainQpsResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDomainQpsResponseBody setRegionBlocks(java.util.List<String> regionBlocks) {
        this.regionBlocks = regionBlocks;
        return this;
    }
    public java.util.List<String> getRegionBlocks() {
        return this.regionBlocks;
    }

    public DescribeDomainQpsResponseBody setCacheHits(java.util.List<String> cacheHits) {
        this.cacheHits = cacheHits;
        return this;
    }
    public java.util.List<String> getCacheHits() {
        return this.cacheHits;
    }

}
