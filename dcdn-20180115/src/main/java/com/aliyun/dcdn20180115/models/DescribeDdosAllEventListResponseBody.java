// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDdosAllEventListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeDdosAllEventListResponseBodyDataList> dataList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Bps")
        public Long bps;

        @NameInMap("Cps")
        public Long cps;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Pps")
        public Long pps;

        @NameInMap("Qps")
        public Long qps;

        @NameInMap("StartTime")
        public String startTime;

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
