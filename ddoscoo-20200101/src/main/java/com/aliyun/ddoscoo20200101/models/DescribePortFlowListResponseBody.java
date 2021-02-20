// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortFlowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PortFlowList")
    public java.util.List<DescribePortFlowListResponseBodyPortFlowList> portFlowList;

    public static DescribePortFlowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortFlowListResponseBody self = new DescribePortFlowListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortFlowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortFlowListResponseBody setPortFlowList(java.util.List<DescribePortFlowListResponseBodyPortFlowList> portFlowList) {
        this.portFlowList = portFlowList;
        return this;
    }
    public java.util.List<DescribePortFlowListResponseBodyPortFlowList> getPortFlowList() {
        return this.portFlowList;
    }

    public static class DescribePortFlowListResponseBodyPortFlowList extends TeaModel {
        @NameInMap("Index")
        public Long index;

        @NameInMap("Time")
        public Long time;

        @NameInMap("InPps")
        public Long inPps;

        @NameInMap("InBps")
        public Long inBps;

        @NameInMap("Region")
        public String region;

        @NameInMap("OutPps")
        public Long outPps;

        @NameInMap("AttackPps")
        public Long attackPps;

        @NameInMap("OutBps")
        public Long outBps;

        @NameInMap("AttackBps")
        public Long attackBps;

        public static DescribePortFlowListResponseBodyPortFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribePortFlowListResponseBodyPortFlowList self = new DescribePortFlowListResponseBodyPortFlowList();
            return TeaModel.build(map, self);
        }

        public DescribePortFlowListResponseBodyPortFlowList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribePortFlowListResponseBodyPortFlowList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribePortFlowListResponseBodyPortFlowList setInPps(Long inPps) {
            this.inPps = inPps;
            return this;
        }
        public Long getInPps() {
            return this.inPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePortFlowListResponseBodyPortFlowList setOutPps(Long outPps) {
            this.outPps = outPps;
            return this;
        }
        public Long getOutPps() {
            return this.outPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setAttackPps(Long attackPps) {
            this.attackPps = attackPps;
            return this;
        }
        public Long getAttackPps() {
            return this.attackPps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

        public DescribePortFlowListResponseBodyPortFlowList setAttackBps(Long attackBps) {
            this.attackBps = attackBps;
            return this;
        }
        public Long getAttackBps() {
            return this.attackBps;
        }

    }

}
