// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServerLoadBalancerMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the monitoring data.</p>
     */
    @NameInMap("ServerLoadBalancerMonitorData")
    public java.util.List<DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData> serverLoadBalancerMonitorData;

    public static DescribeServerLoadBalancerMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerLoadBalancerMonitorResponseBody self = new DescribeServerLoadBalancerMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerLoadBalancerMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerLoadBalancerMonitorResponseBody setServerLoadBalancerMonitorData(java.util.List<DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData> serverLoadBalancerMonitorData) {
        this.serverLoadBalancerMonitorData = serverLoadBalancerMonitorData;
        return this;
    }
    public java.util.List<DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData> getServerLoadBalancerMonitorData() {
        return this.serverLoadBalancerMonitorData;
    }

    public static class DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Acc")
        public Integer acc;

        /**
         * <p>The business time of the log. Logs are collected every minute.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-15 16:00:00</p>
         */
        @NameInMap("BizTime")
        public String bizTime;

        /**
         * <p>The ID of the node to which the ELB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wuxi-10</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5sc1s9zrui8lpb8u7cl4f****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>esk-edge-service-lb-a34****</p>
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
         * <p>The number of requests with HTTP 2xx status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
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
         * <p>5</p>
         */
        @NameInMap("Reqs4xx")
        public Integer reqs4xx;

        /**
         * <p>The number of requests with HTTP 5xx status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Reqs5xx")
        public Integer reqs5xx;

        /**
         * <p>The average response time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1404</p>
         */
        @NameInMap("RtAvg")
        public Integer rtAvg;

        /**
         * <p>The virtual IP address (VIP) of the instance.</p>
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
         * <p>3018</p>
         */
        @NameInMap("Vni")
        public Integer vni;

        public static DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData self = new DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setAcc(Integer acc) {
            this.acc = acc;
            return this;
        }
        public Integer getAcc() {
            return this.acc;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setLoadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setReqs2xx(Integer reqs2xx) {
            this.reqs2xx = reqs2xx;
            return this;
        }
        public Integer getReqs2xx() {
            return this.reqs2xx;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setReqs3xx(Integer reqs3xx) {
            this.reqs3xx = reqs3xx;
            return this;
        }
        public Integer getReqs3xx() {
            return this.reqs3xx;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setReqs4xx(Integer reqs4xx) {
            this.reqs4xx = reqs4xx;
            return this;
        }
        public Integer getReqs4xx() {
            return this.reqs4xx;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setReqs5xx(Integer reqs5xx) {
            this.reqs5xx = reqs5xx;
            return this;
        }
        public Integer getReqs5xx() {
            return this.reqs5xx;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setRtAvg(Integer rtAvg) {
            this.rtAvg = rtAvg;
            return this;
        }
        public Integer getRtAvg() {
            return this.rtAvg;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeServerLoadBalancerMonitorResponseBodyServerLoadBalancerMonitorData setVni(Integer vni) {
            this.vni = vni;
            return this;
        }
        public Integer getVni() {
            return this.vni;
        }

    }

}
