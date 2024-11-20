// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSAllEventListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeDDoSAllEventListResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D73A4243-CFBD-5110-876F-09237E77ECBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDDoSAllEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSAllEventListResponseBody self = new DescribeDDoSAllEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSAllEventListResponseBody setDataList(java.util.List<DescribeDDoSAllEventListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeDDoSAllEventListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeDDoSAllEventListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDDoSAllEventListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDDoSAllEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSAllEventListResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeDDoSAllEventListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDDoSAllEventListResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Bps")
        public Long bps;

        @NameInMap("Coverage")
        public String coverage;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Cps")
        public Long cps;

        /**
         * <strong>example:</strong>
         * <p>2023-02-12T15:59:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>web-cc_1</p>
         */
        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventResult")
        public String eventResult;

        /**
         * <strong>example:</strong>
         * <p>web-cc</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("Pps")
        public Long pps;

        /**
         * <strong>example:</strong>
         * <p>7692</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <strong>example:</strong>
         * <p>2023-02-12T15:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>000000000155****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        public static DescribeDDoSAllEventListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSAllEventListResponseBodyDataList self = new DescribeDDoSAllEventListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSAllEventListResponseBodyDataList setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setCps(Long cps) {
            this.cps = cps;
            return this;
        }
        public Long getCps() {
            return this.cps;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setEventResult(String eventResult) {
            this.eventResult = eventResult;
            return this;
        }
        public String getEventResult() {
            return this.eventResult;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeDDoSAllEventListResponseBodyDataList setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

}
