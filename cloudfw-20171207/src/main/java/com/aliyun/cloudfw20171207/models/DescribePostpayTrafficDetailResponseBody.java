// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The traffic statistics.</p>
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
         * <p>The inbound network throughput, which indicates the total number of bytes that are received. Unit: bytes.</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The instance ID of the asset.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the asset. This value takes effect only for the Internet firewall.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The outbound network throughput, which indicates the total number of bytes that are sent. Unit: bytes.</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The resource ID. The resource ID for the Internet firewall is the public IP address that is protected the Internet firewall, and the resource ID for a NAT firewall is the instance ID of the NAT firewall.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The total inbound and outbound network throughput, which indicates the total number of bytes that are sent and received. Unit: bytes.</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        /**
         * <p>The date on which the statistics are collected.</p>
         */
        @NameInMap("TrafficDay")
        public String trafficDay;

        /**
         * <p>The traffic type. Valid values:</p>
         * <br>
         * <p>*   **EIP_TRAFFIC**: traffic for the Internet firewall</p>
         * <p>*   **NatGateway_TRAFFIC**: traffic for the NAT firewall</p>
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
