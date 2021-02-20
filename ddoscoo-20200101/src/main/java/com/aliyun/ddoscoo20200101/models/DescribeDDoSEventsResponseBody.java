// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("DDoSEvents")
    public java.util.List<DescribeDDoSEventsResponseBodyDDoSEvents> DDoSEvents;

    public static DescribeDDoSEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSEventsResponseBody self = new DescribeDDoSEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSEventsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeDDoSEventsResponseBody setDDoSEvents(java.util.List<DescribeDDoSEventsResponseBodyDDoSEvents> DDoSEvents) {
        this.DDoSEvents = DDoSEvents;
        return this;
    }
    public java.util.List<DescribeDDoSEventsResponseBodyDDoSEvents> getDDoSEvents() {
        return this.DDoSEvents;
    }

    public static class DescribeDDoSEventsResponseBodyDDoSEvents extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Region")
        public String region;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("Bps")
        public Long bps;

        @NameInMap("Pps")
        public Long pps;

        public static DescribeDDoSEventsResponseBodyDDoSEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSEventsResponseBodyDDoSEvents self = new DescribeDDoSEventsResponseBodyDDoSEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

    }

}
