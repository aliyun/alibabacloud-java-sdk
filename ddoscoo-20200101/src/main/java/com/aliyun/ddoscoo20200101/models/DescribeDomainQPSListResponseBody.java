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
        @NameInMap("Index")
        public Long index;

        @NameInMap("Time")
        public Long time;

        @NameInMap("MaxAttackQps")
        public Long maxAttackQps;

        @NameInMap("AttackQps")
        public Long attackQps;

        @NameInMap("MaxQps")
        public Long maxQps;

        @NameInMap("MaxNormalQps")
        public Long maxNormalQps;

        @NameInMap("TotalQps")
        public Long totalQps;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("CacheHits")
        public Long cacheHits;

        public static DescribeDomainQPSListResponseBodyDomainQPSList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQPSListResponseBodyDomainQPSList self = new DescribeDomainQPSListResponseBodyDomainQPSList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setMaxAttackQps(Long maxAttackQps) {
            this.maxAttackQps = maxAttackQps;
            return this;
        }
        public Long getMaxAttackQps() {
            return this.maxAttackQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setAttackQps(Long attackQps) {
            this.attackQps = attackQps;
            return this;
        }
        public Long getAttackQps() {
            return this.attackQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setMaxNormalQps(Long maxNormalQps) {
            this.maxNormalQps = maxNormalQps;
            return this;
        }
        public Long getMaxNormalQps() {
            return this.maxNormalQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setTotalQps(Long totalQps) {
            this.totalQps = totalQps;
            return this;
        }
        public Long getTotalQps() {
            return this.totalQps;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDomainQPSListResponseBodyDomainQPSList setCacheHits(Long cacheHits) {
            this.cacheHits = cacheHits;
            return this;
        }
        public Long getCacheHits() {
            return this.cacheHits;
        }

    }

}
