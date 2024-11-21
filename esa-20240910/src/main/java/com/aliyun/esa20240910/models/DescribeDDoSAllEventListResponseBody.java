// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSAllEventListResponseBody extends TeaModel {
    /**
     * <p>The DDoS attack events.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeDDoSAllEventListResponseBodyDataList> dataList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D73A4243-CFBD-5110-876F-09237E77ECBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
         * <p>The peak of volumetric attacks. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Bps")
        public Long bps;

        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The peak of connection flood attacks. Unit: connections per seconds (CPS).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Cps")
        public Long cps;

        /**
         * <p>The time when the DDoS attack ends.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-12T15:59:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The attack event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>web-cc_1</p>
         */
        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventResult")
        public String eventResult;

        /**
         * <p>The type of DDoS attacks that was queried. Valid values:</p>
         * <ul>
         * <li><strong>web-cc</strong>: web resource exhaustion attacks.</li>
         * <li><strong>cc</strong>: connection flood attacks.</li>
         * <li><strong>traffic</strong>: volumetric attacks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web-cc</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The peak of volumetric attacks. Unit: packets per second (PPS).</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("Pps")
        public Long pps;

        /**
         * <p>The peak QPS of web resource exhaustion attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>7692</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>The time when the DDoS attack starts.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-12T15:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The attack target.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The ID of the web resource exhaustion attack target.</p>
         * 
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
