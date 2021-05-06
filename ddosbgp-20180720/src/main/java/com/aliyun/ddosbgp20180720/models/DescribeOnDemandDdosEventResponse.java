// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandDdosEventResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Events")
    @Validation(required = true)
    public java.util.List<DescribeOnDemandDdosEventResponseEvents> events;

    public static DescribeOnDemandDdosEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandDdosEventResponse self = new DescribeOnDemandDdosEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandDdosEventResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnDemandDdosEventResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeOnDemandDdosEventResponse setEvents(java.util.List<DescribeOnDemandDdosEventResponseEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeOnDemandDdosEventResponseEvents> getEvents() {
        return this.events;
    }

    public static class DescribeOnDemandDdosEventResponseEvents extends TeaModel {
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

        public static DescribeOnDemandDdosEventResponseEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnDemandDdosEventResponseEvents self = new DescribeOnDemandDdosEventResponseEvents();
            return TeaModel.build(map, self);
        }

        public DescribeOnDemandDdosEventResponseEvents setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeOnDemandDdosEventResponseEvents setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeOnDemandDdosEventResponseEvents setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeOnDemandDdosEventResponseEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeOnDemandDdosEventResponseEvents setMbps(Integer mbps) {
            this.mbps = mbps;
            return this;
        }
        public Integer getMbps() {
            return this.mbps;
        }

        public DescribeOnDemandDdosEventResponseEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
