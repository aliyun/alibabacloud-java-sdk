// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServerLoadBalancerListenMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the monitoring data.</p>
     */
    @NameInMap("ServerLoadBalancerMonitorData")
    public java.util.List<DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData> serverLoadBalancerMonitorData;

    public static DescribeServerLoadBalancerListenMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerLoadBalancerListenMonitorResponseBody self = new DescribeServerLoadBalancerListenMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerLoadBalancerListenMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerLoadBalancerListenMonitorResponseBody setServerLoadBalancerMonitorData(java.util.List<DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData> serverLoadBalancerMonitorData) {
        this.serverLoadBalancerMonitorData = serverLoadBalancerMonitorData;
        return this;
    }
    public java.util.List<DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData> getServerLoadBalancerMonitorData() {
        return this.serverLoadBalancerMonitorData;
    }

    public static class DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Acc")
        public Integer acc;

        /**
         * <p>The business time of the log. Logs are collected every minute.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-16 15:00:00</p>
         */
        @NameInMap("BizTime")
        public String bizTime;

        /**
         * <p>The ID of the node to which the ELB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-fuzhou-7</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5rcvo1n1t3hykfhhjwjgqp****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>esk-edge-service-lb-8377****</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The specification of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>elb.s2.medium</p>
         */
        @NameInMap("LoadBalancerSpec")
        public String loadBalancerSpec;

        /**
         * <p>The request protocol, such as http, https, or tcp.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The number of requests with HTTP 2xx status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Reqs2xx")
        public Integer reqs2xx;

        /**
         * <p>The number of requests with HTTP 3xx status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Reqs3xx")
        public Integer reqs3xx;

        /**
         * <p>The number of requests with HTTP 4xx status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Reqs4xx")
        public Integer reqs4xx;

        /**
         * <p>The number of requests with HTTP 5xx status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Reqs5xx")
        public Integer reqs5xx;

        /**
         * <p>The average response time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1037</p>
         */
        @NameInMap("RtAvg")
        public Integer rtAvg;

        /**
         * <p>The VIP of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0****</p>
         */
        @NameInMap("Vip")
        public String vip;

        /**
         * <p>The ID of the tunnel.</p>
         * 
         * <strong>example:</strong>
         * <p>52497</p>
         */
        @NameInMap("Vni")
        public Integer vni;

        /**
         * <p>The VIP port, such as 80, 8080, or 443.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Vport")
        public Integer vport;

        public static DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData self = new DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setAcc(Integer acc) {
            this.acc = acc;
            return this;
        }
        public Integer getAcc() {
            return this.acc;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setLoadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setReqs2xx(Integer reqs2xx) {
            this.reqs2xx = reqs2xx;
            return this;
        }
        public Integer getReqs2xx() {
            return this.reqs2xx;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setReqs3xx(Integer reqs3xx) {
            this.reqs3xx = reqs3xx;
            return this;
        }
        public Integer getReqs3xx() {
            return this.reqs3xx;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setReqs4xx(Integer reqs4xx) {
            this.reqs4xx = reqs4xx;
            return this;
        }
        public Integer getReqs4xx() {
            return this.reqs4xx;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setReqs5xx(Integer reqs5xx) {
            this.reqs5xx = reqs5xx;
            return this;
        }
        public Integer getReqs5xx() {
            return this.reqs5xx;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setRtAvg(Integer rtAvg) {
            this.rtAvg = rtAvg;
            return this;
        }
        public Integer getRtAvg() {
            return this.rtAvg;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setVni(Integer vni) {
            this.vni = vni;
            return this;
        }
        public Integer getVni() {
            return this.vni;
        }

        public DescribeServerLoadBalancerListenMonitorResponseBodyServerLoadBalancerMonitorData setVport(Integer vport) {
            this.vport = vport;
            return this;
        }
        public Integer getVport() {
            return this.vport;
        }

    }

}
