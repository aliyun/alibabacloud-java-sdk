// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosEventResponseBody extends TeaModel {
    /**
     * <p>The details about the DDoS attack event.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeDdosEventResponseBodyEvents> events;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of DDoS attack events.</p>
     */
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
        /**
         * <p>The time when the DDoS attack stopped. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The attacked IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The volume of the request traffic at the start of the DDoS attack. Unit: Mbit/s.</p>
         */
        @NameInMap("Mbps")
        public Integer mbps;

        /**
         * <p>The number of packets at the start of the DDoS attack. Unit: packets per second (PPS).</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The time when the DDoS attack started. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The status of the DDoS attack event. Valid values:</p>
         * <br>
         * <p>*   **hole_begin**: indicates that blackhole filtering is triggered for the attacked IP address.</p>
         * <p>*   **hole_end**: indicates that blackhole filtering is deactivated for the attacked IP address.</p>
         * <p>*   **defense_begin**: indicates that attack traffic is being scrubbed.</p>
         * <p>*   **defense_end**: indicates that attack traffic is scrubbed.</p>
         */
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
