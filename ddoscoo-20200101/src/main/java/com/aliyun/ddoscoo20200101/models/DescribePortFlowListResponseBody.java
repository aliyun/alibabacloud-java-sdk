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
         */
        @NameInMap("AttackBps")
        public Long attackBps;

        /**
         * <p>The packet forwarding rate of attack traffic. Unit: pps.</p>
         */
        @NameInMap("AttackPps")
        public Long attackPps;

        /**
         * <p>The inbound bandwidth. Unit: bit/s.</p>
         */
        @NameInMap("InBps")
        public Long inBps;

        /**
         * <p>The packet forwarding rate of inbound traffic. Unit: packets per second.</p>
         */
        @NameInMap("InPps")
        public Long inPps;

        /**
         * <p>The index number of the returned data.</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The outbound bandwidth. Unit: bit/s.</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        /**
         * <p>The packet forwarding rate of outbound traffic. Unit: packets per second (pps).</p>
         */
        @NameInMap("OutPps")
        public Long outPps;

        /**
         * <p>The source region of the traffic. Valid values:</p>
         * <br>
         * <p>*   **cn**: mainland China</p>
         * <p>*   **alb-ap-northeast-1-gf-x**: Japan (Tokyo)</p>
         * <p>*   **alb-ap-southeast-gf-x**: Singapore</p>
         * <p>*   **alb-cn-hongkong-gf-x**: Hong Kong (China)</p>
         * <p>*   **alb-eu-central-1-gf-x**: Germany (Frankfurt)</p>
         * <p>*   **alb-us-west-1-gf-x**: US (Silicon Valley)</p>
         * <br>
         * <p>> The values except **cn** are returned only when **RegionId** is set to **ap-southeast-1**.</p>
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
