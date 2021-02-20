// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsWithCacheResponseBody extends TeaModel {
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

    public static DescribeDomainQpsWithCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsWithCacheResponseBody self = new DescribeDomainQpsWithCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsWithCacheResponseBody setIpBlockQps(java.util.List<String> ipBlockQps) {
        this.ipBlockQps = ipBlockQps;
        return this;
    }
    public java.util.List<String> getIpBlockQps() {
        return this.ipBlockQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setCcJsQps(java.util.List<String> ccJsQps) {
        this.ccJsQps = ccJsQps;
        return this;
    }
    public java.util.List<String> getCcJsQps() {
        return this.ccJsQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setBlocks(java.util.List<String> blocks) {
        this.blocks = blocks;
        return this;
    }
    public java.util.List<String> getBlocks() {
        return this.blocks;
    }

    public DescribeDomainQpsWithCacheResponseBody setPreciseBlocks(java.util.List<String> preciseBlocks) {
        this.preciseBlocks = preciseBlocks;
        return this;
    }
    public java.util.List<String> getPreciseBlocks() {
        return this.preciseBlocks;
    }

    public DescribeDomainQpsWithCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsWithCacheResponseBody setPreciseJsQps(java.util.List<String> preciseJsQps) {
        this.preciseJsQps = preciseJsQps;
        return this;
    }
    public java.util.List<String> getPreciseJsQps() {
        return this.preciseJsQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setTotals(java.util.List<String> totals) {
        this.totals = totals;
        return this;
    }
    public java.util.List<String> getTotals() {
        return this.totals;
    }

    public DescribeDomainQpsWithCacheResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDomainQpsWithCacheResponseBody setCcBlockQps(java.util.List<String> ccBlockQps) {
        this.ccBlockQps = ccBlockQps;
        return this;
    }
    public java.util.List<String> getCcBlockQps() {
        return this.ccBlockQps;
    }

    public DescribeDomainQpsWithCacheResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDomainQpsWithCacheResponseBody setRegionBlocks(java.util.List<String> regionBlocks) {
        this.regionBlocks = regionBlocks;
        return this;
    }
    public java.util.List<String> getRegionBlocks() {
        return this.regionBlocks;
    }

    public DescribeDomainQpsWithCacheResponseBody setCacheHits(java.util.List<String> cacheHits) {
        this.cacheHits = cacheHits;
        return this;
    }
    public java.util.List<String> getCacheHits() {
        return this.cacheHits;
    }

}
