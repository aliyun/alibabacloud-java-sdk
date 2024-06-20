// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventsResponseBody extends TeaModel {
    /**
     * <p>The DDoS attack events.</p>
     */
    @NameInMap("DDoSEvents")
    public java.util.List<DescribeDDoSEventsResponseBodyDDoSEvents> DDoSEvents;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0CA72AF5-1795-4350-8C77-50A448A2F334</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned attack events.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeDDoSEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSEventsResponseBody self = new DescribeDDoSEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSEventsResponseBody setDDoSEvents(java.util.List<DescribeDDoSEventsResponseBodyDDoSEvents> DDoSEvents) {
        this.DDoSEvents = DDoSEvents;
        return this;
    }
    public java.util.List<DescribeDDoSEventsResponseBodyDDoSEvents> getDDoSEvents() {
        return this.DDoSEvents;
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

    public static class DescribeDDoSEventsResponseBodyDDoSEvents extends TeaModel {
        /**
         * <p>The bandwidth of attack traffic. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bps")
        public Long bps;

        /**
         * <p>The time when the DDoS attack stopped. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1583933330</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The type of the attack event. Valid values:</p>
         * <ul>
         * <li><strong>defense</strong>: traffic scrubbing events</li>
         * <li><strong>blackhole</strong>: blackhole filtering events</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blackhole</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The attacked IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>203.<em><strong>.</strong></em>.132</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The attacked port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The packet forwarding rate of attack traffic. Unit: packets per second (pps).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Pps")
        public Long pps;

        /**
         * <p>The region from which the attack was launched. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: a region in the Chinese mainland</li>
         * <li><strong>alb-ap-northeast-1-gf-x</strong>: Japan (Tokyo)</li>
         * <li><strong>alb-ap-southeast-gf-x</strong>: Singapore</li>
         * <li><strong>alb-cn-hongkong-gf-x</strong>: Hong Kong (China)</li>
         * <li><strong>alb-eu-central-1-gf-x</strong>: Germany (Frankfurt)</li>
         * <li><strong>alb-us-west-1-gf-x</strong>: US (Silicon Valley)</li>
         * </ul>
         * <blockquote>
         * <p>The values except <strong>cn</strong> are returned only when <strong>RegionId</strong> is set to <strong>ap-southeast-1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the DDoS attack started. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1583933277</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDDoSEventsResponseBodyDDoSEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSEventsResponseBodyDDoSEvents self = new DescribeDDoSEventsResponseBodyDDoSEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
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

        public DescribeDDoSEventsResponseBodyDDoSEvents setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDDoSEventsResponseBodyDDoSEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
