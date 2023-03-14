// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsResponseBody extends TeaModel {
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

    public static DescribeDomainQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsResponseBody self = new DescribeDomainQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsResponseBody setBlocks(java.util.List<String> blocks) {
        this.blocks = blocks;
        return this;
    }
    public java.util.List<String> getBlocks() {
        return this.blocks;
    }

    public DescribeDomainQpsResponseBody setCacheHits(java.util.List<String> cacheHits) {
        this.cacheHits = cacheHits;
        return this;
    }
    public java.util.List<String> getCacheHits() {
        return this.cacheHits;
    }

    public DescribeDomainQpsResponseBody setCcBlockQps(java.util.List<String> ccBlockQps) {
        this.ccBlockQps = ccBlockQps;
        return this;
    }
    public java.util.List<String> getCcBlockQps() {
        return this.ccBlockQps;
    }

    public DescribeDomainQpsResponseBody setCcJsQps(java.util.List<String> ccJsQps) {
        this.ccJsQps = ccJsQps;
        return this;
    }
    public java.util.List<String> getCcJsQps() {
        return this.ccJsQps;
    }

    public DescribeDomainQpsResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDomainQpsResponseBody setIpBlockQps(java.util.List<String> ipBlockQps) {
        this.ipBlockQps = ipBlockQps;
        return this;
    }
    public java.util.List<String> getIpBlockQps() {
        return this.ipBlockQps;
    }

    public DescribeDomainQpsResponseBody setPreciseBlocks(java.util.List<String> preciseBlocks) {
        this.preciseBlocks = preciseBlocks;
        return this;
    }
    public java.util.List<String> getPreciseBlocks() {
        return this.preciseBlocks;
    }

    public DescribeDomainQpsResponseBody setPreciseJsQps(java.util.List<String> preciseJsQps) {
        this.preciseJsQps = preciseJsQps;
        return this;
    }
    public java.util.List<String> getPreciseJsQps() {
        return this.preciseJsQps;
    }

    public DescribeDomainQpsResponseBody setRegionBlocks(java.util.List<String> regionBlocks) {
        this.regionBlocks = regionBlocks;
        return this;
    }
    public java.util.List<String> getRegionBlocks() {
        return this.regionBlocks;
    }

    public DescribeDomainQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDomainQpsResponseBody setTotals(java.util.List<String> totals) {
        this.totals = totals;
        return this;
    }
    public java.util.List<String> getTotals() {
        return this.totals;
    }

}
