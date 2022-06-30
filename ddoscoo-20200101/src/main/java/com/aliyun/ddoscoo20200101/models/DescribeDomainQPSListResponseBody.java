// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainQPSListResponseBody extends TeaModel {
    @NameInMap("DomainQPSList")
    public java.util.List<DescribeDomainQPSListResponseBodyDomainQPSList> domainQPSList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainQPSListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQPSListResponseBody self = new DescribeDomainQPSListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQPSListResponseBody setDomainQPSList(java.util.List<DescribeDomainQPSListResponseBodyDomainQPSList> domainQPSList) {
        this.domainQPSList = domainQPSList;
        return this;
    }
    public java.util.List<DescribeDomainQPSListResponseBodyDomainQPSList> getDomainQPSList() {
        return this.domainQPSList;
    }

    public DescribeDomainQPSListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainQPSListResponseBodyDomainQPSList extends TeaModel {
        @NameInMap("AttackQps")
        public Long attackQps;

        @NameInMap("CacheHits")
        public Long cacheHits;

        @NameInMap("Index")
        public Long index;

        @NameInMap("MaxAttackQps")
        public Long maxAttackQps;

        @NameInMap("MaxNormalQps")
        public Long maxNormalQps;

        @NameInMap("MaxQps")
        public Long maxQps;

        @NameInMap("Time")
        public Long time;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalQps")
        public Long totalQps;

        public static DescribeDomainQPSListResponseBodyDomainQPSList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQPSListResponseBodyDomainQPSList self = new DescribeDomainQPSListResponseBodyDomainQPSList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setAttackQps(Long attackQps) {
            this.attackQps = attackQps;
            return this;
        }
        public Long getAttackQps() {
            return this.attackQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setCacheHits(Long cacheHits) {
            this.cacheHits = cacheHits;
            return this;
        }
        public Long getCacheHits() {
            return this.cacheHits;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setMaxAttackQps(Long maxAttackQps) {
            this.maxAttackQps = maxAttackQps;
            return this;
        }
        public Long getMaxAttackQps() {
            return this.maxAttackQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setMaxNormalQps(Long maxNormalQps) {
            this.maxNormalQps = maxNormalQps;
            return this;
        }
        public Long getMaxNormalQps() {
            return this.maxNormalQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setTotalQps(Long totalQps) {
            this.totalQps = totalQps;
            return this;
        }
        public Long getTotalQps() {
            return this.totalQps;
        }

    }

}
