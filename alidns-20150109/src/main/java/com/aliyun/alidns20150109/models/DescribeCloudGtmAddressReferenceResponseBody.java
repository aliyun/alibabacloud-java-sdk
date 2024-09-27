// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressReferenceResponseBody extends TeaModel {
    /**
     * <p>IP address or domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The address ID. This ID uniquely identifies the address.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89564584963974**40</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>The address pools.</p>
     */
    @NameInMap("AddressPools")
    public DescribeCloudGtmAddressReferenceResponseBodyAddressPools addressPools;

    /**
     * <p>Address name.</p>
     * 
     * <strong>example:</strong>
     * <p>Address-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudGtmAddressReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressReferenceResponseBody self = new DescribeCloudGtmAddressReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressReferenceResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setAddressPools(DescribeCloudGtmAddressReferenceResponseBodyAddressPools addressPools) {
        this.addressPools = addressPools;
        return this;
    }
    public DescribeCloudGtmAddressReferenceResponseBodyAddressPools getAddressPools() {
        return this.addressPools;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCloudGtmAddressReferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig extends TeaModel {
        /**
         * <p>The policy for load balancing between address pools. Valid values:</p>
         * <ul>
         * <li>round_robin: All address pools are returned for Domain Name System (DNS) requests from any source. All address pools are sorted in round-robin mode each time they are returned.</li>
         * <li>sequence: The address pool with the smallest sequence number is preferentially returned for DNS requests from any source. The sequence number indicates the priority for returning the address pool. A smaller sequence number indicates a higher priority. If the address pool with the smallest sequence number is unavailable, the address pool with the second smallest sequence number is returned.</li>
         * <li>weight: You can set a different weight value for each address pool. This way, address pools are returned based on the weight values.</li>
         * <li>source_nearest: Different address pools are returned based on the sources of DNS requests. This way, users can access nearby address pools.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("AddressPoolLbStrategy")
        public String addressPoolLbStrategy;

        /**
         * <p>The availability state of the access domain name. Valid values:</p>
         * <ul>
         * <li>available: If the access domain name is <strong>enabled</strong> and the health state is normal, the access domain name is deemed <strong>available</strong>.</li>
         * <li>unavailable: If the access domain name is <strong>disabled</strong> or the health state is <strong>abnormal</strong>, the access domain name is deemed <strong>unavailable</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>config-00**01</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The enabling state of the access domain name. Valid values:</p>
         * <ul>
         * <li>enable: The access domain name is enabled and the intelligent scheduling policy of the corresponding GTM instance takes effect.</li>
         * <li>disable: The access domain name is disabled and the intelligent scheduling policy of the corresponding GTM instance does not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <p>The health state of the access domain name. Valid values:</p>
         * <ul>
         * <li>ok: The health state of the access domain name is normal and all address pools that are referenced by the access domain name are available.</li>
         * <li>ok_alert: The health state of the access domain name is warning and some of the address pools that are referenced by the access domain name are unavailable. In this case, only the available address pools are returned for DNS requests.</li>
         * <li>exceptional: The health state of the access domain name is abnormal and all address pools that are referenced by the access domain name are unavailable. In this case, addresses in the non-empty address pool with the smallest sequence number are preferentially used for fallback resolution. This returns DNS results for clients as much as possible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The ID of the GTM 3.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-zz11t58**0k</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The access domain name. The value of this parameter is composed of the value of ScheduleHostname and the value of ScheduleZoneName.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("ScheduleDomainName")
        public String scheduleDomainName;

        /**
         * <p>Host record of the domain accessed by GTM.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        @NameInMap("ScheduleHostname")
        public String scheduleHostname;

        /**
         * <p>DNS record types for the scheduling domain:</p>
         * <ul>
         * <li>A: IPv4 address</li>
         * <li>AAAA: IPv6 address</li>
         * <li>CNAME: Domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("ScheduleRrType")
        public String scheduleRrType;

        /**
         * <p>The zone such as example.com or subzone such as a.example.com of the access domain name. In most cases, the zone or subzone is hosted by the Public Authoritative DNS module of Alibaba Cloud DNS. This zone belongs to the account to which the GTM instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("ScheduleZoneName")
        public String scheduleZoneName;

        /**
         * <p>The mode used if the address pool with the smallest sequence number is recovered. This parameter is returned when AddressPoolLbStrategy is set to sequence. Valid values:</p>
         * <ul>
         * <li>preemptive: The address pool with the smallest sequence number is preferentially used if this address pool is recovered.</li>
         * <li>non_preemptive: The current address pool is still used even if the address pool with the smallest sequence number is recovered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preemptive</p>
         */
        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        /**
         * <p>Global TTL (in seconds), the TTL value for domain name resolution to addresses in the address pool, which affects the caching time of DNS records in the ISP\&quot;s LocalDNS. Custom TTL values are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>Global Traffic Management version 3.0 instance types:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>ultimate: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ultimate</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setAddressPoolLbStrategy(String addressPoolLbStrategy) {
            this.addressPoolLbStrategy = addressPoolLbStrategy;
            return this;
        }
        public String getAddressPoolLbStrategy() {
            return this.addressPoolLbStrategy;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleHostname(String scheduleHostname) {
            this.scheduleHostname = scheduleHostname;
            return this;
        }
        public String getScheduleHostname() {
            return this.scheduleHostname;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleRrType(String scheduleRrType) {
            this.scheduleRrType = scheduleRrType;
            return this;
        }
        public String getScheduleRrType() {
            return this.scheduleRrType;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setScheduleZoneName(String scheduleZoneName) {
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }
        public String getScheduleZoneName() {
            return this.scheduleZoneName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs extends TeaModel {
        @NameInMap("InstanceConfig")
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig> instanceConfig;

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs setInstanceConfig(java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig> instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigsInstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool extends TeaModel {
        /**
         * <p>Load balancing policy among addresses in the address pool:</p>
         * <ul>
         * <li>round_robin: Round-robin, for any source of DNS resolution requests, all addresses are returned, with a rotation sort applied to all addresses each time.</li>
         * <li>sequence: Sequential, for any source of DNS resolution requests, returns the address with the smaller sequence number (the sequence number indicates the priority of address return, with smaller numbers having higher priority). If the address with the smaller sequence number is unavailable, the next address with a smaller sequence number is returned.</li>
         * <li>weight: Weighted, supports setting different weight values for each address, realizing the return of addresses according to the ratio of weight for DNS query resolutions.</li>
         * <li>source_nearest: Source-nearest, i.e., intelligent resolution function, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("AddressLbStrategy")
        public String addressLbStrategy;

        /**
         * <p>The ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-895280232254422016</p>
         */
        @NameInMap("AddressPoolId")
        public String addressPoolId;

        /**
         * <p>Address pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>AddressPool-1</p>
         */
        @NameInMap("AddressPoolName")
        public String addressPoolName;

        /**
         * <p>Address pool type:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * <li>domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressPoolType")
        public String addressPoolType;

        /**
         * <p>Address pool availability status:</p>
         * <ul>
         * <li>available</li>
         * <li>unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("AvailableStatus")
        public String availableStatus;

        /**
         * <p>Address pool status:</p>
         * <ul>
         * <li>enable: Enabled status</li>
         * <li>disable: Disabled status</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <p>The condition for determining the health status of the address pool. Valid values:</p>
         * <ul>
         * <li>any_ok: At least one address in the address pool is available.</li>
         * <li>p30_ok: At least 30% of the addresses in the address pool are available.</li>
         * <li>p50_ok: At least 50% of the addresses in the address pool are available.</li>
         * <li>p70_ok: At least 70% of the addresses in the address pool are available.</li>
         * <li>all_ok: All addresses in the address pool are available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>any_ok</p>
         */
        @NameInMap("HealthJudgement")
        public String healthJudgement;

        /**
         * <p>The health state of the address pool. Valid values:</p>
         * <ul>
         * <li>ok: The health state of the address pool is normal and all addresses that are referenced by the address pool are available.</li>
         * <li>ok_alert: The health state of the address pool is warning and some of the addresses that are referenced by the address pool are unavailable. However, the address pool is deemed normal. In this case, only the available addresses are returned for DNS requests.</li>
         * <li>exceptional: The health state of the address pool is abnormal and some or all of the addresses that are referenced by the address pool are unavailable. In this case, the address pool is deemed abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The instances that reference the address pool.</p>
         */
        @NameInMap("InstanceConfigs")
        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs instanceConfigs;

        /**
         * <p>Remarks for the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-1</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Load balancing policy between addresses in sequential mode during the recovery of preceding resources service mode:</p>
         * <ul>
         * <li>preemptive: Preemption mode, where upon recovery of preceding resources, priority is given to using addresses with smaller sequence numbers;</li>
         * <li>non_preemptive: Non-preemption mode, where upon recovery of preceding resources, the current address continues to be used;</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preemptive</p>
         */
        @NameInMap("SequenceLbStrategyMode")
        public String sequenceLbStrategyMode;

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressLbStrategy(String addressLbStrategy) {
            this.addressLbStrategy = addressLbStrategy;
            return this;
        }
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressPoolName(String addressPoolName) {
            this.addressPoolName = addressPoolName;
            return this;
        }
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAddressPoolType(String addressPoolType) {
            this.addressPoolType = addressPoolType;
            return this;
        }
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setAvailableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setHealthJudgement(String healthJudgement) {
            this.healthJudgement = healthJudgement;
            return this;
        }
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setInstanceConfigs(DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs instanceConfigs) {
            this.instanceConfigs = instanceConfigs;
            return this;
        }
        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPoolInstanceConfigs getInstanceConfigs() {
            return this.instanceConfigs;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

    }

    public static class DescribeCloudGtmAddressReferenceResponseBodyAddressPools extends TeaModel {
        @NameInMap("AddressPool")
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool> addressPool;

        public static DescribeCloudGtmAddressReferenceResponseBodyAddressPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmAddressReferenceResponseBodyAddressPools self = new DescribeCloudGtmAddressReferenceResponseBodyAddressPools();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmAddressReferenceResponseBodyAddressPools setAddressPool(java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool> addressPool) {
            this.addressPool = addressPool;
            return this;
        }
        public java.util.List<DescribeCloudGtmAddressReferenceResponseBodyAddressPoolsAddressPool> getAddressPool() {
            return this.addressPool;
        }

    }

}
