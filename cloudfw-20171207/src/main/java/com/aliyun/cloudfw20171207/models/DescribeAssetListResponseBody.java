// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListResponseBody extends TeaModel {
    /**
     * <p>The information about assets protected by Cloud Firewall.</p>
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
         * <p>The primary account of the Cloud Firewall member account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>158039427902****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the bound asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdrjrxzt78****</p>
         */
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        /**
         * <p>The name of the bound asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance01</p>
         */
        @NameInMap("BindInstanceName")
        public String bindInstanceName;

        /**
         * <p>The time when Cloud Firewall discovered the asset. Time format: YYYY-MM-DD HH:mm:ss.</p>
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
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The IP address version of the asset protected by Cloud Firewall.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: Indicates an IPv4 address.</p>
         * </li>
         * <li><p><strong>6</strong>: Indicates an IPv6 address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The outbound traffic in the last 7 days.</p>
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
         * <p>The instance name of the asset protected by Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>instance01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the asset was discovered. Valid values:</p>
         * <ul>
         * <li><strong>discovered in 1 hour</strong>: The asset was discovered within 1 hour.</li>
         * <li><strong>discovered in 1 day</strong>: The asset was discovered within 1 day.</li>
         * <li><strong>discovered in 7 days</strong>: The asset was discovered within 7 days.</li>
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
         * <li><strong>REGION_NOT_SUPPORT</strong>: Region not supported.</li>
         * <li><strong>NETWORK_NOT_SUPPORT</strong>: Network not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGION_NOT_SUPPORT</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The firewall status. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: Protected.</li>
         * <li><strong>opening</strong>: Protection enabling.</li>
         * <li><strong>closed</strong>: Not protected.</li>
         * <li><strong>closing</strong>: Protection disabling.</li>
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
         * <p>Indicates whether the region of the asset supports enabling Cloud Firewall protection. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: Supported.</li>
         * <li><strong>disable</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        /**
         * <p>The asset instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdrjrxzt78****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The asset type. Valid values:</p>
         * <ul>
         * <li><strong>BastionHostEgressIP</strong>: Bastion host egress IP.</li>
         * <li><strong>BastionHostIngressIP</strong>: Bastion host ingress IP.</li>
         * <li><strong>EcsEIP</strong>: ECS EIP.</li>
         * <li><strong>EcsPublicIP</strong>: ECS public IP.</li>
         * <li><strong>EIP</strong>: Elastic IP address.</li>
         * <li><strong>EniEIP</strong>: Elastic network interface EIP.</li>
         * <li><strong>NatEIP</strong>: NAT EIP.</li>
         * <li><strong>SlbEIP</strong>: SLB EIP (CLB EIP).</li>
         * <li><strong>SlbPublicIP</strong>: SLB public IP (CLB public IP).</li>
         * <li><strong>NatPublicIP</strong>: NAT public IP.</li>
         * <li><strong>HAVIP</strong>: High-availability virtual IP.</li>
         * <li><strong>NlbEIP</strong>: NLB EIP.</li>
         * <li><strong>ApiGatewayEIP</strong>: API Gateway public IP.</li>
         * <li><strong>AlbEIP</strong>: ALB EIP.</li>
         * <li><strong>AiGatewayEIP</strong>: AI Gateway public IP.</li>
         * <li><strong>GaEIP</strong>: GA EIP.</li>
         * <li><strong>SwasEIP</strong>: Simple Application Server public IP.</li>
         * <li><strong>EcdEIP</strong>: Elastic Desktop Service public IP.</li>
         * <li><strong>BastionHostIP</strong>: Bastion host IP.</li>
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
         * <li><p><strong>hight</strong>: High risk.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when the value of UserType is free.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The status of data leakage detection.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("SensitiveDataStatus")
        public String sensitiveDataStatus;

        /**
         * <p>The security group policy. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: Delivered.</li>
         * <li><strong>block</strong>: Not delivered.</li>
         * <li><strong>unsupport</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("SgStatus")
        public String sgStatus;

        /**
         * <p>The last security group status detection time, in timestamp format. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615082937</p>
         */
        @NameInMap("SgStatusTime")
        public Long sgStatusTime;

        /**
         * <p>The traffic diversion support status of the asset. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: Traffic diversion supported.</li>
         * <li><strong>disable</strong>: Traffic diversion not supported.</li>
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
        @Deprecated
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

        @Deprecated
        public DescribeAssetListResponseBodyAssets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
