// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeTrafficResponseBody extends TeaModel {
    /**
     * <p>The ID of the traffic statistics.</p>
     */
    @NameInMap("FlowList")
    public java.util.List<DescribeTrafficResponseBodyFlowList> flowList;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficResponseBody self = new DescribeTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficResponseBody setFlowList(java.util.List<DescribeTrafficResponseBodyFlowList> flowList) {
        this.flowList = flowList;
        return this;
    }
    public java.util.List<DescribeTrafficResponseBodyFlowList> getFlowList() {
        return this.flowList;
    }

    public DescribeTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTrafficResponseBodyFlowList extends TeaModel {
        @NameInMap("AttackBps")
        public Long attackBps;

        /**
         * <p>Queries traffic statistics of an Anti-DDoS Origin instance within a specific time period.</p>
         */
        @NameInMap("AttackPps")
        public Long attackPps;

        /**
         * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
         * <br>
         * <p>For more information about sample requests, see the "**Examples**" section of this topic.</p>
         */
        @NameInMap("FlowType")
        public String flowType;

        @NameInMap("Kbps")
        public Integer kbps;

        /**
         * <p>DescribeTraffic</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>WB269094</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Time")
        public Integer time;

        public static DescribeTrafficResponseBodyFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficResponseBodyFlowList self = new DescribeTrafficResponseBodyFlowList();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficResponseBodyFlowList setAttackBps(Long attackBps) {
            this.attackBps = attackBps;
            return this;
        }
        public Long getAttackBps() {
            return this.attackBps;
        }

        public DescribeTrafficResponseBodyFlowList setAttackPps(Long attackPps) {
            this.attackPps = attackPps;
            return this;
        }
        public Long getAttackPps() {
            return this.attackPps;
        }

        public DescribeTrafficResponseBodyFlowList setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public DescribeTrafficResponseBodyFlowList setKbps(Integer kbps) {
            this.kbps = kbps;
            return this;
        }
        public Integer getKbps() {
            return this.kbps;
        }

        public DescribeTrafficResponseBodyFlowList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTrafficResponseBodyFlowList setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeTrafficResponseBodyFlowList setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

    }

}
