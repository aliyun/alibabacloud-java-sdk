// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenMonitorResponseBody extends TeaModel {
    /**
     * <p>The TCP/UDP monitoring data of the ELB instance.</p>
     */
    @NameInMap("LoadBalancerMonitorListenData")
    public java.util.List<DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData> loadBalancerMonitorListenData;

    /**
     * <p>Id of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLoadBalancerListenMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenMonitorResponseBody self = new DescribeLoadBalancerListenMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenMonitorResponseBody setLoadBalancerMonitorListenData(java.util.List<DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData> loadBalancerMonitorListenData) {
        this.loadBalancerMonitorListenData = loadBalancerMonitorListenData;
        return this;
    }
    public java.util.List<DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData> getLoadBalancerMonitorListenData() {
        return this.loadBalancerMonitorListenData;
    }

    public DescribeLoadBalancerListenMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData extends TeaModel {
        /**
         * <p>The number of active connections.</p>
         * 
         * <strong>example:</strong>
         * <p>80285</p>
         */
        @NameInMap("ActConns")
        public String actConns;

        /**
         * <p>The business time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15 16:03:00</p>
         */
        @NameInMap("BizTime")
        public String bizTime;

        /**
         * <p>The number of new connections.</p>
         * 
         * <strong>example:</strong>
         * <p>37150</p>
         */
        @NameInMap("Conns")
        public String conns;

        /**
         * <p>The number of dropped connections.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DropConns")
        public String dropConns;

        /**
         * <p>The ID of the node to which the ELB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-dongguan-9</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The number of inactive connections.</p>
         * 
         * <strong>example:</strong>
         * <p>16322</p>
         */
        @NameInMap("InActConns")
        public String inActConns;

        /**
         * <p>The inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>67532</p>
         */
        @NameInMap("InBytes")
        public String inBytes;

        /**
         * <p>The dropped inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>324</p>
         */
        @NameInMap("InDropBytes")
        public String inDropBytes;

        /**
         * <p>The number of dropped inbound packets.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("InDropPkts")
        public String inDropPkts;

        /**
         * <p>The number of inbound packets.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("InPkts")
        public String inPkts;

        /**
         * <p>The number of unavailable servers that are attached to the monitored ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InValidRsNum")
        public String inValidRsNum;

        /**
         * <p>The ID of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5q73cv04zeyh43lh74lp4****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>5155487</p>
         */
        @NameInMap("OutBytes")
        public String outBytes;

        /**
         * <p>The dropped outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutDropBytes")
        public String outDropBytes;

        /**
         * <p>The number of dropped outbound packets.</p>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        @NameInMap("OutDropPkts")
        public String outDropPkts;

        /**
         * <p>The number of outbound packets.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("OutPkts")
        public String outPkts;

        /**
         * <p>The network protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The VIP port of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("VPort")
        public String VPort;

        /**
         * <p>The number of available servers that are attached to the monitored ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ValidRsNum")
        public String validRsNum;

        /**
         * <p>The virtual IP address (VIP) of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.8.<em>.</em></p>
         */
        @NameInMap("Vip")
        public String vip;

        /**
         * <p>The ID of the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>53284</p>
         */
        @NameInMap("Vni")
        public String vni;

        public static DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData self = new DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setActConns(String actConns) {
            this.actConns = actConns;
            return this;
        }
        public String getActConns() {
            return this.actConns;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setConns(String conns) {
            this.conns = conns;
            return this;
        }
        public String getConns() {
            return this.conns;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setDropConns(String dropConns) {
            this.dropConns = dropConns;
            return this;
        }
        public String getDropConns() {
            return this.dropConns;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setInActConns(String inActConns) {
            this.inActConns = inActConns;
            return this;
        }
        public String getInActConns() {
            return this.inActConns;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setInBytes(String inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public String getInBytes() {
            return this.inBytes;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setInDropBytes(String inDropBytes) {
            this.inDropBytes = inDropBytes;
            return this;
        }
        public String getInDropBytes() {
            return this.inDropBytes;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setInDropPkts(String inDropPkts) {
            this.inDropPkts = inDropPkts;
            return this;
        }
        public String getInDropPkts() {
            return this.inDropPkts;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setInPkts(String inPkts) {
            this.inPkts = inPkts;
            return this;
        }
        public String getInPkts() {
            return this.inPkts;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setInValidRsNum(String inValidRsNum) {
            this.inValidRsNum = inValidRsNum;
            return this;
        }
        public String getInValidRsNum() {
            return this.inValidRsNum;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setOutBytes(String outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public String getOutBytes() {
            return this.outBytes;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setOutDropBytes(String outDropBytes) {
            this.outDropBytes = outDropBytes;
            return this;
        }
        public String getOutDropBytes() {
            return this.outDropBytes;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setOutDropPkts(String outDropPkts) {
            this.outDropPkts = outDropPkts;
            return this;
        }
        public String getOutDropPkts() {
            return this.outDropPkts;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setOutPkts(String outPkts) {
            this.outPkts = outPkts;
            return this;
        }
        public String getOutPkts() {
            return this.outPkts;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setVPort(String VPort) {
            this.VPort = VPort;
            return this;
        }
        public String getVPort() {
            return this.VPort;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setValidRsNum(String validRsNum) {
            this.validRsNum = validRsNum;
            return this;
        }
        public String getValidRsNum() {
            return this.validRsNum;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeLoadBalancerListenMonitorResponseBodyLoadBalancerMonitorListenData setVni(String vni) {
            this.vni = vni;
            return this;
        }
        public String getVni() {
            return this.vni;
        }

    }

}
