// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Assets")
    public java.util.List<DescribeAssetListResponseBodyAssets> assets;

    public static DescribeAssetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetListResponseBody self = new DescribeAssetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAssetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetListResponseBody setAssets(java.util.List<DescribeAssetListResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<DescribeAssetListResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public static class DescribeAssetListResponseBodyAssets extends TeaModel {
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("BindInstanceName")
        public String bindInstanceName;

        @NameInMap("Type")
        public String type;

        @NameInMap("SgStatusTime")
        public Long sgStatusTime;

        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        @NameInMap("MemberUid")
        public Long memberUid;

        @NameInMap("IntranetAddress")
        public String intranetAddress;

        @NameInMap("SyncStatus")
        public String syncStatus;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("ProtectStatus")
        public String protectStatus;

        @NameInMap("InternetAddress")
        public String internetAddress;

        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        @NameInMap("RegionID")
        public String regionID;

        @NameInMap("RegionStatus")
        public String regionStatus;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("IpVersion")
        public Integer ipVersion;

        @NameInMap("SgStatus")
        public String sgStatus;

        @NameInMap("Note")
        public String note;

        @NameInMap("Name")
        public String name;

        public static DescribeAssetListResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetListResponseBodyAssets self = new DescribeAssetListResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public DescribeAssetListResponseBodyAssets setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeAssetListResponseBodyAssets setBindInstanceName(String bindInstanceName) {
            this.bindInstanceName = bindInstanceName;
            return this;
        }
        public String getBindInstanceName() {
            return this.bindInstanceName;
        }

        public DescribeAssetListResponseBodyAssets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAssetListResponseBodyAssets setSgStatusTime(Long sgStatusTime) {
            this.sgStatusTime = sgStatusTime;
            return this;
        }
        public Long getSgStatusTime() {
            return this.sgStatusTime;
        }

        public DescribeAssetListResponseBodyAssets setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeAssetListResponseBodyAssets setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

        public DescribeAssetListResponseBodyAssets setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public DescribeAssetListResponseBodyAssets setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public DescribeAssetListResponseBodyAssets setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeAssetListResponseBodyAssets setProtectStatus(String protectStatus) {
            this.protectStatus = protectStatus;
            return this;
        }
        public String getProtectStatus() {
            return this.protectStatus;
        }

        public DescribeAssetListResponseBodyAssets setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public DescribeAssetListResponseBodyAssets setBindInstanceId(String bindInstanceId) {
            this.bindInstanceId = bindInstanceId;
            return this;
        }
        public String getBindInstanceId() {
            return this.bindInstanceId;
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

        public DescribeAssetListResponseBodyAssets setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeAssetListResponseBodyAssets setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeAssetListResponseBodyAssets setSgStatus(String sgStatus) {
            this.sgStatus = sgStatus;
            return this;
        }
        public String getSgStatus() {
            return this.sgStatus;
        }

        public DescribeAssetListResponseBodyAssets setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeAssetListResponseBodyAssets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
