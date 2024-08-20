// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDdosAllEventListResponseBody extends TeaModel {
    /**
     * <p>The list of events.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeDdosAllEventListResponseBodyDataList> dataList;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Default value: <strong>10</strong>. Valid values: 5, 10, and 20.</p>
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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeDdosAllEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAllEventListResponseBody self = new DescribeDdosAllEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAllEventListResponseBody setDataList(java.util.List<DescribeDdosAllEventListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeDdosAllEventListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeDdosAllEventListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDdosAllEventListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDdosAllEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosAllEventListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDdosAllEventListResponseBodyDataList extends TeaModel {
        /**
         * <p>The peak attack traffic of volumetric attacks. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Bps")
        public Long bps;

        /**
         * <p>The peak of connection flood attacks. Unit: connections per seconds (CPS).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Cps")
        public Long cps;

        /**
         * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-26T15:59:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28069</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The type of the DDoS attack event that was queried. Valid values:</p>
         * <ul>
         * <li><strong>web-cc</strong>: web resource exhaustion attacks</li>
         * <li><strong>cc</strong>: connection flood attacks</li>
         * <li><strong>traffic</strong>: volumetric attacks</li>
         * <li>If you do not configure this parameter, DDoS attack events of all types are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web-cc</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The peak attack traffic of volumetric attacks. Unit: packets per second (PPS).</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("Pps")
        public Long pps;

        /**
         * <p>The peak of web resource exhaustion attacks. Unit: queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>7692</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-09T10:03:31Z</p>
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

        public static DescribeDdosAllEventListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosAllEventListResponseBodyDataList self = new DescribeDdosAllEventListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosAllEventListResponseBodyDataList setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeDdosAllEventListResponseBodyDataList setCps(Long cps) {
            this.cps = cps;
            return this;
        }
        public Long getCps() {
            return this.cps;
        }

        public DescribeDdosAllEventListResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDdosAllEventListResponseBodyDataList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeDdosAllEventListResponseBodyDataList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeDdosAllEventListResponseBodyDataList setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

        public DescribeDdosAllEventListResponseBodyDataList setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

        public DescribeDdosAllEventListResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDdosAllEventListResponseBodyDataList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

}
