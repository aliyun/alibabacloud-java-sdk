// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortFlowListResponseBody extends TeaModel {
    @NameInMap("PortFlowList")
    public java.util.List<DescribePortFlowListResponseBodyPortFlowList> portFlowList;

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
        @NameInMap("AttackBps")
        public Long attackBps;

        @NameInMap("AttackPps")
        public Long attackPps;

        @NameInMap("InBps")
        public Long inBps;

        @NameInMap("InPps")
        public Long inPps;

        @NameInMap("Index")
        public Long index;

        @NameInMap("OutBps")
        public Long outBps;

        @NameInMap("OutPps")
        public Long outPps;

        @NameInMap("Region")
        public String region;

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

        public DescribePortFlowListResponseBodyPortFlowList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
