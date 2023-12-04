// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeTrafficResponseBody extends TeaModel {
    /**
     * <p>The queried traffic statistics.</p>
     */
    @NameInMap("FlowList")
    public java.util.List<DescribeTrafficResponseBodyFlowList> flowList;

    /**
     * <p>The ID of the request.</p>
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
        /**
         * <p>The bandwidth of attack traffic. Unit: bit/s.</p>
         * <br>
         * <p>>  This parameter is returned only if attack traffic exists.</p>
         */
        @NameInMap("AttackBps")
        public Long attackBps;

        /**
         * <p>The packet forwarding rate of attack traffic. Unit: packets per second.</p>
         * <br>
         * <p>>  This parameter is returned only if attack traffic exists.</p>
         */
        @NameInMap("AttackPps")
        public Long attackPps;

        /**
         * <p>The type of the traffic statistics. Valid values:</p>
         * <br>
         * <p>*   **max**: the peak traffic within the specified interval</p>
         * <p>*   **avg**: the average traffic within the specified interval</p>
         */
        @NameInMap("FlowType")
        public String flowType;

        /**
         * <p>The bandwidth of the total traffic. Unit: Kbit/s.</p>
         */
        @NameInMap("Kbps")
        public Integer kbps;

        /**
         * <p>The ID of the traffic statistics.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The packet forwarding rate of the total traffic. Unit: packets per second.</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The time when the traffic statistics are calculated. This value is a UNIX timestamp. Unit: seconds.</p>
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
