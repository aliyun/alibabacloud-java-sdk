// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandDdosEventResponseBody extends TeaModel {
    /**
     * <p>The list of DDoS events and the details of each event.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeOnDemandDdosEventResponseBodyEvents> events;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6A507DC8-F657-4C13-84E2-D1D1B9400753</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of DDoS events.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeOnDemandDdosEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandDdosEventResponseBody self = new DescribeOnDemandDdosEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandDdosEventResponseBody setEvents(java.util.List<DescribeOnDemandDdosEventResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeOnDemandDdosEventResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeOnDemandDdosEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnDemandDdosEventResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeOnDemandDdosEventResponseBodyEvents extends TeaModel {
        /**
         * <p>The timestamp that indicates the end time of the attack. Unit: seconds. The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, 1 January 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1557891306</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The IP address of the protection target that encounters the DDoS attack.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The throughput of the DDoS attack. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("Mbps")
        public Integer mbps;

        /**
         * <p>The packet forwarding rate of the DDoS attack. Unit: packets per second (PPS).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The timestamp that indicates the start time of the attack. Unit: seconds. The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, 1 January 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1557889506</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>**hole_begin **: indicates that the event is in the blackhole state.</li>
         * <li>**hole_end **: indicates that blackhole ends.</li>
         * <li>**defense_begin **: indicates that the event is in the cleaning state.</li>
         * <li>**defense_end **: indicates that cleaning ends.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defense_end</p>
         */
        @NameInMap("Status")
        public String status;

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

        public DescribeOnDemandDdosEventResponseBodyEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setMbps(Integer mbps) {
            this.mbps = mbps;
            return this;
        }
        public Integer getMbps() {
            return this.mbps;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeOnDemandDdosEventResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
