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
     * 
     * <strong>example:</strong>
     * <p>6A507DC8-F657-4C13-84E2-D1D1B9400753</p>
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
         * <blockquote>
         * <p> This parameter is returned only if attack traffic exists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttackBps")
        public Long attackBps;

        /**
         * <p>The packet forwarding rate of attack traffic. Unit: packets per second.</p>
         * <blockquote>
         * <p> This parameter is returned only if attack traffic exists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttackPps")
        public Long attackPps;

        /**
         * <p>The type of the traffic statistics. Valid values:</p>
         * <ul>
         * <li><strong>max</strong>: the peak traffic within the specified interval</li>
         * <li><strong>avg</strong>: the average traffic within the specified interval</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>max</p>
         */
        @NameInMap("FlowType")
        public String flowType;

        /**
         * <p>The bandwidth of the total traffic. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>417</p>
         */
        @NameInMap("Kbps")
        public Integer kbps;

        /**
         * <p>The ID of the traffic statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>8e33f19e-5644-11eb-b5c1-d89d67182200</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The packet forwarding rate of the total traffic. Unit: packets per second.</p>
         * 
         * <strong>example:</strong>
         * <p>274</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The time when the traffic statistics are calculated. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620951900</p>
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
