// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeDomainQpsListResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainQpsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsListResponseBody self = new DescribeDomainQpsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsListResponseBody setDataList(java.util.List<DescribeDomainQpsListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeDomainQpsListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeDomainQpsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainQpsListResponseBodyDataList extends TeaModel {
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

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalQps")
        public Long totalQps;

        public static DescribeDomainQpsListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsListResponseBodyDataList self = new DescribeDomainQpsListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsListResponseBodyDataList setAttackQps(Long attackQps) {
            this.attackQps = attackQps;
            return this;
        }
        public Long getAttackQps() {
            return this.attackQps;
        }

        public DescribeDomainQpsListResponseBodyDataList setCacheHits(Long cacheHits) {
            this.cacheHits = cacheHits;
            return this;
        }
        public Long getCacheHits() {
            return this.cacheHits;
        }

        public DescribeDomainQpsListResponseBodyDataList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeDomainQpsListResponseBodyDataList setMaxAttackQps(Long maxAttackQps) {
            this.maxAttackQps = maxAttackQps;
            return this;
        }
        public Long getMaxAttackQps() {
            return this.maxAttackQps;
        }

        public DescribeDomainQpsListResponseBodyDataList setMaxNormalQps(Long maxNormalQps) {
            this.maxNormalQps = maxNormalQps;
            return this;
        }
        public Long getMaxNormalQps() {
            return this.maxNormalQps;
        }

        public DescribeDomainQpsListResponseBodyDataList setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeDomainQpsListResponseBodyDataList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDomainQpsListResponseBodyDataList setTotalQps(Long totalQps) {
            this.totalQps = totalQps;
            return this;
        }
        public Long getTotalQps() {
            return this.totalQps;
        }

    }

}
