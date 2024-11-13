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
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the assets that are protected by Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
         * <blockquote>
         * <p> The value of this parameter indicates the management account to which the member is added.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>158039427902****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the cloud resource with which the asset is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdrjrxzt78****</p>
         */
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        /**
         * <p>The instance name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>instance01</p>
         */
        @NameInMap("BindInstanceName")
        public String bindInstanceName;

        /**
         * <p>The timestamp when the asset is added to Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-28 10:29:58</p>
         */
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>The internal IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The IP version of the asset that is protected by Cloud Firewall.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4</li>
         * <li><strong>6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        @NameInMap("Last7DayOutTrafficBytes")
        public Long last7DayOutTrafficBytes;

        /**
         * <p>The UID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        /**
         * <p>The instance name of the asset that is protected by Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>instance01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the asset was added. Valid values:</p>
         * <ul>
         * <li><strong>discovered in 1 hour</strong>: within one hour.</li>
         * <li><strong>discovered in 1 day</strong>: within one day.</li>
         * <li><strong>discovered in 7 days</strong>: within seven days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>discovered in 1 hour</p>
         */
        @NameInMap("NewResourceTag")
        public String newResourceTag;

        /**
         * <p>The remarks of the asset. Valid values:</p>
         * <ul>
         * <li><strong>REGION_NOT_SUPPORT</strong>: The region is not supported.</li>
         * <li><strong>NETWORK_NOT_SUPPORT</strong>: The network is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGION_NOT_SUPPORT</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The status of the firewall. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: enabled.</li>
         * <li><strong>opening</strong>: being enabled.</li>
         * <li><strong>closed</strong>: disabled.</li>
         * <li><strong>closing</strong>: being disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("ProtectStatus")
        public String protectStatus;

        /**
         * <p>The ID of the region in which the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>Indicates whether the firewall is supported in the region in which the asset resides. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdrjrxzt78****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>BastionHostEgressIP</strong>: the egress IP address of a bastion host</li>
         * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
         * <li><strong>EcsEIP</strong>: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</li>
         * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
         * <li><strong>EIP</strong>: the EIP</li>
         * <li><strong>EniEIP</strong>: the EIP of an elastic network interface (ENI)</li>
         * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
         * <li><strong>SlbEIP</strong>: the EIP of a Server Load Balancer (SLB) instance</li>
         * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance</li>
         * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
         * <li><strong>HAVIP</strong>: the high-availability virtual IP address (HAVIP)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The risk level of the asset. Valid values:</p>
         * <ul>
         * <li><strong>low</strong>: low</li>
         * <li><strong>middle</strong>: medium</li>
         * <li><strong>hight</strong>: high</li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter is returned only when the UserType parameter is set to free.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("SensitiveDataStatus")
        public String sensitiveDataStatus;

        /**
         * <p>The status of the security group policy. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: applied</li>
         * <li><strong>block</strong>: not applied</li>
         * <li><strong>unsupport</strong>: unsupported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("SgStatus")
        public String sgStatus;

        /**
         * <p>The time when the status of the security group was last checked. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615082937</p>
         */
        @NameInMap("SgStatusTime")
        public Long sgStatusTime;

        /**
         * <p>Indicates whether traffic redirection is supported for the asset. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("SyncStatus")
        public String syncStatus;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>eip</p>
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

        public DescribeAssetListResponseBodyAssets setLast7DayOutTrafficBytes(Long last7DayOutTrafficBytes) {
            this.last7DayOutTrafficBytes = last7DayOutTrafficBytes;
            return this;
        }
        public Long getLast7DayOutTrafficBytes() {
            return this.last7DayOutTrafficBytes;
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

        public DescribeAssetListResponseBodyAssets setSensitiveDataStatus(String sensitiveDataStatus) {
            this.sensitiveDataStatus = sensitiveDataStatus;
            return this;
        }
        public String getSensitiveDataStatus() {
            return this.sensitiveDataStatus;
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
