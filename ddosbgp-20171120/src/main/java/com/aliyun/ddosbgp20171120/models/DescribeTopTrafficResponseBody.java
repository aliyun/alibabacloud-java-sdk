// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeTopTrafficResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The information about the traffic that is forwarded by the on-demand instance.</p>
     */
    @NameInMap("TrafficList")
    public java.util.List<DescribeTopTrafficResponseBodyTrafficList> trafficList;

    public static DescribeTopTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopTrafficResponseBody self = new DescribeTopTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopTrafficResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeTopTrafficResponseBody setTrafficList(java.util.List<DescribeTopTrafficResponseBodyTrafficList> trafficList) {
        this.trafficList = trafficList;
        return this;
    }
    public java.util.List<DescribeTopTrafficResponseBodyTrafficList> getTrafficList() {
        return this.trafficList;
    }

    public static class DescribeTopTrafficResponseBodyTrafficList extends TeaModel {
        /**
         * <p>The attack traffic. Unit: Kbit/s.</p>
         */
        @NameInMap("AttackBps")
        public Integer attackBps;

        /**
         * <p>The number of attack data packets. Unit: packets per second (pps).</p>
         */
        @NameInMap("AttackPps")
        public Integer attackPps;

        /**
         * <p>The total traffic. Unit: Kbit/s.</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>The IP address from which the most traffic is forwarded by the on-demand instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The total number of data packets. Unit: pps.</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        public static DescribeTopTrafficResponseBodyTrafficList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopTrafficResponseBodyTrafficList self = new DescribeTopTrafficResponseBodyTrafficList();
            return TeaModel.build(map, self);
        }

        public DescribeTopTrafficResponseBodyTrafficList setAttackBps(Integer attackBps) {
            this.attackBps = attackBps;
            return this;
        }
        public Integer getAttackBps() {
            return this.attackBps;
        }

        public DescribeTopTrafficResponseBodyTrafficList setAttackPps(Integer attackPps) {
            this.attackPps = attackPps;
            return this;
        }
        public Integer getAttackPps() {
            return this.attackPps;
        }

        public DescribeTopTrafficResponseBodyTrafficList setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public DescribeTopTrafficResponseBodyTrafficList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeTopTrafficResponseBodyTrafficList setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

    }

}
