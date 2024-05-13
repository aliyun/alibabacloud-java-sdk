// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the asset.</p>
     */
    @NameInMap("InstanceList")
    public DescribeInstanceResponseBodyInstanceList instanceList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the assets.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setInstanceList(DescribeInstanceResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public DescribeInstanceResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeInstanceResponseBodyInstanceListInstance extends TeaModel {
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
         * <p>The ID of the asset.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the asset.</p>
         */
        @NameInMap("InstanceIp")
        public String instanceIp;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The DDoS mitigation status of the asset. Valid values:</p>
         * <br>
         * <p>*   **mitigating**: indicates that traffic scrubbing is triggered for the asset.</p>
         * <p>*   **blackholed**: indicates that blackhole filtering is triggered for the asset.</p>
         * <p>*   **normal**: indicates that the instance is normal.</p>
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
         * <p>The IP protocol that is supported by the asset. Valid values:</p>
         * <br>
         * <p>*   **v4**: IPv4</p>
         * <p>*   **v6**: IPv6</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>Indicates whether the asset is associated with an Anti-DDoS Origin Basic instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("IsBgppack")
        public Boolean isBgppack;

        public static DescribeInstanceResponseBodyInstanceListInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceListInstance self = new DescribeInstanceResponseBodyInstanceListInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceListInstance setBlackholeThreshold(Integer blackholeThreshold) {
            this.blackholeThreshold = blackholeThreshold;
            return this;
        }
        public Integer getBlackholeThreshold() {
            return this.blackholeThreshold;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setDefenseBpsThreshold(Integer defenseBpsThreshold) {
            this.defenseBpsThreshold = defenseBpsThreshold;
            return this;
        }
        public Integer getDefenseBpsThreshold() {
            return this.defenseBpsThreshold;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setDefensePpsThreshold(Integer defensePpsThreshold) {
            this.defensePpsThreshold = defensePpsThreshold;
            return this;
        }
        public Integer getDefensePpsThreshold() {
            return this.defensePpsThreshold;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setElasticThreshold(Integer elasticThreshold) {
            this.elasticThreshold = elasticThreshold;
            return this;
        }
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setInstanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }
        public String getInstanceIp() {
            return this.instanceIp;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeInstanceResponseBodyInstanceListInstance setIsBgppack(Boolean isBgppack) {
            this.isBgppack = isBgppack;
            return this;
        }
        public Boolean getIsBgppack() {
            return this.isBgppack;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceList extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstanceResponseBodyInstanceListInstance> instance;

        public static DescribeInstanceResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceList self = new DescribeInstanceResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceList setInstance(java.util.List<DescribeInstanceResponseBodyInstanceListInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyInstanceListInstance> getInstance() {
            return this.instance;
        }

    }

}
