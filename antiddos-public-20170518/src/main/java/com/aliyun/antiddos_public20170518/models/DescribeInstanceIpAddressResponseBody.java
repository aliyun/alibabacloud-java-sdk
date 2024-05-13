// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpAddressResponseBody extends TeaModel {
    /**
     * <p>An array that consists of details of the instance.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceList> instanceList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the assets.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeInstanceIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIpAddressResponseBody self = new DescribeInstanceIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIpAddressResponseBody setInstanceList(java.util.List<DescribeInstanceIpAddressResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public DescribeInstanceIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceIpAddressResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig extends TeaModel {
        /**
         * <p>The basic protection threshold for the asset. Unit: Mbit/s.</p>
         */
        @NameInMap("BlackholeThreshold")
        public Integer blackholeThreshold;

        /**
         * <p>The traffic scrubbing threshold for the asset. Unit: Mbit/s.</p>
         */
        @NameInMap("DefenseBpsThreshold")
        public Integer defenseBpsThreshold;

        /**
         * <p>The packet scrubbing threshold for the asset. Unit: packets per second (pps).</p>
         */
        @NameInMap("DefensePpsThreshold")
        public Integer defensePpsThreshold;

        /**
         * <p>The burstable protection threshold for the asset. Unit: Mbit/s.</p>
         */
        @NameInMap("ElasticThreshold")
        public Integer elasticThreshold;

        /**
         * <p>The IP address of the asset.</p>
         */
        @NameInMap("InstanceIp")
        public String instanceIp;

        /**
         * <p>The DDoS mitigation status of the asset. Valid values:</p>
         * <br>
         * <p>*   **defense**: indicates that traffic scrubbing is performed on the asset.</p>
         * <p>*   **blackhole**: indicates that blackhole filtering is triggered for the asset.</p>
         * <p>*   **normal**: indicates that no DDoS attacks are launched against the asset.</p>
         */
        @NameInMap("IpStatus")
        public String ipStatus;

        /**
         * <p>The IP protocol that is supported by the asset. Valid values:</p>
         * <br>
         * <p>*   **v4**: IPv4</p>
         * <p>*   **v6**: IPv6</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>Indicates whether the asset is added to the instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("IsBgppack")
        public Boolean isBgppack;

        @NameInMap("IsFullProtection")
        public Integer isFullProtection;

        /**
         * <p>The region code of the asset.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig self = new DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setBlackholeThreshold(Integer blackholeThreshold) {
            this.blackholeThreshold = blackholeThreshold;
            return this;
        }
        public Integer getBlackholeThreshold() {
            return this.blackholeThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setDefenseBpsThreshold(Integer defenseBpsThreshold) {
            this.defenseBpsThreshold = defenseBpsThreshold;
            return this;
        }
        public Integer getDefenseBpsThreshold() {
            return this.defenseBpsThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setDefensePpsThreshold(Integer defensePpsThreshold) {
            this.defensePpsThreshold = defensePpsThreshold;
            return this;
        }
        public Integer getDefensePpsThreshold() {
            return this.defensePpsThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setElasticThreshold(Integer elasticThreshold) {
            this.elasticThreshold = elasticThreshold;
            return this;
        }
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setInstanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }
        public String getInstanceIp() {
            return this.instanceIp;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setIpStatus(String ipStatus) {
            this.ipStatus = ipStatus;
            return this;
        }
        public String getIpStatus() {
            return this.ipStatus;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setIsBgppack(Boolean isBgppack) {
            this.isBgppack = isBgppack;
            return this;
        }
        public Boolean getIsBgppack() {
            return this.isBgppack;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setIsFullProtection(Integer isFullProtection) {
            this.isFullProtection = isFullProtection;
            return this;
        }
        public Integer getIsFullProtection() {
            return this.isFullProtection;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeInstanceIpAddressResponseBodyInstanceList extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The DDoS mitigation status of the instance. Valid values:</p>
         * <br>
         * <p>*   **normal**: normal</p>
         * <p>*   **abnormal**: under DDoS attacks</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <br>
         * <p>*   **ecs**: ECS instance</p>
         * <p>*   **slb**: SLB instance</p>
         * <p>*   **eip**: EIP</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>An array that consists of the details of the asset.</p>
         */
        @NameInMap("IpAddressConfig")
        public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig> ipAddressConfig;

        public static DescribeInstanceIpAddressResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIpAddressResponseBodyInstanceList self = new DescribeInstanceIpAddressResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setIpAddressConfig(java.util.List<DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig> ipAddressConfig) {
            this.ipAddressConfig = ipAddressConfig;
            return this;
        }
        public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig> getIpAddressConfig() {
            return this.ipAddressConfig;
        }

    }

}
