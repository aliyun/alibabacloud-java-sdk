// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSAllEventListResponseBody extends TeaModel {
    /**
     * <p>A list of DDoS attack event details.</p>
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
     * <p>The page size.</p>
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
     * <p>The site ID.</p>
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
         * <p>The peak bits per second (Bps) of a volumetric attack.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Bps")
        public Long bps;

        /**
         * <p>The attack region. Valid values:</p>
         * <ul>
         * <li><p><strong>domestic</strong>: Chinese mainland.</p>
         * </li>
         * <li><p><strong>global</strong>: Global.</p>
         * </li>
         * <li><p><strong>overseas</strong>: global (excluding Chinese mainland).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The peak connections per second (Cps) of a connection-based attack.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Cps")
        public Long cps;

        /**
         * <p>The end time of the DDoS attack event.</p>
         * <p>The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-12T15:59:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>web-cc_1</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event result. Valid values:</p>
         * <ul>
         * <li><p><strong>clean</strong>: The attack was successfully cleaned.</p>
         * </li>
         * <li><p><strong>ratelimit</strong>: Rate limiting was applied.</p>
         * </li>
         * <li><p><strong>blackhole</strong>: Blackhole filtering was triggered.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clean</p>
         */
        @NameInMap("EventResult")
        public String eventResult;

        /**
         * <p>The type of the DDoS attack event. Valid values:</p>
         * <ul>
         * <li><p><strong>web-cc</strong>: A web resource exhaustion attack.</p>
         * </li>
         * <li><p><strong>cc</strong>: A connection-based attack.</p>
         * </li>
         * <li><p><strong>traffic</strong>: A volumetric attack.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web-cc</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The peak packets per second (Pps) of a volumetric attack.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("Pps")
        public Long pps;

        /**
         * <p>The peak queries per second (Qps) of a web resource exhaustion attack.</p>
         * 
         * <strong>example:</strong>
         * <p>7692</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>The start time of the DDoS attack event.</p>
         * <p>The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is in UTC.</p>
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
         * <p>The ID of the attack target.</p>
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
