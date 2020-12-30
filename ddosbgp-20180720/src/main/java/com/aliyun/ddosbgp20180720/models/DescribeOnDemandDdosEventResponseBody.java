// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandDdosEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Events")
    public java.util.List<DescribeOnDemandDdosEventResponseBodyEvents> events;

    @NameInMap("Total")
    public Long total;

    public static DescribeOnDemandDdosEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandDdosEventResponseBody self = new DescribeOnDemandDdosEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandDdosEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnDemandDdosEventResponseBody setEvents(java.util.List<DescribeOnDemandDdosEventResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeOnDemandDdosEventResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeOnDemandDdosEventResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeOnDemandDdosEventResponseBodyEvents extends TeaModel {
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("Mbps")
        public Integer mbps;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Pps")
        public Integer pps;

        public static DescribeOnDemandDdosEventResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnDemandDdosEventResponseBodyEvents self = new DescribeOnDemandDdosEventResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setMbps(Integer mbps) {
            this.mbps = mbps;
            return this;
        }
        public Integer getMbps() {
            return this.mbps;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

    }

}
