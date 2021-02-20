// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("AttackEvents")
    public java.util.List<DescribeDDosAllEventListResponseBodyAttackEvents> attackEvents;

    public static DescribeDDosAllEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosAllEventListResponseBody self = new DescribeDDosAllEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosAllEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDosAllEventListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeDDosAllEventListResponseBody setAttackEvents(java.util.List<DescribeDDosAllEventListResponseBodyAttackEvents> attackEvents) {
        this.attackEvents = attackEvents;
        return this;
    }
    public java.util.List<DescribeDDosAllEventListResponseBodyAttackEvents> getAttackEvents() {
        return this.attackEvents;
    }

    public static class DescribeDDosAllEventListResponseBodyAttackEvents extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Mbps")
        public Long mbps;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("Pps")
        public Long pps;

        public static DescribeDDosAllEventListResponseBodyAttackEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDosAllEventListResponseBodyAttackEvents self = new DescribeDDosAllEventListResponseBodyAttackEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setMbps(Long mbps) {
            this.mbps = mbps;
            return this;
        }
        public Long getMbps() {
            return this.mbps;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

    }

}
