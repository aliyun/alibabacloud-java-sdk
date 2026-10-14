// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListResponseBody extends TeaModel {
    /**
     * <p>The list of attack events.</p>
     */
    @NameInMap("AttackEvents")
    public java.util.List<DescribeDDosAllEventListResponseBodyAttackEvents> attackEvents;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25D83ED5-28CB-5683-9CF7-AECE521F3005</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of attack events returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The source region of the attack. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: the Chinese mainland.</li>
         * <li><strong>alb-cn-hongkong-gf-2</strong>: Hong Kong (China).</li>
         * <li><strong>alb-us-west-1-gf-2</strong>: US (Silicon Valley).</li>
         * <li><strong>alb-ap-northeast-1-gf-1</strong>: Japan (Tokyo).</li>
         * <li><strong>alb-ap-southeast-gf-1</strong>: Singapore.</li>
         * <li><strong>alb-eu-central-1-gf-1</strong>: Germany (Frankfurt).</li>
         * <li><strong>alb-eu-west-1-gf-1</strong> and <strong>selb-eu-west-1-gf-1a</strong>: UK (London).</li>
         * <li><strong>alb-us-east-gf-1</strong>: US (Virginia).</li>
         * <li><strong>CT-yundi</strong>: Hong Kong (China). This value applies only to Anti-DDoS Pro and Anti-DDoS Premium secure acceleration line instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The end time of the attack. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634546030</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The type of the DDoS attack event. Valid values:</p>
         * <ul>
         * <li><strong>web-cc</strong>: web resource exhaustion attack.</li>
         * <li><strong>cc</strong>: connection flood attack.</li>
         * <li><strong>defense</strong>: volumetric attack (scrubbing event).</li>
         * <li><strong>blackhole</strong>: volumetric attack (blackhole filtering event).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cc</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The attacked object. The attacked object varies based on the attack event type:</p>
         * <ul>
         * <li>Web resource exhaustion attack (<strong>EventType</strong> is <strong>web-cc</strong>): this parameter indicates the attacked website domain name.</li>
         * <li>Connection flood attack (<strong>EventType</strong> is <strong>cc</strong>): this parameter indicates the attacked IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * <li>Volumetric attack (<strong>EventType</strong> is <strong>defense</strong> or <strong>blackhole</strong>): this parameter indicates the attacked IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The peak bandwidth of the attack traffic. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>101899</p>
         */
        @NameInMap("Mbps")
        public Long mbps;

        /**
         * <p>The attacked port number.</p>
         * <blockquote>
         * <p>This parameter is not returned for web resource exhaustion attacks (<strong>EventType</strong> is <strong>web-cc</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The peak packet forwarding rate of the attack traffic. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>9664270</p>
         */
        @NameInMap("Pps")
        public Long pps;

        /**
         * <p>The start time of the attack. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634543764</p>
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
