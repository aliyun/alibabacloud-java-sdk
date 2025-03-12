// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeDomainAttackEventListResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>1670918400</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MaxQps")
        public Long maxQps;

        /**
         * <strong>example:</strong>
         * <p>1666083600</p>
         */
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
