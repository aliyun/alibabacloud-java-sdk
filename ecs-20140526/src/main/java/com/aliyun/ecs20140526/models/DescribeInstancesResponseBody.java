// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about the queried instances.</p>
     */
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances queried.</p>
     * <blockquote>
     * <p> If you specify the <code>MaxResults</code> and <code>NextToken</code> request parameters to perform a paged query, the value of the <code>TotalCount</code> response parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(DescribeInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableHighDensityMode")
        public Boolean enableHighDensityMode;

        public static DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo self = new DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo setEnableHighDensityMode(Boolean enableHighDensityMode) {
            this.enableHighDensityMode = enableHighDensityMode;
            return this;
        }
        public Boolean getEnableHighDensityMode() {
            return this.enableHighDensityMode;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceCpuOptions extends TeaModel {
        /**
         * <p>The number of physical CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CoreCount")
        public Integer coreCount;

        @NameInMap("EnableVISST")
        public Boolean enableVISST;

        @NameInMap("EnableVRDT")
        public Boolean enableVRDT;

        /**
         * <blockquote>
         * <p> This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Numa")
        public String numa;

        /**
         * <p>The number of threads per CPU core.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        /**
         * <p>The CPU topology type of the instance. Valid values:</p>
         * <ul>
         * <li>ContinuousCoreToHTMapping: Hyper-Threading (HT) continuous CPU topology</li>
         * <li>DiscreteCoreToHTMapping: HT discrete CPU topology</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ContinuousCoreToHTMapping</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        @NameInMap("TurboMode")
        public String turboMode;

        public static DescribeInstancesResponseBodyInstancesInstanceCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceCpuOptions self = new DescribeInstancesResponseBodyInstancesInstanceCpuOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Integer getCoreCount() {
            return this.coreCount;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setEnableVISST(Boolean enableVISST) {
            this.enableVISST = enableVISST;
            return this;
        }
        public Boolean getEnableVISST() {
            return this.enableVISST;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setEnableVRDT(Boolean enableVRDT) {
            this.enableVRDT = enableVRDT;
            return this;
        }
        public Boolean getEnableVRDT() {
            return this.enableVRDT;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setNuma(String numa) {
            this.numa = numa;
            return this;
        }
        public String getNuma() {
            return this.numa;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setTurboMode(String turboMode) {
            this.turboMode = turboMode;
            return this;
        }
        public String getTurboMode() {
            return this.turboMode;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute extends TeaModel {
        /**
         * <p>The ID of the dedicated host cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-bp67acfmxazb4h****</p>
         */
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        /**
         * <p>The ID of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The name of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>testDedicatedHostName</p>
         */
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        public static DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute self = new DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute extends TeaModel {
        /**
         * <p>Indicates whether the instance on the dedicated host is associated with the dedicated host. Valid values:</p>
         * <ul>
         * <li>default: The instance is not associated with the dedicated host. When the instance is restarted from economical mode, the instance may be automatically deployed on another dedicated host in the automatic deployment resource pool.</li>
         * <li>host: The instance is associated with the dedicated host. When the instance is restarted from economical mode, the instance is still deployed on the original dedicated host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Affinity")
        public String affinity;

        /**
         * <p>Indicates whether the instance is hosted on a dedicated host. Valid values:</p>
         * <ul>
         * <li>default: The instance is not hosted on a dedicated host.</li>
         * <li>host: The instance is hosted on a dedicated host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Tenancy")
        public String tenancy;

        public static DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute self = new DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute setTenancy(String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public String getTenancy() {
            return this.tenancy;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr extends TeaModel {
        /**
         * <p>The ID of the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-bp67acfmxazb4p****</p>
         */
        @NameInMap("CapacityReservationId")
        public String capacityReservationId;

        /**
         * <p>The preference of the capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-bp67acfmxazb4p****</p>
         */
        @NameInMap("CapacityReservationPreference")
        public String capacityReservationPreference;

        public static DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr self = new DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr setCapacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr setCapacityReservationPreference(String capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }
        public String getCapacityReservationPreference() {
            return this.capacityReservationPreference;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceEipAddress extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-2ze88m67qx5z****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The maximum public bandwidth of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The metering method of the EIP. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth</li>
         * <li>PayByTraffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP.</p>
         * 
         * <strong>example:</strong>
         * <p><code>42.112.**.**</code></p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>Indicates whether the EIP can be disassociated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSupportUnassociate")
        public Boolean isSupportUnassociate;

        public static DescribeInstancesResponseBodyInstancesInstanceEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceEipAddress self = new DescribeInstancesResponseBodyInstancesInstanceEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setIsSupportUnassociate(Boolean isSupportUnassociate) {
            this.isSupportUnassociate = isSupportUnassociate;
            return this;
        }
        public Boolean getIsSupportUnassociate() {
            return this.isSupportUnassociate;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceHibernationOptions extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Configured")
        public Boolean configured;

        public static DescribeInstancesResponseBodyInstancesInstanceHibernationOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceHibernationOptions self = new DescribeInstancesResponseBodyInstancesInstanceHibernationOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceHibernationOptions setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceImageOptions extends TeaModel {
        /**
         * <p>Indicates whether the operating system supports access to disks over the NVMe protocol. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if you specify CURRENT_OS_NVME_SUPPORTED in AdditionalAttributes in the request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CurrentOSNVMeSupported")
        public Boolean currentOSNVMeSupported;

        /**
         * <p>Indicates whether the instance that uses the image supports logons of the ecs-user user. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static DescribeInstancesResponseBodyInstancesInstanceImageOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceImageOptions self = new DescribeInstancesResponseBodyInstancesInstanceImageOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceImageOptions setCurrentOSNVMeSupported(Boolean currentOSNVMeSupported) {
            this.currentOSNVMeSupported = currentOSNVMeSupported;
            return this;
        }
        public Boolean getCurrentOSNVMeSupported() {
            return this.currentOSNVMeSupported;
        }

        public DescribeInstancesResponseBodyInstancesInstanceImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceMetadataOptions extends TeaModel {
        /**
         * <p>Indicates whether the access channel is enabled for instance metadata. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("HttpEndpoint")
        public String httpEndpoint;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HttpPutResponseHopLimit")
        public Integer httpPutResponseHopLimit;

        /**
         * <p>Indicates whether the security hardening mode (IMDSv2) is forcefully used to access instance metadata. Valid values:</p>
         * <ul>
         * <li>optional: The security hardening mode (IMDSv2) is not forcefully used.</li>
         * <li>required: The security hardening mode (IMDSv2) is forcefully used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("HttpTokens")
        public String httpTokens;

        public static DescribeInstancesResponseBodyInstancesInstanceMetadataOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceMetadataOptions self = new DescribeInstancesResponseBodyInstancesInstanceMetadataOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions setHttpEndpoint(String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Integer getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions setHttpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public String getHttpTokens() {
            return this.httpTokens;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet extends TeaModel {
        /**
         * <p>The IPv4 prefix of the ENI.</p>
         */
        @NameInMap("Ipv4Prefix")
        public String ipv4Prefix;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets extends TeaModel {
        @NameInMap("Ipv4PrefixSet")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets setIpv4PrefixSet(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet) {
            this.ipv4PrefixSet = ipv4PrefixSet;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSetsIpv4PrefixSet> getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet extends TeaModel {
        /**
         * <p>The IPv6 prefix of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:1111:<em>:</em>::/64</p>
         */
        @NameInMap("Ipv6Prefix")
        public String ipv6Prefix;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet setIpv6Prefix(String ipv6Prefix) {
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }
        public String getIpv6Prefix() {
            return this.ipv6Prefix;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets extends TeaModel {
        @NameInMap("Ipv6PrefixSet")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets setIpv6PrefixSet(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet) {
            this.ipv6PrefixSet = ipv6PrefixSet;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSetsIpv6PrefixSet> getIpv6PrefixSet() {
            return this.ipv6PrefixSet;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set extends TeaModel {
        /**
         * <p>The IPv6 address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:4321:180:1701:94c7:bc38:3bfa:***</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set> ipv6Set;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets setIpv6Set(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet extends TeaModel {
        /**
         * <p>Indicates whether the IP address is the primary private IP address. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <p>The private domain name of the instance.</p>
         * <blockquote>
         * <p> This parameter has a value in a specific format only if <code>HostnameType</code> is set to <code>IpBased</code> or <code>InstanceIdBased</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dnsTestName</p>
         */
        @NameInMap("PrivateDnsName")
        public String privateDnsName;

        /**
         * <p>The private IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code></p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet setPrivateDnsName(String privateDnsName) {
            this.privateDnsName = privateDnsName;
            return this;
        }
        public String getPrivateDnsName() {
            return this.privateDnsName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets setPrivateIpSet(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface extends TeaModel {
        /**
         * <p>The IPv4 prefixes of the ENI. This parameter has a value only when <code>AdditionalAttributes.N</code> is set to <code>NETWORK_PRIMARY_ENI_IP</code>.</p>
         */
        @NameInMap("Ipv4PrefixSets")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets ipv4PrefixSets;

        /**
         * <p>The IPv6 prefixes of the ENI. This parameter has a value only when <code>AdditionalAttributes.N</code> is set to <code>NETWORK_PRIMARY_ENI_IP</code>.</p>
         */
        @NameInMap("Ipv6PrefixSets")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets ipv6PrefixSets;

        /**
         * <p>The IPv6 addresses of the ENI. This parameter has a value only when <code>AdditionalAttributes.N</code> is set to <code>NETWORK_PRIMARY_ENI_IP</code>.</p>
         */
        @NameInMap("Ipv6Sets")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets ipv6Sets;

        /**
         * <p>The MAC address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:3e:32:b4:**</p>
         */
        @NameInMap("MacAddress")
        public String macAddress;

        /**
         * <p>The ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-2zeh9atclduxvf1z****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The primary private IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code>*</p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The private IP addresses of the ENI.</p>
         */
        @NameInMap("PrivateIpSets")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets privateIpSets;

        /**
         * <p>The type of the ENI. Valid values:</p>
         * <ul>
         * <li>Primary</li>
         * <li>Secondary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setIpv4PrefixSets(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets ipv4PrefixSets) {
            this.ipv4PrefixSets = ipv4PrefixSets;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv4PrefixSets getIpv4PrefixSets() {
            return this.ipv4PrefixSets;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setIpv6PrefixSets(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets ipv6PrefixSets) {
            this.ipv6PrefixSets = ipv6PrefixSets;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6PrefixSets getIpv6PrefixSets() {
            return this.ipv6PrefixSets;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setIpv6Sets(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setPrivateIpSets(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces setNetworkInterface(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason extends TeaModel {
        /**
         * <p>The message returned when the instance was locked.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified instance is locked due to financial reason.</p>
         */
        @NameInMap("LockMsg")
        public String lockMsg;

        /**
         * <p>The reason why the instance was locked. Valid values:</p>
         * <ul>
         * <li>financial: The instance was locked due to overdue payments.</li>
         * <li>security: The instance was locked due to security reasons.</li>
         * <li>recycling: The preemptible instance was locked and pending release.</li>
         * <li>dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.</li>
         * <li>refunded: The instance was locked because a refund was made for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Recycling</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason self = new DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason setLockMsg(String lockMsg) {
            this.lockMsg = lockMsg;
            return this;
        }
        public String getLockMsg() {
            return this.lockMsg;
        }

        public DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason> lockReason;

        public static DescribeInstancesResponseBodyInstancesInstanceOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceOperationLocks self = new DescribeInstancesResponseBodyInstancesInstanceOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceOperationLocks setLockReason(java.util.List<DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions extends TeaModel {
        /**
         * <p>Indicates whether DNS Resolution from the Instance ID-based Hostname to the Instance Primary Private IPv6 Address (AAAA Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsAAAARecord")
        public Boolean enableInstanceIdDnsAAAARecord;

        /**
         * <p>Indicates whether DNS Resolution from the Instance ID-based Hostname to the Instance Primary Private IPv4 Address (A Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsARecord")
        public Boolean enableInstanceIdDnsARecord;

        /**
         * <p>Indicates whether DNS Resolution from the IP Address-based Hostname to the Instance Primary Private IPv4 Address (A Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIpDnsARecord")
        public Boolean enableIpDnsARecord;

        /**
         * <p>Indicates whether Reverse DNS Resolution from the Instance Primary Private IPv4 Address to the IP Address-based Hostname (PTR Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIpDnsPtrRecord")
        public Boolean enableIpDnsPtrRecord;

        /**
         * <p>The type of hostname. Valid values:</p>
         * <ul>
         * <li>Custom: custom hostname</li>
         * <li>IpBased: IP address-based hostname</li>
         * <li>InstanceIdBased: instance ID-based hostname</li>
         * </ul>
         * <p>Default value: Custom.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("HostnameType")
        public String hostnameType;

        public static DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions self = new DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions setEnableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
            this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsAAAARecord() {
            return this.enableInstanceIdDnsAAAARecord;
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions setEnableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
            this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsARecord() {
            return this.enableInstanceIdDnsARecord;
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions setEnableIpDnsARecord(Boolean enableIpDnsARecord) {
            this.enableIpDnsARecord = enableIpDnsARecord;
            return this;
        }
        public Boolean getEnableIpDnsARecord() {
            return this.enableIpDnsARecord;
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions setEnableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
            this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
            return this;
        }
        public Boolean getEnableIpDnsPtrRecord() {
            return this.enableIpDnsPtrRecord;
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions setHostnameType(String hostnameType) {
            this.hostnameType = hostnameType;
            return this;
        }
        public String getHostnameType() {
            return this.hostnameType;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstancePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePublicIpAddress self = new DescribeInstancesResponseBodyInstancesInstancePublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds self = new DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTagsTag extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeInstancesResponseBodyInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTagsTag self = new DescribeInstancesResponseBodyInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> tag;

        public static DescribeInstancesResponseBodyInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTags self = new DescribeInstancesResponseBodyInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTags setTag(java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceVpcAttributes extends TeaModel {
        /**
         * <p>The NAT IP address of the instance. The NAT IP address is used by ECS instances in different VPCs for communication.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code></p>
         */
        @NameInMap("NatIpAddress")
        public String natIpAddress;

        /**
         * <p>The private IP addresses of the instance.</p>
         */
        @NameInMap("PrivateIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress privateIpAddress;

        /**
         * <p>The ID of the vSwitch to which the instance is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zeh0r1pabwtg6wcs****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeuphj08tt7q3brd****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeInstancesResponseBodyInstancesInstanceVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceVpcAttributes self = new DescribeInstancesResponseBodyInstancesInstanceVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setPrivateIpAddress(DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstance extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("AdditionalInfo")
        public DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo additionalInfo;

        /**
         * <p>The automatic release time of the pay-as-you-go instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>The ID of the cluster to which the instance belongs.</p>
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c-bp67acfmxazb4p****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>Details about the CPU options.</p>
         */
        @NameInMap("CpuOptions")
        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions cpuOptions;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The information about the dedicated host. The value is an array that consists of DedicatedHostClusterId, DedicatedHostId, and DedicatedHostName.</p>
         */
        @NameInMap("DedicatedHostAttribute")
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute dedicatedHostAttribute;

        /**
         * <p>The attributes of the instance on the dedicated host.</p>
         */
        @NameInMap("DedicatedInstanceAttribute")
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute dedicatedInstanceAttribute;

        /**
         * <p>Indicates whether release protection is enabled for the instance. This parameter determines whether you can use the ECS console or call the DeleteInstance operation to release the instance. Valid values:</p>
         * <ul>
         * <li>true: Release protection is enabled for the instance.</li>
         * <li>false: Release protection is disabled for the instance.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is applicable only to pay-as-you-go instances. The release protection feature can protect instances against manual releases, but not against automatic releases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The number of the deployment set group to which the instance belongs in a deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeploymentSetGroupNo")
        public Integer deploymentSetGroupNo;

        /**
         * <p>The ID of the deployment set to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp67acfmxazb4p****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether data disks can be attached to the instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeviceAvailable")
        public Boolean deviceAvailable;

        /**
         * <p>Details about the capacity reservation associated with the instance.</p>
         */
        @NameInMap("EcsCapacityReservationAttr")
        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr ecsCapacityReservationAttr;

        /**
         * <p>Details about the EIP associated with the instance.</p>
         */
        @NameInMap("EipAddress")
        public DescribeInstancesResponseBodyInstancesInstanceEipAddress eipAddress;

        @NameInMap("EnableNVS")
        public Boolean enableNVS;

        /**
         * <p>The expiration time of the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The number of GPUs for the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        /**
         * <p>The category of GPUs for the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA V100</p>
         */
        @NameInMap("GPUSpec")
        public String GPUSpec;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         */
        @NameInMap("HibernationOptions")
        public DescribeInstancesResponseBodyInstancesInstanceHibernationOptions hibernationOptions;

        /**
         * <p>The hostname of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testHostName</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the HPC cluster to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>hpc-bp67acfmxazb4p****</p>
         */
        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The image ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4p****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image options.</p>
         */
        @NameInMap("ImageOptions")
        public DescribeInstancesResponseBodyInstancesInstanceImageOptions imageOptions;

        /**
         * <p>The internal IP addresses of the instance located in the classic network.</p>
         */
        @NameInMap("InnerIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceNameTest</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>classic</li>
         * <li>vpc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance family of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth</li>
         * <li>PayByTraffic: pay-by-traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Indicates whether the instance is an I/O optimized instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The number of local disks attached to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        /**
         * <p>The capacity of local disks attached to the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>Details about the metadata options.</p>
         */
        @NameInMap("MetadataOptions")
        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions metadataOptions;

        /**
         * <p>The ENIs attached to the instance.</p>
         */
        @NameInMap("NetworkInterfaces")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces networkInterfaces;

        /**
         * <p>The name of the operating system of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS 7.4 64-bit</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The English name of the operating system of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS  7.4 64 bit</p>
         */
        @NameInMap("OSNameEn")
        public String OSNameEn;

        /**
         * <p>The type of the operating system of the instance. Valid values:</p>
         * <ul>
         * <li>windows: Windows operating systems</li>
         * <li>linux: Linux operating systems</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The reasons why the instance was locked.</p>
         */
        @NameInMap("OperationLocks")
        public DescribeInstancesResponseBodyInstancesInstanceOperationLocks operationLocks;

        /**
         * <p>The private domain name options of the instance.</p>
         * <p>For information about the resolution of ECS private domain names, see <a href="https://help.aliyun.com/document_detail/2844797.html">ECS private DNS resolution</a>.</p>
         * <blockquote>
         * <p> This parameter is returned only when the <code>AdditionalAttributes</code> parameter contains <code>PRIVATE_DNS_OPTIONS</code> in the request.</p>
         * </blockquote>
         */
        @NameInMap("PrivateDnsNameOptions")
        public DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions privateDnsNameOptions;

        /**
         * <p>The public IP addresses of the instance.</p>
         */
        @NameInMap("PublicIpAddress")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress;

        /**
         * <p>The RDMA IP addresses of the instance in the HPC cluster.</p>
         */
        @NameInMap("RdmaIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress rdmaIpAddress;

        /**
         * <p>Indicates whether the instance can be recycled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Recyclable")
        public Boolean recyclable;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <blockquote>
         * <p> The parameter is removed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("SaleCycle")
        public String saleCycle;

        /**
         * <p>The IDs of the security groups to which the instance belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds;

        /**
         * <p>The serial number of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>51d1353b-22bf-4567-a176-8b3e12e4****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Valid values:</p>
         * <ul>
         * <li>1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * <li>0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
         * <blockquote>
         * <p> This parameter is returned when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The interruption mode of the preemptible instance when the system initiates a preemptible instance interruption operation. Valid values:</p>
         * <ul>
         * <li>Terminate: releases the preemptible instance.</li>
         * <li>Stop: stops the instance in economical mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The maximum hourly price of the instance. The value can be accurate to three decimal places. This parameter is valid when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.98</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The bidding policy for the pay-as-you-go instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The time when the instance was last started. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the instance continues to be billed after it is stopped. Valid values:</p>
         * <ul>
         * <li>KeepCharging: The instance is stopped in standard mode. Billing for the instance continues after the instance is stopped, and resources are retained for the instance.</li>
         * <li>StopCharging: The instance is stopped in economical mode. Billing for some resources of the instance stops after the instance is stopped. When the instance is stopped, its resources such as vCPUs, memory, and public IP addresses are released. The instance may be unable to restart if some required resources are out of stock in the current region.</li>
         * <li>Not-applicable: The instance does not support economical mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeepCharging</p>
         */
        @NameInMap("StoppedMode")
        public String stoppedMode;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public DescribeInstancesResponseBodyInstancesInstanceTags tags;

        /**
         * <p>The virtual LAN (VLAN) ID of the instance.</p>
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VlanId")
        public String vlanId;

        /**
         * <p>The VPC attributes of the instance.</p>
         */
        @NameInMap("VpcAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstance self = new DescribeInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstance setAdditionalInfo(DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceAdditionalInfo getAdditionalInfo() {
            return this.additionalInfo;
        }

        public DescribeInstancesResponseBodyInstancesInstance setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCpuOptions(DescribeInstancesResponseBodyInstancesInstanceCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDedicatedHostAttribute(DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute dedicatedHostAttribute) {
            this.dedicatedHostAttribute = dedicatedHostAttribute;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute getDedicatedHostAttribute() {
            return this.dedicatedHostAttribute;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDedicatedInstanceAttribute(DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute dedicatedInstanceAttribute) {
            this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute getDedicatedInstanceAttribute() {
            return this.dedicatedInstanceAttribute;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }
        public Integer getDeploymentSetGroupNo() {
            return this.deploymentSetGroupNo;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeviceAvailable(Boolean deviceAvailable) {
            this.deviceAvailable = deviceAvailable;
            return this;
        }
        public Boolean getDeviceAvailable() {
            return this.deviceAvailable;
        }

        public DescribeInstancesResponseBodyInstancesInstance setEcsCapacityReservationAttr(DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr ecsCapacityReservationAttr) {
            this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr getEcsCapacityReservationAttr() {
            return this.ecsCapacityReservationAttr;
        }

        public DescribeInstancesResponseBodyInstancesInstance setEipAddress(DescribeInstancesResponseBodyInstancesInstanceEipAddress eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceEipAddress getEipAddress() {
            return this.eipAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setEnableNVS(Boolean enableNVS) {
            this.enableNVS = enableNVS;
            return this;
        }
        public Boolean getEnableNVS() {
            return this.enableNVS;
        }

        public DescribeInstancesResponseBodyInstancesInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public DescribeInstancesResponseBodyInstancesInstance setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeInstancesResponseBodyInstancesInstance setHibernationOptions(DescribeInstancesResponseBodyInstancesInstanceHibernationOptions hibernationOptions) {
            this.hibernationOptions = hibernationOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceHibernationOptions getHibernationOptions() {
            return this.hibernationOptions;
        }

        public DescribeInstancesResponseBodyInstancesInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeInstancesResponseBodyInstancesInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setImageOptions(DescribeInstancesResponseBodyInstancesInstanceImageOptions imageOptions) {
            this.imageOptions = imageOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceImageOptions getImageOptions() {
            return this.imageOptions;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInnerIpAddress(DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeInstancesResponseBodyInstancesInstance setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeInstancesResponseBodyInstancesInstance setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeInstancesResponseBodyInstancesInstance setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMetadataOptions(DescribeInstancesResponseBodyInstancesInstanceMetadataOptions metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions getMetadataOptions() {
            return this.metadataOptions;
        }

        public DescribeInstancesResponseBodyInstancesInstance setNetworkInterfaces(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOperationLocks(DescribeInstancesResponseBodyInstancesInstanceOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPrivateDnsNameOptions(DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions privateDnsNameOptions) {
            this.privateDnsNameOptions = privateDnsNameOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePrivateDnsNameOptions getPrivateDnsNameOptions() {
            return this.privateDnsNameOptions;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPublicIpAddress(DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setRdmaIpAddress(DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress rdmaIpAddress) {
            this.rdmaIpAddress = rdmaIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress getRdmaIpAddress() {
            return this.rdmaIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setRecyclable(Boolean recyclable) {
            this.recyclable = recyclable;
            return this;
        }
        public Boolean getRecyclable() {
            return this.recyclable;
        }

        public DescribeInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSecurityGroupIds(DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        public DescribeInstancesResponseBodyInstancesInstance setTags(DescribeInstancesResponseBodyInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceTags getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyInstancesInstance setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setVpcAttributes(DescribeInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        public DescribeInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setInstance(java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
