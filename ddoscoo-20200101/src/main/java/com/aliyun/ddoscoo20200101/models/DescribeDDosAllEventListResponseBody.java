// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of attack events.</p>
     */
    @NameInMap("AttackEvents")
    public java.util.List<DescribeDDosAllEventListResponseBodyAttackEvents> attackEvents;

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

    public static DescribeDDosAllEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosAllEventListResponseBody self = new DescribeDDosAllEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosAllEventListResponseBody setAttackEvents(java.util.List<DescribeDDosAllEventListResponseBodyAttackEvents> attackEvents) {
        this.attackEvents = attackEvents;
        return this;
    }
    public java.util.List<DescribeDDosAllEventListResponseBodyAttackEvents> getAttackEvents() {
        return this.attackEvents;
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

    public static class DescribeDDosAllEventListResponseBodyAttackEvents extends TeaModel {
        /**
         * <p>The source location or region from which the attack was initiated. Valid values:</p>
         * <br>
         * <p>*   **cn**: Chinese mainland</p>
         * <p>*   **alb-cn-hongkong-gf-2**: China (Hongkong)</p>
         * <p>*   **alb-us-west-1-gf-2**: US (Silicon Valley)</p>
         * <p>*   **alb-ap-northeast-1-gf-1**: Japan (Tokyo)</p>
         * <p>*   **alb-ap-southeast-gf-1**: Singapore</p>
         * <p>*   **alb-eu-central-1-gf-1**: Germany (Frankfurt)</p>
         * <p>*   **alb-eu-central-1-gf-1** or **selb-eu-west-1-gf-1a**: UK (London)</p>
         * <p>*   **alb-us-east-gf-1**: US (Virginia)</p>
         * <p>*   **CT-yundi**: China (Hongkong) This value is returned only for Anti-DDoS Premium instances of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan.</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The time when the DDoS attack stopped. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The type of the DDoS attack event. Valid values:</p>
         * <br>
         * <p>*   **web-cc**: resource exhaustion attacks</p>
         * <p>*   **cc**: connection flood attacks</p>
         * <p>*   **defense**: DDoS attacks that trigger traffic scrubbing</p>
         * <p>*   **blackhole**: DDoS attacks that trigger blackhole filtering</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The attacked object. The attacked object varies based on the attack event type. The following list describes different attacked objects of different attack event types:</p>
         * <br>
         * <p>*   If **EventType** is set to **web-cc**, the value of this parameter indicates the domain name of the attacked website.</p>
         * <p>*   If **EventType** is set to **cc**, the value of this parameter indicates the IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
         * <p>*   If **EventType** is set to **defense** or **blackhole**, the value of this parameter indicates the IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The peak bandwidth of the attack traffic. Unit: Mbit/s.</p>
         */
        @NameInMap("Mbps")
        public Long mbps;

        /**
         * <p>The attacked port.</p>
         * <br>
         * <p>> If **EventType** is set to **web-cc**, this parameter is not returned.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The peak packet forwarding rate of attack traffic. Unit: packets per second (pps).</p>
         */
        @NameInMap("Pps")
        public Long pps;

        /**
         * <p>The time when the DDoS attack started. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDDosAllEventListResponseBodyAttackEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDosAllEventListResponseBodyAttackEvents self = new DescribeDDosAllEventListResponseBodyAttackEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDDosAllEventListResponseBodyAttackEvents setMbps(Long mbps) {
            this.mbps = mbps;
            return this;
        }
        public Long getMbps() {
            return this.mbps;
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

        public DescribeDDosAllEventListResponseBodyAttackEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
