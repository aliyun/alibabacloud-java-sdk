// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListResponseBody extends TeaModel {
    // The details about the assets that are protected by Cloud Firewall.
    @NameInMap("Assets")
    public java.util.List<DescribeAssetListResponseBodyAssets> assets;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the assets that are protected by Cloud Firewall.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAssetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetListResponseBody self = new DescribeAssetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetListResponseBody setAssets(java.util.List<DescribeAssetListResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<DescribeAssetListResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public DescribeAssetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAssetListResponseBodyAssets extends TeaModel {
        // The UID of the Alibaba Cloud account.
        // 
        // >  The value of this parameter indicates the management account to which the member is added.
        @NameInMap("AliUid")
        public Long aliUid;

        // The instance ID of the asset that is bound to Cloud Firewall.
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        // The instance name of the asset that is bound to Cloud Firewall.
        @NameInMap("BindInstanceName")
        public String bindInstanceName;

        // The public IP address of the server.
        @NameInMap("InternetAddress")
        public String internetAddress;

        // The internal IP address of the server.
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        // The IP version of the asset that is protected by Cloud Firewall.
        // 
        // Valid values:
        // 
        // *   **4**: IPv4
        // *   **6**: IPv6
        @NameInMap("IpVersion")
        public Integer ipVersion;

        // The UID of the member that is added in Cloud Firewall.
        @NameInMap("MemberUid")
        public Long memberUid;

        // The instance name of the asset that is protected by Cloud Firewall.
        @NameInMap("Name")
        public String name;

        // The remarks of the asset. Valid values:
        // 
        // *   **REGION\_NOT\_SUPPORT**: The region is not supported.
        // *   **NETWORK\_NOT\_SUPPORT**: The network is not supported.
        @NameInMap("Note")
        public String note;

        // The status of the firewall. Valid values:
        // 
        // *   **open**: The firewall is enabled.
        // *   **opening**: The firewall is being enabled.
        // *   **closed**: The firewall is disabled.
        // *   **closing**: The firewall is being disabled.
        @NameInMap("ProtectStatus")
        public String protectStatus;

        // The ID of the region in which the asset resides.
        @NameInMap("RegionID")
        public String regionID;

        // Indicates whether the firewall is supported in the region in which the asset resides. Valid values:
        // 
        // *   **enable**: supported
        // *   **disable**: unsupported
        @NameInMap("RegionStatus")
        public String regionStatus;

        // The instance ID of the asset.
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        // The type of the asset. Valid values:
        // 
        // *   **BastionHostEgressIP**: the egress IP address of a bastion host
        // *   **BastionHostIngressIP**: the ingress IP address of a bastion host
        // *   **EcsEIP**: the EIP of an ECS instance
        // *   **EcsPublicIP**: the public IP address of an ECS instance
        // *   **EIP**: the EIP
        // *   **EniEIP**: the EIP of an ENI
        // *   **NatEIP**: the EIP of a NAT gateway
        // *   **SlbEIP**: the EIP of an SLB instance
        // *   **SlbPublicIP**: the public IP address of an SLB instance
        // *   **NatPublicIP**: the public IP address of a NAT gateway
        // *   **HAVIP**: the HAVIP
        @NameInMap("ResourceType")
        public String resourceType;

        // The risk level of the asset. Valid values:
        // 
        // *   **low**: low
        // *   **middle**: medium
        // *   **hight**: high
        // 
        // >  The value of this parameter is returned only when the UserType parameter is set to free.
        @NameInMap("RiskLevel")
        public String riskLevel;

        // The status of the security group policy. Valid values:
        // 
        // *   **pass**: delivered
        // *   **block**: undelivered
        // *   **unsupport**: unsupported
        @NameInMap("SgStatus")
        public String sgStatus;

        // The time when the status of the security group was last checked. The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("SgStatusTime")
        public Long sgStatusTime;

        // The status of traffic redirection for the asset. Valid values:
        // 
        // *   **enable**: Traffic redirection is enabled.
        // *   **disable**: Traffic redirection is disabled.
        @NameInMap("SyncStatus")
        public String syncStatus;

        // This parameter is deprecated.
        @NameInMap("Type")
        public String type;

        public static DescribeAssetListResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetListResponseBodyAssets self = new DescribeAssetListResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public DescribeAssetListResponseBodyAssets setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeAssetListResponseBodyAssets setBindInstanceId(String bindInstanceId) {
            this.bindInstanceId = bindInstanceId;
            return this;
        }
        public String getBindInstanceId() {
            return this.bindInstanceId;
        }

        public DescribeAssetListResponseBodyAssets setBindInstanceName(String bindInstanceName) {
            this.bindInstanceName = bindInstanceName;
            return this;
        }
        public String getBindInstanceName() {
            return this.bindInstanceName;
        }

        public DescribeAssetListResponseBodyAssets setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public DescribeAssetListResponseBodyAssets setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public DescribeAssetListResponseBodyAssets setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeAssetListResponseBodyAssets setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

        public DescribeAssetListResponseBodyAssets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAssetListResponseBodyAssets setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeAssetListResponseBodyAssets setProtectStatus(String protectStatus) {
            this.protectStatus = protectStatus;
            return this;
        }
        public String getProtectStatus() {
            return this.protectStatus;
        }

        public DescribeAssetListResponseBodyAssets setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public DescribeAssetListResponseBodyAssets setRegionStatus(String regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public String getRegionStatus() {
            return this.regionStatus;
        }

        public DescribeAssetListResponseBodyAssets setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeAssetListResponseBodyAssets setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeAssetListResponseBodyAssets setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeAssetListResponseBodyAssets setSgStatus(String sgStatus) {
            this.sgStatus = sgStatus;
            return this;
        }
        public String getSgStatus() {
            return this.sgStatus;
        }

        public DescribeAssetListResponseBodyAssets setSgStatusTime(Long sgStatusTime) {
            this.sgStatusTime = sgStatusTime;
            return this;
        }
        public Long getSgStatusTime() {
            return this.sgStatusTime;
        }

        public DescribeAssetListResponseBodyAssets setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public DescribeAssetListResponseBodyAssets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
