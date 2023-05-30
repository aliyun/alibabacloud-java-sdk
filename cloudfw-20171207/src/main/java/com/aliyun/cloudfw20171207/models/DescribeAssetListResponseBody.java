// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListResponseBody extends TeaModel {
    /**
     * <p>The details about the assets that are protected by Cloud Firewall.</p>
     */
    @NameInMap("Assets")
    public java.util.List<DescribeAssetListResponseBodyAssets> assets;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the assets that are protected by Cloud Firewall.</p>
     */
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
        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         * <br>
         * <p>> The value of this parameter indicates the management account to which the member is added.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The instance ID of the asset.</p>
         */
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        /**
         * <p>The instance name of the asset.</p>
         */
        @NameInMap("BindInstanceName")
        public String bindInstanceName;

        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>The internal IP address of the server.</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The IP version of the asset that is protected by Cloud Firewall.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **4**: IPv4</p>
         * <p>*   **6**: IPv6</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The UID of the member that is added to Cloud Firewall.</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        /**
         * <p>The instance name of the asset that is protected by Cloud Firewall.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NewResourceTag")
        public String newResourceTag;

        /**
         * <p>The remarks of the asset. Valid values:</p>
         * <br>
         * <p>*   **REGION_NOT_SUPPORT**: The region is not supported.</p>
         * <p>*   **NETWORK_NOT_SUPPORT**: The network is not supported.</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The status of the firewall. Valid values:</p>
         * <br>
         * <p>*   **open**: The firewall is enabled.</p>
         * <p>*   **opening**: The firewall is being enabled.</p>
         * <p>*   **closed**: The firewall is disabled.</p>
         * <p>*   **closing**: The firewall is being disabled.</p>
         */
        @NameInMap("ProtectStatus")
        public String protectStatus;

        /**
         * <p>The ID of the region in which the asset resides.</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>Indicates whether the firewall is supported in the region in which the asset resides. Valid values:</p>
         * <br>
         * <p>*   **enable**: supported</p>
         * <p>*   **disable**: unsupported</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        /**
         * <p>The instance ID of the asset.</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <br>
         * <p>*   **BastionHostEgressIP**: the egress IP address of a bastion host</p>
         * <p>*   **BastionHostIngressIP**: the ingress IP address of a bastion host</p>
         * <p>*   **EcsEIP**: the EIP of an ECS instance</p>
         * <p>*   **EcsPublicIP**: the public IP address of an ECS instance</p>
         * <p>*   **EIP**: the EIP</p>
         * <p>*   **EniEIP**: the EIP of an ENI</p>
         * <p>*   **NatEIP**: the EIP of a NAT gateway</p>
         * <p>*   **SlbEIP**: the EIP of an SLB instance</p>
         * <p>*   **SlbPublicIP**: the public IP address of an SLB instance</p>
         * <p>*   **NatPublicIP**: the public IP address of a NAT gateway</p>
         * <p>*   **HAVIP**: the HAVIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The risk level of the asset. Valid values:</p>
         * <br>
         * <p>*   **low**: low</p>
         * <p>*   **middle**: medium</p>
         * <p>*   **hight**: high</p>
         * <br>
         * <p>> The value of this parameter is returned only when the UserType parameter is set to free.</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The status of the security group policy. Valid values:</p>
         * <br>
         * <p>*   **pass**: delivered</p>
         * <p>*   **block**: undelivered</p>
         * <p>*   **unsupport**: unsupported</p>
         */
        @NameInMap("SgStatus")
        public String sgStatus;

        /**
         * <p>The time when the status of the security group policy was last checked. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("SgStatusTime")
        public Long sgStatusTime;

        /**
         * <p>The status of traffic redirection for the asset. Valid values:</p>
         * <br>
         * <p>*   **enable**: Traffic redirection is enabled.</p>
         * <p>*   **disable**: Traffic redirection is disabled.</p>
         */
        @NameInMap("SyncStatus")
        public String syncStatus;

        /**
         * <p>This parameter is deprecated.</p>
         */
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

        public DescribeAssetListResponseBodyAssets setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
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

        public DescribeAssetListResponseBodyAssets setNewResourceTag(String newResourceTag) {
            this.newResourceTag = newResourceTag;
            return this;
        }
        public String getNewResourceTag() {
            return this.newResourceTag;
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
