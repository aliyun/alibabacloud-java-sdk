// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficDetailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0525EADE-C112-5702-A5BC-0E2F6F94DB23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of traffic statistics entries.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The traffic statistics list.</p>
     */
    @NameInMap("TrafficList")
    public java.util.List<DescribePostpayTrafficDetailResponseBodyTrafficList> trafficList;

    public static DescribePostpayTrafficDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayTrafficDetailResponseBody self = new DescribePostpayTrafficDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayTrafficDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePostpayTrafficDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePostpayTrafficDetailResponseBody setTrafficList(java.util.List<DescribePostpayTrafficDetailResponseBodyTrafficList> trafficList) {
        this.trafficList = trafficList;
        return this;
    }
    public java.util.List<DescribePostpayTrafficDetailResponseBodyTrafficList> getTrafficList() {
        return this.trafficList;
    }

    public static class DescribePostpayTrafficDetailResponseBodyTrafficList extends TeaModel {
        /**
         * <p>The inbound network throughput (total bytes). Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1115096939</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The ID of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vb2d7c9mtn0bo9qcraq</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The asset type. This value takes effect only for Internet border traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The outbound network throughput (total bytes). Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The protection duration. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ProtectionDuration")
        public Long protectionDuration;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The resource ID. For Internet border traffic, this is the public IP address of the asset. For NAT border traffic, this is the firewall instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>39.106.146.214</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The total network throughput in both inbound and outbound directions (total bytes sent and received). Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1215096939</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        /**
         * <p>The date of the traffic statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>20231001</p>
         */
        @NameInMap("TrafficDay")
        public String trafficDay;

        /**
         * <p>The type of traffic boundary for statistics. Valid values:</p>
         * <ul>
         * <li><p><strong>EIP_TRAFFIC</strong>: Internet border traffic.</p>
         * </li>
         * <li><p><strong>NatGateway_TRAFFIC</strong>: NAT border traffic.</p>
         * </li>
         * <li><p><strong>VPC_TRAFFIC</strong>: VPC border traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EIP_TRAFFIC</p>
         */
        @NameInMap("TrafficType")
        public String trafficType;

        public static DescribePostpayTrafficDetailResponseBodyTrafficList build(java.util.Map<String, ?> map) throws Exception {
            DescribePostpayTrafficDetailResponseBodyTrafficList self = new DescribePostpayTrafficDetailResponseBodyTrafficList();
            return TeaModel.build(map, self);
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setProtectionDuration(Long protectionDuration) {
            this.protectionDuration = protectionDuration;
            return this;
        }
        public Long getProtectionDuration() {
            return this.protectionDuration;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setTrafficDay(String trafficDay) {
            this.trafficDay = trafficDay;
            return this;
        }
        public String getTrafficDay() {
            return this.trafficDay;
        }

        public DescribePostpayTrafficDetailResponseBodyTrafficList setTrafficType(String trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public String getTrafficType() {
            return this.trafficType;
        }

    }

}
