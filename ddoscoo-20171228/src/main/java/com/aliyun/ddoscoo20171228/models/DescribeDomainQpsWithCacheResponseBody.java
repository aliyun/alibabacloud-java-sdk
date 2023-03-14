// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsWithCacheResponseBody extends TeaModel {
    @NameInMap("Blocks")
    public java.util.List<String> blocks;

    @NameInMap("CacheHits")
    public java.util.List<String> cacheHits;

    @NameInMap("CcBlockQps")
    public java.util.List<String> ccBlockQps;

    @NameInMap("CcJsQps")
    public java.util.List<String> ccJsQps;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IpBlockQps")
    public java.util.List<String> ipBlockQps;

    @NameInMap("PreciseBlocks")
    public java.util.List<String> preciseBlocks;

    @NameInMap("PreciseJsQps")
    public java.util.List<String> preciseJsQps;

    @NameInMap("RegionBlocks")
    public java.util.List<String> regionBlocks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Totals")
    public java.util.List<String> totals;

    public static DescribeDomainQpsWithCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsWithCacheResponseBody self = new DescribeDomainQpsWithCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsWithCacheResponseBody setBlocks(java.util.List<String> blocks) {
        this.blocks = blocks;
        return this;
    }
    public java.util.List<String> getBlocks() {
        return this.blocks;
    }

    public DescribeDomainQpsWithCacheResponseBody setCacheHits(java.util.List<String> cacheHits) {
        this.cacheHits = cacheHits;
        return this;
    }
    public java.util.List<String> getCacheHits() {
        return this.cacheHits;
    }

    public DescribeDomainQpsWithCacheResponseBody setCcBlockQps(java.util.List<String> ccBlockQps) {
        this.ccBlockQps = ccBlockQps;
        return this;
    }
    public java.util.List<String> getCcBlockQps() {
        return this.ccBlockQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setCcJsQps(java.util.List<String> ccJsQps) {
        this.ccJsQps = ccJsQps;
        return this;
    }
    public java.util.List<String> getCcJsQps() {
        return this.ccJsQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDomainQpsWithCacheResponseBody setIpBlockQps(java.util.List<String> ipBlockQps) {
        this.ipBlockQps = ipBlockQps;
        return this;
    }
    public java.util.List<String> getIpBlockQps() {
        return this.ipBlockQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setPreciseBlocks(java.util.List<String> preciseBlocks) {
        this.preciseBlocks = preciseBlocks;
        return this;
    }
    public java.util.List<String> getPreciseBlocks() {
        return this.preciseBlocks;
    }

    public DescribeDomainQpsWithCacheResponseBody setPreciseJsQps(java.util.List<String> preciseJsQps) {
        this.preciseJsQps = preciseJsQps;
        return this;
    }
    public java.util.List<String> getPreciseJsQps() {
        return this.preciseJsQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setRegionBlocks(java.util.List<String> regionBlocks) {
        this.regionBlocks = regionBlocks;
        return this;
    }
    public java.util.List<String> getRegionBlocks() {
        return this.regionBlocks;
    }

    public DescribeDomainQpsWithCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsWithCacheResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDomainQpsWithCacheResponseBody setTotals(java.util.List<String> totals) {
        this.totals = totals;
        return this;
    }
    public java.util.List<String> getTotals() {
        return this.totals;
    }

}
