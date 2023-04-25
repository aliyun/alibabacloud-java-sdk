// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeDomainAttackEventListResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeDomainAttackEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackEventListResponseBody self = new DescribeDomainAttackEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackEventListResponseBody setDataList(java.util.List<DescribeDomainAttackEventListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeDomainAttackEventListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeDomainAttackEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAttackEventListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDomainAttackEventListResponseBodyDataList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("MaxQps")
        public Long maxQps;

        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDomainAttackEventListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAttackEventListResponseBodyDataList self = new DescribeDomainAttackEventListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAttackEventListResponseBodyDataList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainAttackEventListResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainAttackEventListResponseBodyDataList setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeDomainAttackEventListResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
