// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsWithCacheResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the attack QPS.</p>
     */
    @NameInMap("Blocks")
    public java.util.List<String> blocks;

    /**
     * <p>An array consisting of cache hit ratios.</p>
     */
    @NameInMap("CacheHits")
    public java.util.List<String> cacheHits;

    /**
     * <p>An array consisting of the QPS that is blocked by the Frequency Control policy.</p>
     */
    @NameInMap("CcBlockQps")
    public java.util.List<String> ccBlockQps;

    /**
     * <p>An array consisting of the QPS for which the Frequency Control policy triggers Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA).</p>
     */
    @NameInMap("CcJsQps")
    public java.util.List<String> ccJsQps;

    /**
     * <p>The intervals between every two adjacent records. Unit: seconds.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>An array consisting of the QPS that is blocked by the blacklist for domain names.</p>
     */
    @NameInMap("IpBlockQps")
    public java.util.List<String> ipBlockQps;

    /**
     * <p>An array consisting of the QPS that is blocked by the Accurate Access Control policy.</p>
     */
    @NameInMap("PreciseBlocks")
    public java.util.List<String> preciseBlocks;

    /**
     * <p>An array consisting of the QPS for which the Accurate Access Control policy triggers the JavaScript challenge.</p>
     */
    @NameInMap("PreciseJsQps")
    public java.util.List<String> preciseJsQps;

    /**
     * <p>An array consisting of the QPS that is blocked by the Location Blacklist policy.</p>
     */
    @NameInMap("RegionBlocks")
    public java.util.List<String> regionBlocks;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>An array consisting of the total QPS.</p>
     */
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
