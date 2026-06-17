// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListResponseBody extends TeaModel {
    /**
     * <p>The details of the assets protected by Cloud Firewall.</p>
     */
    @NameInMap("Assets")
    public java.util.List<DescribeAssetListResponseBodyAssets> assets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of assets protected by Cloud Firewall.</p>
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
         * <p>The UID of the management account to which the member account belongs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>158039427902****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the instance that is associated with the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdrjrxzt78****</p>
         */
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        /**
         * <p>The name of the instance that is associated with the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>instance01</p>
         */
        @NameInMap("BindInstanceName")
        public String bindInstanceName;

        /**
         * <p>The time when the asset was discovered by Cloud Firewall, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-28 10:29:58</p>
         */
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        /**
         * <p>The public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>The private IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The IP version of the asset. Valid values:</p>
         * <p>Values:</p>
         * <ul>
         * <li><p><strong>4</strong>: An IPv4 address.</p>
         * </li>
         * <li><p><strong>6</strong>: An IPv6 address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The amount of outbound traffic from the asset in the last 7 days, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Last7DayOutTrafficBytes")
        public Long last7DayOutTrafficBytes;

        /**
         * <p>The UID of the Cloud Firewall member account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        /**
         * <p>The name of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A tag that indicates how recently the asset was discovered. Valid values:</p>
         * <ul>
         * <li><p><strong>discovered in 1 hour</strong>: The asset was discovered within the last hour.</p>
         * </li>
         * <li><p><strong>discovered in 1 day</strong>: The asset was discovered within the last 24 hours.</p>
         * </li>
         * <li><p><strong>discovered in 7 days</strong>: The asset was discovered within the last 7 days.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>discovered in 1 hour</p>
         */
        @NameInMap("NewResourceTag")
        public String newResourceTag;

        /**
         * <p>Additional information about the asset. Valid values:</p>
         * <ul>
         * <li><p><strong>REGION_NOT_SUPPORT</strong>: The region is not supported.</p>
         * </li>
         * <li><p><strong>NETWORK_NOT_SUPPORT</strong>: The network type is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGION_NOT_SUPPORT</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The protection status of the asset. Valid values:</p>
         * <ul>
         * <li><p><strong>open</strong>: Protected.</p>
         * </li>
         * <li><p><strong>opening</strong>: Enabling protection.</p>
         * </li>
         * <li><p><strong>closed</strong>: Not protected.</p>
         * </li>
         * <li><p><strong>closing</strong>: Disabling protection.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("ProtectStatus")
        public String protectStatus;

        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>Indicates whether the asset\&quot;s region supports Cloud Firewall protection. Valid values:</p>
         * <ul>
         * <li><p><strong>enable</strong>: Supported.</p>
         * </li>
         * <li><p><strong>disable</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        /**
         * <p>The ID of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdrjrxzt78****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><p><strong>BastionHostEgressIP</strong>: The egress IP address of a bastion host.</p>
         * </li>
         * <li><p><strong>BastionHostIngressIP</strong>: The ingress IP address of a bastion host.</p>
         * </li>
         * <li><p><strong>EcsEIP</strong>: The EIP of an ECS instance.</p>
         * </li>
         * <li><p><strong>EcsPublicIP</strong>: The public IP address of an ECS instance.</p>
         * </li>
         * <li><p><strong>EIP</strong>: A standalone EIP.</p>
         * </li>
         * <li><p><strong>EniEIP</strong>: The EIP of an elastic network interface (ENI).</p>
         * </li>
         * <li><p><strong>NatEIP</strong>: The EIP of a NAT gateway.</p>
         * </li>
         * <li><p><strong>SlbEIP</strong>: The EIP of a Classic Load Balancer (CLB) instance.</p>
         * </li>
         * <li><p><strong>SlbPublicIP</strong>: The public IP address of a Classic Load Balancer (CLB) instance.</p>
         * </li>
         * <li><p><strong>NatPublicIP</strong>: The public IP address of a NAT gateway.</p>
         * </li>
         * <li><p><strong>HAVIP</strong>: A high-availability virtual IP (HAVIP).</p>
         * </li>
         * <li><p><strong>NlbEIP</strong>: The EIP of a Network Load Balancer (NLB) instance.</p>
         * </li>
         * <li><p><strong>ApiGatewayEIP</strong>: The EIP of an API Gateway instance.</p>
         * </li>
         * <li><p><strong>AlbEIP</strong>: The EIP of an Application Load Balancer (ALB) instance.</p>
         * </li>
         * <li><p><strong>AiGatewayEIP</strong>: The EIP of an AI Gateway instance.</p>
         * </li>
         * <li><p><strong>GaEIP</strong>: The EIP of a Global Accelerator (GA) instance.</p>
         * </li>
         * <li><p><strong>SwasEIP</strong>: The public IP address of a Simple Application Server instance.</p>
         * </li>
         * <li><p><strong>EcdEIP</strong>: The public IP address of an Elastic Desktop Service (EDS) instance.</p>
         * </li>
         * <li><p><strong>BastionHostIP</strong>: The IP address of a bastion host.</p>
         * </li>
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
         * <li><p><strong>low</strong>: Low risk.</p>
         * </li>
         * <li><p><strong>middle</strong>: Medium risk.</p>
         * </li>
         * <li><p><strong>high</strong>: High risk.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if the <code>UserType</code> parameter is set to <code>free</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>Indicates whether data leak prevention is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("SensitiveDataStatus")
        public String sensitiveDataStatus;

        /**
         * <p>The status of the security group policy. Valid values:</p>
         * <ul>
         * <li><p><strong>pass</strong>: The policy is applied.</p>
         * </li>
         * <li><p><strong>block</strong>: The policy is not applied.</p>
         * </li>
         * <li><p><strong>unsupport</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("SgStatus")
        public String sgStatus;

        /**
         * <p>The timestamp of the last security group status check. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615082937</p>
         */
        @NameInMap("SgStatusTime")
        public Long sgStatusTime;

        /**
         * <p>Indicates whether the asset supports traffic redirection. Valid values:</p>
         * <ul>
         * <li><p><strong>enable</strong>: Traffic redirection is supported.</p>
         * </li>
         * <li><p><strong>disable</strong>: Traffic redirection is not supported.</p>
         * </li>
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
