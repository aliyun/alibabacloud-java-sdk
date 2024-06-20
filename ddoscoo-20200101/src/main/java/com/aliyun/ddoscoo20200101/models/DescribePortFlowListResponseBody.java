// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortFlowListResponseBody extends TeaModel {
    /**
     * <p>The returned traffic data.</p>
     */
    @NameInMap("PortFlowList")
    public java.util.List<DescribePortFlowListResponseBodyPortFlowList> portFlowList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FFC77501-BDF8-4BC8-9BF5-B295FBC3189B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortFlowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortFlowListResponseBody self = new DescribePortFlowListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortFlowListResponseBody setPortFlowList(java.util.List<DescribePortFlowListResponseBodyPortFlowList> portFlowList) {
        this.portFlowList = portFlowList;
        return this;
    }
    public java.util.List<DescribePortFlowListResponseBodyPortFlowList> getPortFlowList() {
        return this.portFlowList;
    }

    public DescribePortFlowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortFlowListResponseBodyPortFlowList extends TeaModel {
        /**
         * <p>The bandwidth of attack traffic. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttackBps")
        public Long attackBps;

        /**
         * <p>The packet forwarding rate of attack traffic. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttackPps")
        public Long attackPps;

        /**
         * <p>The inbound bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2176000</p>
         */
        @NameInMap("InBps")
        public Long inBps;

        /**
         * <p>The packet forwarding rate of inbound traffic. Unit: packets per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2934</p>
         */
        @NameInMap("InPps")
        public Long inPps;

        /**
         * <p>The index number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The outbound bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4389</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        /**
         * <p>The packet forwarding rate of outbound traffic. Unit: packets per second (pps).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("OutPps")
        public Long outPps;

        /**
         * <p>The source region of the traffic. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: mainland China</li>
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

        @NameInMap("SlaBpsDropBps")
        public Long slaBpsDropBps;

        @NameInMap("SlaBpsDropPps")
        public Long slaBpsDropPps;

        @NameInMap("SlaConnDropBps")
        public Long slaConnDropBps;

        @NameInMap("SlaConnDropPps")
        public Long slaConnDropPps;

        @NameInMap("SlaCpsDropBps")
        public Long slaCpsDropBps;

        @NameInMap("SlaCpsDropPps")
        public Long slaCpsDropPps;

        @NameInMap("SlaPpsDropBps")
        public Long slaPpsDropBps;

        @NameInMap("SlaPpsDropPps")
        public Long slaPpsDropPps;

        /**
         * <p>The time when the data was collected. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582992000</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribePortFlowListResponseBodyPortFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribePortFlowListResponseBodyPortFlowList self = new DescribePortFlowListResponseBodyPortFlowList();
            return TeaModel.build(map, self);
        }

        public DescribePortFlowListResponseBodyPortFlowList setAttackBps(Long attackBps) {
            this.attackBps = attackBps;
            return this;
        }
        public Long getAttackBps() {
            return this.attackBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setAttackPps(Long attackPps) {
            this.attackPps = attackPps;
            return this;
        }
        public Long getAttackPps() {
            return this.attackPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setInPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }
        public Long getInPps() {
            return this.inPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribePortFlowListResponseBodyPortFlowList setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setOutPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }
        public Long getOutPps() {
            return this.outPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaBpsDropBps(Long slaBpsDropBps) {
            this.slaBpsDropBps = slaBpsDropBps;
            return this;
        }
        public Long getSlaBpsDropBps() {
            return this.slaBpsDropBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaBpsDropPps(Long slaBpsDropPps) {
            this.slaBpsDropPps = slaBpsDropPps;
            return this;
        }
        public Long getSlaBpsDropPps() {
            return this.slaBpsDropPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaConnDropBps(Long slaConnDropBps) {
            this.slaConnDropBps = slaConnDropBps;
            return this;
        }
        public Long getSlaConnDropBps() {
            return this.slaConnDropBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaConnDropPps(Long slaConnDropPps) {
            this.slaConnDropPps = slaConnDropPps;
            return this;
        }
        public Long getSlaConnDropPps() {
            return this.slaConnDropPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaCpsDropBps(Long slaCpsDropBps) {
            this.slaCpsDropBps = slaCpsDropBps;
            return this;
        }
        public Long getSlaCpsDropBps() {
            return this.slaCpsDropBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaCpsDropPps(Long slaCpsDropPps) {
            this.slaCpsDropPps = slaCpsDropPps;
            return this;
        }
        public Long getSlaCpsDropPps() {
            return this.slaCpsDropPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaPpsDropBps(Long slaPpsDropBps) {
            this.slaPpsDropBps = slaPpsDropBps;
            return this;
        }
        public Long getSlaPpsDropBps() {
            return this.slaPpsDropBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setSlaPpsDropPps(Long slaPpsDropPps) {
            this.slaPpsDropPps = slaPpsDropPps;
            return this;
        }
        public Long getSlaPpsDropPps() {
            return this.slaPpsDropPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
