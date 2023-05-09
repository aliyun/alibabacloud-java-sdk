// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosEventResponseBody extends TeaModel {
    /**
     * <p>The number of packets at the start of the DDoS attack. Unit: packets per second (PPS).</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeDdosEventResponseBodyEvents> events;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the DDoS attack started. This value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
         * <br>
         * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("Ip")
        public String ip;

        /**
         * <p>WB269094</p>
         */
        @NameInMap("Mbps")
        public Integer mbps;

        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>DescribeDdosEvent</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>Queries the details about the DDoS attack events that occurred on a specific Anti-DDoS Origin instance.</p>
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
