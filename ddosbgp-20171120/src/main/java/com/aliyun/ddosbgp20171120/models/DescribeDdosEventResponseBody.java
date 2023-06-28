// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeDdosEventResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<DescribeDdosEventResponseBodyEvents> events;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeDdosEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventResponseBody self = new DescribeDdosEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventResponseBody setEvents(java.util.List<DescribeDdosEventResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeDdosEventResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeDdosEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosEventResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDdosEventResponseBodyEvents extends TeaModel {
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Mbps")
        public Integer mbps;

        @NameInMap("Pps")
        public Integer pps;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeDdosEventResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosEventResponseBodyEvents self = new DescribeDdosEventResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDdosEventResponseBodyEvents setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeDdosEventResponseBodyEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDdosEventResponseBodyEvents setMbps(Integer mbps) {
            this.mbps = mbps;
            return this;
        }
        public Integer getMbps() {
            return this.mbps;
        }

        public DescribeDdosEventResponseBodyEvents setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeDdosEventResponseBodyEvents setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeDdosEventResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
