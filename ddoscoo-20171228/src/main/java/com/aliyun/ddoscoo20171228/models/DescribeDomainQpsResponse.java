// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Interval")
    @Validation(required = true)
    public Integer interval;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("Totals")
    @Validation(required = true)
    public java.util.List<String> totals;

    @NameInMap("Blocks")
    @Validation(required = true)
    public java.util.List<String> blocks;

    @NameInMap("CacheHits")
    @Validation(required = true)
    public java.util.List<String> cacheHits;

    @NameInMap("PreciseBlocks")
    @Validation(required = true)
    public java.util.List<String> preciseBlocks;

    @NameInMap("RegionBlocks")
    @Validation(required = true)
    public java.util.List<String> regionBlocks;

    @NameInMap("IpBlockQps")
    @Validation(required = true)
    public java.util.List<String> ipBlockQps;

    @NameInMap("CcJsQps")
    @Validation(required = true)
    public java.util.List<String> ccJsQps;

    @NameInMap("PreciseJsQps")
    @Validation(required = true)
    public java.util.List<String> preciseJsQps;

    @NameInMap("CcBlockQps")
    @Validation(required = true)
    public java.util.List<String> ccBlockQps;

    public static DescribeDomainQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsResponse self = new DescribeDomainQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsResponse setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDomainQpsResponse setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDomainQpsResponse setTotals(java.util.List<String> totals) {
        this.totals = totals;
        return this;
    }
    public java.util.List<String> getTotals() {
        return this.totals;
    }

    public DescribeDomainQpsResponse setBlocks(java.util.List<String> blocks) {
        this.blocks = blocks;
        return this;
    }
    public java.util.List<String> getBlocks() {
        return this.blocks;
    }

    public DescribeDomainQpsResponse setCacheHits(java.util.List<String> cacheHits) {
        this.cacheHits = cacheHits;
        return this;
    }
    public java.util.List<String> getCacheHits() {
        return this.cacheHits;
    }

    public DescribeDomainQpsResponse setPreciseBlocks(java.util.List<String> preciseBlocks) {
        this.preciseBlocks = preciseBlocks;
        return this;
    }
    public java.util.List<String> getPreciseBlocks() {
        return this.preciseBlocks;
    }

    public DescribeDomainQpsResponse setRegionBlocks(java.util.List<String> regionBlocks) {
        this.regionBlocks = regionBlocks;
        return this;
    }
    public java.util.List<String> getRegionBlocks() {
        return this.regionBlocks;
    }

    public DescribeDomainQpsResponse setIpBlockQps(java.util.List<String> ipBlockQps) {
        this.ipBlockQps = ipBlockQps;
        return this;
    }
    public java.util.List<String> getIpBlockQps() {
        return this.ipBlockQps;
    }

    public DescribeDomainQpsResponse setCcJsQps(java.util.List<String> ccJsQps) {
        this.ccJsQps = ccJsQps;
        return this;
    }
    public java.util.List<String> getCcJsQps() {
        return this.ccJsQps;
    }

    public DescribeDomainQpsResponse setPreciseJsQps(java.util.List<String> preciseJsQps) {
        this.preciseJsQps = preciseJsQps;
        return this;
    }
    public java.util.List<String> getPreciseJsQps() {
        return this.preciseJsQps;
    }

    public DescribeDomainQpsResponse setCcBlockQps(java.util.List<String> ccBlockQps) {
        this.ccBlockQps = ccBlockQps;
        return this;
    }
    public java.util.List<String> getCcBlockQps() {
        return this.ccBlockQps;
    }

}
