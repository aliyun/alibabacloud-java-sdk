// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("NetworkInterfaceSets")
    public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets networkInterfaceSets;

    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>708AF9CE-FF92-5DF9-93F8-B7754AB1061A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesResponseBody self = new DescribeNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesResponseBody setNetworkInterfaceSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets networkInterfaceSets) {
        this.networkInterfaceSets = networkInterfaceSets;
        return this;
    }
    public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    public DescribeNetworkInterfacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets setIpv6Set(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("PrivateIpStatus")
        public String privateIpStatus;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setPrivateIpStatus(String privateIpStatus) {
            this.privateIpStatus = privateIpStatus;
            return this;
        }
        public String getPrivateIpStatus() {
            return this.privateIpStatus;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets setPrivateIpSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<String> securityGroup;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds setSecurityGroup(java.util.List<String> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<String> getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ipv6Sets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets ipv6Sets;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("NetworkId")
        public String networkId;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("PrimaryIp")
        public String primaryIp;

        @NameInMap("PrimaryIpType")
        public String primaryIpType;

        @NameInMap("PrivateIpSets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets privateIpSets;

        @NameInMap("SecurityGroupIds")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds securityGroupIds;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VmncLearn")
        public Boolean vmncLearn;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setIpv6Sets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setPrimaryIp(String primaryIp) {
            this.primaryIp = primaryIp;
            return this;
        }
        public String getPrimaryIp() {
            return this.primaryIp;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setPrimaryIpType(String primaryIpType) {
            this.primaryIpType = primaryIpType;
            return this;
        }
        public String getPrimaryIpType() {
            return this.primaryIpType;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setPrivateIpSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setSecurityGroupIds(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setVmncLearn(Boolean vmncLearn) {
            this.vmncLearn = vmncLearn;
            return this;
        }
        public Boolean getVmncLearn() {
            return this.vmncLearn;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets setNetworkInterfaceSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet) {
            this.networkInterfaceSet = networkInterfaceSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

    }

}
