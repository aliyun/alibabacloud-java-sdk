// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeDdosEventResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Events")
    @Validation(required = true)
    public java.util.List<DescribeDdosEventResponseEvents> events;

    public static DescribeDdosEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventResponse self = new DescribeDdosEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosEventResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeDdosEventResponse setEvents(java.util.List<DescribeDdosEventResponseEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeDdosEventResponseEvents> getEvents() {
        return this.events;
    }

    public static class DescribeDdosEventResponseEvents extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public Integer startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Integer endTime;

        @NameInMap("Pps")
        @Validation(required = true)
        public Integer pps;

        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("Mbps")
        @Validation(required = true)
        public Integer mbps;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeDdosEventResponseEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosEventResponseEvents self = new DescribeDdosEventResponseEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDdosEventResponseEvents setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeDdosEventResponseEvents setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeDdosEventResponseEvents setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeDdosEventResponseEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDdosEventResponseEvents setMbps(Integer mbps) {
            this.mbps = mbps;
            return this;
        }
        public Integer getMbps() {
            return this.mbps;
        }

        public DescribeDdosEventResponseEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
